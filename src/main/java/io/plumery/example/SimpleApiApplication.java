package io.plumery.example;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import io.plumery.example.resources.SimpleApi;

public class SimpleApiApplication extends Application<SimpleApiConfiguration>{
    public static void main(String[] args) throws Exception {
        new SimpleApiApplication().run(args);
    }

    public void run(SimpleApiConfiguration simpleApiConfiguration, Environment environment) throws Exception {
        environment.jersey().register(new SimpleApi());
    }
}
