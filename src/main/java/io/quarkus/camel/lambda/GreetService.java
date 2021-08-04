package io.quarkus.camel.lambda;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named("greetService")
@ApplicationScoped
public class GreetService {

    public String greet(String name){
        return String.format("Hello %s ! How are you? from GreetService",name);
    }
}
