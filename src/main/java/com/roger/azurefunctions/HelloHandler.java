package com.stackroute.uberservice;

import com.microsoft.azure.functions.*;
import com.microsoft.azure.functions.annotation.*;
import org.springframework.cloud.function.adapter.azure.AzureSpringBootRequestHandler;

import java.util.Optional;
import com.stackroute.uberservice.model.Greeting;
import com.stackroute.uberservice.model.User;


public class HelloHandler extends AzureSpringBootRequestHandler<User, Greeting> {

    @FunctionName("firstspringboot")
    public HttpResponseMessage execute(
            @HttpTrigger(name = "request",
                    methods = {HttpMethod.GET, HttpMethod.POST},
                    authLevel = AuthorizationLevel.ANONYMOUS) HttpRequestMessage<Optional<User>> request,
            ExecutionContext context) {
        User user = request.getBody()
                .filter((u -> u.getName() != null))
                .orElseGet(() -> new User(
                        request.getQueryParameters()
                                .getOrDefault("name", "<no name supplied> please provide a name as " +
                                        "either a query string parameter or in a POST body")));
        context.getLogger().info("Greeting user name: " + user.getName());
        return request
                .createResponseBuilder(HttpStatus.OK)
                .body(handleRequest(user, context))
                .header("Content-Type", "application/json")
                .build();
    }

    @FunctionName("secondspringboot")
    public HttpResponseMessage executesecond(
            @HttpTrigger(name = "request",
                    methods = {HttpMethod.GET, HttpMethod.POST},
                    authLevel = AuthorizationLevel.ANONYMOUS) HttpRequestMessage<Optional<User>> request,
            ExecutionContext context) {
        User user = request.getBody()
                .filter((u -> u.getName() != null))
                .orElseGet(() -> new User(
                        request.getQueryParameters()
                                .getOrDefault("name", "<no name supplied> please provide a name as " +
                                        "either a query string parameter or in a POST body")));
        context.getLogger().info("Greeting user name: " + user.getName());
        return request
                .createResponseBuilder(HttpStatus.OK)
                .body(handleRequest(user, context))
                .header("Content-Type", "application/json")
                .build();
    }


}
