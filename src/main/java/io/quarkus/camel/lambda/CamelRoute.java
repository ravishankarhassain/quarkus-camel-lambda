package io.quarkus.camel.lambda;

import org.apache.camel.builder.RouteBuilder;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class CamelRoute extends RouteBuilder {

    @Inject
    GreetService greetService;

    @Override
    public void configure() throws Exception {
        from("direct:input").routeId("Test")
           .log("Inside Camel Route Received Payload ==> ${body}")
           .bean(greetService,"greet(${body.name})")
        .end();
    }
}