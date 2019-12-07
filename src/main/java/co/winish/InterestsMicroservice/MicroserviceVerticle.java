package co.winish.InterestsMicroservice;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.json.JsonObject;
import io.vertx.servicediscovery.ServiceDiscovery;
import io.vertx.servicediscovery.ServiceDiscoveryOptions;

public class MicroserviceVerticle extends AbstractVerticle {

    private ServiceDiscovery mServiceDiscovery;



    protected void createServiceDiscovery() {
        /*JsonObject config = config();
        ServiceDiscoveryOptions options = new ServiceDiscoveryOptions()
                .setBackendConfiguration(config);
        */
        ServiceDiscoveryOptions options = new ServiceDiscoveryOptions().setAnnounceAddress("service-announce").setName("microservice-name");
        mServiceDiscovery = ServiceDiscovery.create(vertx, options);

    }
}
