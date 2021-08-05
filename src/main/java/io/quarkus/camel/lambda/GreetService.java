package io.quarkus.camel.lambda;

import io.quarkus.runtime.annotations.RegisterForReflection;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@ApplicationScoped
@RegisterForReflection
public class GreetService {

    public String greet(String name){
        return String.format("Hello %s ! How are you? from GreetService",name);
    }
}
