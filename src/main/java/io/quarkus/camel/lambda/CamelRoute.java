package io.quarkus.camel.lambda;

import org.apache.camel.builder.RouteBuilder;

public class CamelRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("direct:input").routeId("Test")
                .log("Received ==> ${body}")
                .transform().simple("Holla ${body.name} ! How are you? I am from Camel")
        .end();
    }
}
