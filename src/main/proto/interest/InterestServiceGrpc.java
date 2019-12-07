package interest;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.20.0)",
    comments = "Source: interest.proto")
public final class InterestServiceGrpc {

  private InterestServiceGrpc() {}

  private static <T> io.grpc.stub.StreamObserver<T> toObserver(final io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> handler) {
    return new io.grpc.stub.StreamObserver<T>() {
      private volatile boolean resolved = false;
      @Override
      public void onNext(T value) {
        if (!resolved) {
          resolved = true;
          handler.handle(io.vertx.core.Future.succeededFuture(value));
        }
      }

      @Override
      public void onError(Throwable t) {
        if (!resolved) {
          resolved = true;
          handler.handle(io.vertx.core.Future.failedFuture(t));
        }
      }

      @Override
      public void onCompleted() {
        if (!resolved) {
          resolved = true;
          handler.handle(io.vertx.core.Future.succeededFuture());
        }
      }
    };
  }

  public static final String SERVICE_NAME = "InterestService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Interest.GetUserInterestsRequest,
      Interest.GetUserInterestsResponse> getGetUserInterestsMethod;

  public static io.grpc.MethodDescriptor<Interest.GetUserInterestsRequest,
      Interest.GetUserInterestsResponse> getGetUserInterestsMethod() {
    io.grpc.MethodDescriptor<Interest.GetUserInterestsRequest, Interest.GetUserInterestsResponse> getGetUserInterestsMethod;
    if ((getGetUserInterestsMethod = InterestServiceGrpc.getGetUserInterestsMethod) == null) {
      synchronized (InterestServiceGrpc.class) {
        if ((getGetUserInterestsMethod = InterestServiceGrpc.getGetUserInterestsMethod) == null) {
          InterestServiceGrpc.getGetUserInterestsMethod = getGetUserInterestsMethod = 
              io.grpc.MethodDescriptor.<Interest.GetUserInterestsRequest, Interest.GetUserInterestsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "InterestService", "GetUserInterests"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Interest.GetUserInterestsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Interest.GetUserInterestsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new InterestServiceMethodDescriptorSupplier("GetUserInterests"))
                  .build();
          }
        }
     }
     return getGetUserInterestsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Interest.AddUserInterestRequest,
      Interest.AddUserInterestResponse> getAddUserInterestMethod;

  public static io.grpc.MethodDescriptor<Interest.AddUserInterestRequest,
      Interest.AddUserInterestResponse> getAddUserInterestMethod() {
    io.grpc.MethodDescriptor<Interest.AddUserInterestRequest, Interest.AddUserInterestResponse> getAddUserInterestMethod;
    if ((getAddUserInterestMethod = InterestServiceGrpc.getAddUserInterestMethod) == null) {
      synchronized (InterestServiceGrpc.class) {
        if ((getAddUserInterestMethod = InterestServiceGrpc.getAddUserInterestMethod) == null) {
          InterestServiceGrpc.getAddUserInterestMethod = getAddUserInterestMethod = 
              io.grpc.MethodDescriptor.<Interest.AddUserInterestRequest, Interest.AddUserInterestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "InterestService", "AddUserInterest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Interest.AddUserInterestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Interest.AddUserInterestResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new InterestServiceMethodDescriptorSupplier("AddUserInterest"))
                  .build();
          }
        }
     }
     return getAddUserInterestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Interest.DeleteUserInterestRequest,
      Interest.DeleteUserInterestResponse> getDeleteUserInterestMethod;

  public static io.grpc.MethodDescriptor<Interest.DeleteUserInterestRequest,
      Interest.DeleteUserInterestResponse> getDeleteUserInterestMethod() {
    io.grpc.MethodDescriptor<Interest.DeleteUserInterestRequest, Interest.DeleteUserInterestResponse> getDeleteUserInterestMethod;
    if ((getDeleteUserInterestMethod = InterestServiceGrpc.getDeleteUserInterestMethod) == null) {
      synchronized (InterestServiceGrpc.class) {
        if ((getDeleteUserInterestMethod = InterestServiceGrpc.getDeleteUserInterestMethod) == null) {
          InterestServiceGrpc.getDeleteUserInterestMethod = getDeleteUserInterestMethod = 
              io.grpc.MethodDescriptor.<Interest.DeleteUserInterestRequest, Interest.DeleteUserInterestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "InterestService", "DeleteUserInterest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Interest.DeleteUserInterestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Interest.DeleteUserInterestResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new InterestServiceMethodDescriptorSupplier("DeleteUserInterest"))
                  .build();
          }
        }
     }
     return getDeleteUserInterestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Interest.GetPopularInterestsRequest,
      Interest.GetPopularInterestsResponse> getGetPopularInterestsMethod;

  public static io.grpc.MethodDescriptor<Interest.GetPopularInterestsRequest,
      Interest.GetPopularInterestsResponse> getGetPopularInterestsMethod() {
    io.grpc.MethodDescriptor<Interest.GetPopularInterestsRequest, Interest.GetPopularInterestsResponse> getGetPopularInterestsMethod;
    if ((getGetPopularInterestsMethod = InterestServiceGrpc.getGetPopularInterestsMethod) == null) {
      synchronized (InterestServiceGrpc.class) {
        if ((getGetPopularInterestsMethod = InterestServiceGrpc.getGetPopularInterestsMethod) == null) {
          InterestServiceGrpc.getGetPopularInterestsMethod = getGetPopularInterestsMethod = 
              io.grpc.MethodDescriptor.<Interest.GetPopularInterestsRequest, Interest.GetPopularInterestsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "InterestService", "GetPopularInterests"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Interest.GetPopularInterestsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Interest.GetPopularInterestsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new InterestServiceMethodDescriptorSupplier("GetPopularInterests"))
                  .build();
          }
        }
     }
     return getGetPopularInterestsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InterestServiceStub newStub(io.grpc.Channel channel) {
    return new InterestServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InterestServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new InterestServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InterestServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new InterestServiceFutureStub(channel);
  }

  /**
   * Creates a new vertx stub that supports all call types for the service
   */
  public static InterestServiceVertxStub newVertxStub(io.grpc.Channel channel) {
    return new InterestServiceVertxStub(channel);
  }

  /**
   */
  public static abstract class InterestServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getUserInterests(Interest.GetUserInterestsRequest request,
                                 io.grpc.stub.StreamObserver<Interest.GetUserInterestsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserInterestsMethod(), responseObserver);
    }

    /**
     */
    public void addUserInterest(Interest.AddUserInterestRequest request,
                                io.grpc.stub.StreamObserver<Interest.AddUserInterestResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddUserInterestMethod(), responseObserver);
    }

    /**
     */
    public void deleteUserInterest(Interest.DeleteUserInterestRequest request,
                                   io.grpc.stub.StreamObserver<Interest.DeleteUserInterestResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteUserInterestMethod(), responseObserver);
    }

    /**
     */
    public void getPopularInterests(Interest.GetPopularInterestsRequest request,
                                    io.grpc.stub.StreamObserver<Interest.GetPopularInterestsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPopularInterestsMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetUserInterestsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Interest.GetUserInterestsRequest,
                Interest.GetUserInterestsResponse>(
                  this, METHODID_GET_USER_INTERESTS)))
          .addMethod(
            getAddUserInterestMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Interest.AddUserInterestRequest,
                Interest.AddUserInterestResponse>(
                  this, METHODID_ADD_USER_INTEREST)))
          .addMethod(
            getDeleteUserInterestMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Interest.DeleteUserInterestRequest,
                Interest.DeleteUserInterestResponse>(
                  this, METHODID_DELETE_USER_INTEREST)))
          .addMethod(
            getGetPopularInterestsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Interest.GetPopularInterestsRequest,
                Interest.GetPopularInterestsResponse>(
                  this, METHODID_GET_POPULAR_INTERESTS)))
          .build();
    }
  }

  /**
   */
  public static final class InterestServiceStub extends io.grpc.stub.AbstractStub<InterestServiceStub> {
    public InterestServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    public InterestServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected InterestServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InterestServiceStub(channel, callOptions);
    }

    /**
     */
    public void getUserInterests(Interest.GetUserInterestsRequest request,
                                 io.grpc.stub.StreamObserver<Interest.GetUserInterestsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserInterestsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addUserInterest(Interest.AddUserInterestRequest request,
                                io.grpc.stub.StreamObserver<Interest.AddUserInterestResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddUserInterestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteUserInterest(Interest.DeleteUserInterestRequest request,
                                   io.grpc.stub.StreamObserver<Interest.DeleteUserInterestResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteUserInterestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPopularInterests(Interest.GetPopularInterestsRequest request,
                                    io.grpc.stub.StreamObserver<Interest.GetPopularInterestsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPopularInterestsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class InterestServiceBlockingStub extends io.grpc.stub.AbstractStub<InterestServiceBlockingStub> {
    public InterestServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    public InterestServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected InterestServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InterestServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public Interest.GetUserInterestsResponse getUserInterests(Interest.GetUserInterestsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserInterestsMethod(), getCallOptions(), request);
    }

    /**
     */
    public Interest.AddUserInterestResponse addUserInterest(Interest.AddUserInterestRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddUserInterestMethod(), getCallOptions(), request);
    }

    /**
     */
    public Interest.DeleteUserInterestResponse deleteUserInterest(Interest.DeleteUserInterestRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteUserInterestMethod(), getCallOptions(), request);
    }

    /**
     */
    public Interest.GetPopularInterestsResponse getPopularInterests(Interest.GetPopularInterestsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPopularInterestsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class InterestServiceFutureStub extends io.grpc.stub.AbstractStub<InterestServiceFutureStub> {
    public InterestServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    public InterestServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected InterestServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InterestServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Interest.GetUserInterestsResponse> getUserInterests(
        Interest.GetUserInterestsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserInterestsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Interest.AddUserInterestResponse> addUserInterest(
        Interest.AddUserInterestRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddUserInterestMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Interest.DeleteUserInterestResponse> deleteUserInterest(
        Interest.DeleteUserInterestRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteUserInterestMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Interest.GetPopularInterestsResponse> getPopularInterests(
        Interest.GetPopularInterestsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPopularInterestsMethod(), getCallOptions()), request);
    }
  }

  /**
   */
  public static abstract class InterestServiceVertxImplBase implements io.grpc.BindableService {

    /**
     */
    public void getUserInterests(Interest.GetUserInterestsRequest request,
                                 io.vertx.core.Promise<Interest.GetUserInterestsResponse> response) {
      asyncUnimplementedUnaryCall(getGetUserInterestsMethod(), InterestServiceGrpc.toObserver(response));
    }

    /**
     */
    public void addUserInterest(Interest.AddUserInterestRequest request,
                                io.vertx.core.Promise<Interest.AddUserInterestResponse> response) {
      asyncUnimplementedUnaryCall(getAddUserInterestMethod(), InterestServiceGrpc.toObserver(response));
    }

    /**
     */
    public void deleteUserInterest(Interest.DeleteUserInterestRequest request,
                                   io.vertx.core.Promise<Interest.DeleteUserInterestResponse> response) {
      asyncUnimplementedUnaryCall(getDeleteUserInterestMethod(), InterestServiceGrpc.toObserver(response));
    }

    /**
     */
    public void getPopularInterests(Interest.GetPopularInterestsRequest request,
                                    io.vertx.core.Promise<Interest.GetPopularInterestsResponse> response) {
      asyncUnimplementedUnaryCall(getGetPopularInterestsMethod(), InterestServiceGrpc.toObserver(response));
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetUserInterestsMethod(),
            asyncUnaryCall(
              new VertxMethodHandlers<
                Interest.GetUserInterestsRequest,
                Interest.GetUserInterestsResponse>(
                  this, METHODID_GET_USER_INTERESTS)))
          .addMethod(
            getAddUserInterestMethod(),
            asyncUnaryCall(
              new VertxMethodHandlers<
                Interest.AddUserInterestRequest,
                Interest.AddUserInterestResponse>(
                  this, METHODID_ADD_USER_INTEREST)))
          .addMethod(
            getDeleteUserInterestMethod(),
            asyncUnaryCall(
              new VertxMethodHandlers<
                Interest.DeleteUserInterestRequest,
                Interest.DeleteUserInterestResponse>(
                  this, METHODID_DELETE_USER_INTEREST)))
          .addMethod(
            getGetPopularInterestsMethod(),
            asyncUnaryCall(
              new VertxMethodHandlers<
                Interest.GetPopularInterestsRequest,
                Interest.GetPopularInterestsResponse>(
                  this, METHODID_GET_POPULAR_INTERESTS)))
          .build();
    }
  }

  /**
   */
  public static final class InterestServiceVertxStub extends io.grpc.stub.AbstractStub<InterestServiceVertxStub> {
    public InterestServiceVertxStub(io.grpc.Channel channel) {
      super(channel);
    }

    public InterestServiceVertxStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected InterestServiceVertxStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InterestServiceVertxStub(channel, callOptions);
    }

    /**
     */
    public void getUserInterests(Interest.GetUserInterestsRequest request,
                                 io.vertx.core.Handler<io.vertx.core.AsyncResult<Interest.GetUserInterestsResponse>> response) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserInterestsMethod(), getCallOptions()), request, InterestServiceGrpc.toObserver(response));
    }

    /**
     */
    public void addUserInterest(Interest.AddUserInterestRequest request,
                                io.vertx.core.Handler<io.vertx.core.AsyncResult<Interest.AddUserInterestResponse>> response) {
      asyncUnaryCall(
          getChannel().newCall(getAddUserInterestMethod(), getCallOptions()), request, InterestServiceGrpc.toObserver(response));
    }

    /**
     */
    public void deleteUserInterest(Interest.DeleteUserInterestRequest request,
                                   io.vertx.core.Handler<io.vertx.core.AsyncResult<Interest.DeleteUserInterestResponse>> response) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteUserInterestMethod(), getCallOptions()), request, InterestServiceGrpc.toObserver(response));
    }

    /**
     */
    public void getPopularInterests(Interest.GetPopularInterestsRequest request,
                                    io.vertx.core.Handler<io.vertx.core.AsyncResult<Interest.GetPopularInterestsResponse>> response) {
      asyncUnaryCall(
          getChannel().newCall(getGetPopularInterestsMethod(), getCallOptions()), request, InterestServiceGrpc.toObserver(response));
    }
  }

  private static final int METHODID_GET_USER_INTERESTS = 0;
  private static final int METHODID_ADD_USER_INTEREST = 1;
  private static final int METHODID_DELETE_USER_INTEREST = 2;
  private static final int METHODID_GET_POPULAR_INTERESTS = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final InterestServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(InterestServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_USER_INTERESTS:
          serviceImpl.getUserInterests((Interest.GetUserInterestsRequest) request,
              (io.grpc.stub.StreamObserver<Interest.GetUserInterestsResponse>) responseObserver);
          break;
        case METHODID_ADD_USER_INTEREST:
          serviceImpl.addUserInterest((Interest.AddUserInterestRequest) request,
              (io.grpc.stub.StreamObserver<Interest.AddUserInterestResponse>) responseObserver);
          break;
        case METHODID_DELETE_USER_INTEREST:
          serviceImpl.deleteUserInterest((Interest.DeleteUserInterestRequest) request,
              (io.grpc.stub.StreamObserver<Interest.DeleteUserInterestResponse>) responseObserver);
          break;
        case METHODID_GET_POPULAR_INTERESTS:
          serviceImpl.getPopularInterests((Interest.GetPopularInterestsRequest) request,
              (io.grpc.stub.StreamObserver<Interest.GetPopularInterestsResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class VertxMethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final InterestServiceVertxImplBase serviceImpl;
    private final int methodId;

    VertxMethodHandlers(InterestServiceVertxImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_USER_INTERESTS:
          serviceImpl.getUserInterests((Interest.GetUserInterestsRequest) request,
              (io.vertx.core.Promise<Interest.GetUserInterestsResponse>) io.vertx.core.Promise.<Interest.GetUserInterestsResponse>promise().future().setHandler(ar -> {
                if (ar.succeeded()) {
                  ((io.grpc.stub.StreamObserver<Interest.GetUserInterestsResponse>) responseObserver).onNext(ar.result());
                  responseObserver.onCompleted();
                } else {
                  responseObserver.onError(ar.cause());
                }
              }));
          break;
        case METHODID_ADD_USER_INTEREST:
          serviceImpl.addUserInterest((Interest.AddUserInterestRequest) request,
              (io.vertx.core.Promise<Interest.AddUserInterestResponse>) io.vertx.core.Promise.<Interest.AddUserInterestResponse>promise().future().setHandler(ar -> {
                if (ar.succeeded()) {
                  ((io.grpc.stub.StreamObserver<Interest.AddUserInterestResponse>) responseObserver).onNext(ar.result());
                  responseObserver.onCompleted();
                } else {
                  responseObserver.onError(ar.cause());
                }
              }));
          break;
        case METHODID_DELETE_USER_INTEREST:
          serviceImpl.deleteUserInterest((Interest.DeleteUserInterestRequest) request,
              (io.vertx.core.Promise<Interest.DeleteUserInterestResponse>) io.vertx.core.Promise.<Interest.DeleteUserInterestResponse>promise().future().setHandler(ar -> {
                if (ar.succeeded()) {
                  ((io.grpc.stub.StreamObserver<Interest.DeleteUserInterestResponse>) responseObserver).onNext(ar.result());
                  responseObserver.onCompleted();
                } else {
                  responseObserver.onError(ar.cause());
                }
              }));
          break;
        case METHODID_GET_POPULAR_INTERESTS:
          serviceImpl.getPopularInterests((Interest.GetPopularInterestsRequest) request,
              (io.vertx.core.Promise<Interest.GetPopularInterestsResponse>) io.vertx.core.Promise.<Interest.GetPopularInterestsResponse>promise().future().setHandler(ar -> {
                if (ar.succeeded()) {
                  ((io.grpc.stub.StreamObserver<Interest.GetPopularInterestsResponse>) responseObserver).onNext(ar.result());
                  responseObserver.onCompleted();
                } else {
                  responseObserver.onError(ar.cause());
                }
              }));
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class InterestServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InterestServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Interest.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InterestService");
    }
  }

  private static final class InterestServiceFileDescriptorSupplier
      extends InterestServiceBaseDescriptorSupplier {
    InterestServiceFileDescriptorSupplier() {}
  }

  private static final class InterestServiceMethodDescriptorSupplier
      extends InterestServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    InterestServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (InterestServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InterestServiceFileDescriptorSupplier())
              .addMethod(getGetUserInterestsMethod())
              .addMethod(getAddUserInterestMethod())
              .addMethod(getDeleteUserInterestMethod())
              .addMethod(getGetPopularInterestsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
