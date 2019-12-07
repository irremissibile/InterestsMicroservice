package co.winish.InterestsMicroservice;

import io.vertx.core.Promise;
import io.vertx.core.json.JsonObject;

import java.util.ArrayList;
import java.util.List;

public class InterestsVerticle  extends MicroserviceVerticle {

    public static final String EBA_INTEREST_FETCH = "interests:fetch";
    public static final String EBA_INTEREST_ADD = "interests:add";
    public static final String EBA_INTEREST_DELETE = "interests:delete";
    public static final String EBA_INTEREST_POPULAR = "interests:popular";


    @Override
    public void start(Promise<Void> startPromise) {
        createServiceDiscovery();

        setupFetchListener();
        setupAddListener();
        setupDeleteListener();
        setupPopularListener();
    }


    //attempt to return a list
    private void setupFetchListener() {
        vertx.eventBus().<JsonObject>consumer(EBA_INTEREST_FETCH, handler -> {
            List<String> interests = new ArrayList<>();
            interests.add("123");
            interests.add("234");
            interests.add("345");

            handler.reply(interests);
        });
    }


    private void setupPopularListener() {
        vertx.eventBus().<JsonObject>consumer(EBA_INTEREST_POPULAR, handler -> {
            List<String> interests = new ArrayList<>();
            interests.add("pop");
            interests.add("ula");
            interests.add("rrr");

            handler.reply(interests);
        });
    }


    private void setupAddListener() {
        vertx.eventBus().<JsonObject>consumer(EBA_INTEREST_ADD, handler -> {

        });
    }


    private void setupDeleteListener() {
        vertx.eventBus().<JsonObject>consumer(EBA_INTEREST_DELETE, handler -> {

        });
    }
}
