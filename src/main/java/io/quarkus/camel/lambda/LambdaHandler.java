package io.quarkus.camel.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.apache.camel.CamelContext;

import javax.inject.Inject;
import javax.inject.Named;

@Named("lambdaHandler")
public class LambdaHandler implements RequestHandler<Person, String> {

    @Inject
    CamelContext camelContext;

    @Override
    public String handleRequest(Person input, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("Calling Camel Route :)");
        return camelContext.createProducerTemplate().requestBody("direct:input", input, String.class);
    }
}
