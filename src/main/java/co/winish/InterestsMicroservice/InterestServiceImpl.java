package co.winish.InterestsMicroservice;

import com.google.rpc.Code;
import com.google.rpc.Status;
import interest.InterestServiceGrpc;
import interest.Interest;

import io.grpc.StatusException;
import io.grpc.protobuf.StatusProto;
import io.grpc.stub.StreamObserver;
import io.vertx.core.Vertx;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonObject;

import javax.annotation.Nonnull;

import java.util.List;

import static co.winish.InterestsMicroservice.InterestsVerticle.*;


public class InterestServiceImpl extends InterestServiceGrpc.InterestServiceImplBase {

    private final Vertx mVertx;

    public InterestServiceImpl(@Nonnull Vertx vertx) {
        mVertx = vertx;
    }



    @Override
    public void getUserInterests(Interest.GetUserInterestsRequest request,
                                 StreamObserver<Interest.GetUserInterestsResponse> responseStreamObserver) {
        JsonObject json = new JsonObject();
        json.put("username", request.getUsername());

        mVertx.eventBus().request(EBA_INTEREST_FETCH, json, ar -> {
            if (ar.failed()) {
                StatusException failure = failed(ar.cause());
                responseStreamObserver.onError(failure);
                return;
            }

            //Attempt to get a list
            List<String> userInterests = (List<String>) ar.result().body();
            Interest.GetUserInterestsResponse response = Interest.GetUserInterestsResponse.newBuilder()
                    .addAllInterests(userInterests)
                    .build();

            responseStreamObserver.onNext(response);
            responseStreamObserver.onCompleted();
        });
    }



    @Override
    public void deleteUserInterest(Interest.DeleteUserInterestRequest request,
                                   StreamObserver<Interest.DeleteUserInterestResponse> responseStreamObserver) {
        JsonObject json = new JsonObject();
        json.put("username", request.getUsername());
        json.put("interest", request.getInterest());

        mVertx.eventBus().request(EBA_INTEREST_ADD, json, ar -> {
            if (ar.failed()) {
                StatusException failure = failed(ar.cause());
                responseStreamObserver.onError(failure);
                return;
            }

            Interest.DeleteUserInterestResponse response = Interest.DeleteUserInterestResponse.newBuilder()
                    .setSuccess(true)
                    .build();

            responseStreamObserver.onNext(response);
            responseStreamObserver.onCompleted();

        });
    }


    @Override
    public void addUserInterest(Interest.AddUserInterestRequest request,
                                StreamObserver<Interest.AddUserInterestResponse> responseStreamObserver) {
        JsonObject json = new JsonObject();
        json.put("username", request.getUsername());
        json.put("interest", request.getInterest());

        mVertx.eventBus().request(EBA_INTEREST_ADD, json, ar -> {
            if (ar.failed()) {
                StatusException failure = failed(ar.cause());
                responseStreamObserver.onError(failure);
                return;
            }

            Interest.AddUserInterestResponse response = Interest.AddUserInterestResponse.newBuilder()
                    .setSuccess(true)
                    .build();

            responseStreamObserver.onNext(response);
            responseStreamObserver.onCompleted();
        });
    }


    @Override
    public void getPopularInterests(Interest.GetPopularInterestsRequest request,
                                StreamObserver<Interest.GetPopularInterestsResponse> responseStreamObserver) {
        mVertx.eventBus().request(EBA_INTEREST_ADD, new JsonObject(), ar -> {
            if (ar.failed()) {
                StatusException failure = failed(ar.cause());
                responseStreamObserver.onError(failure);
                return;
            }

            List<String> popularInterests = (List<String>) ar.result().body();
            Interest.GetPopularInterestsResponse response = Interest.GetPopularInterestsResponse.newBuilder()
                    .addAllInterests(popularInterests)
                    .build();

            responseStreamObserver.onNext(response);
            responseStreamObserver.onCompleted();
        });
    }


    private StatusException failed(Throwable cause) {
        Status status = Status.newBuilder()
                .setCode(Code.UNAVAILABLE_VALUE)
                .setMessage(cause.getMessage())
                .build();

        return StatusProto.toStatusException(status);
    }
}
