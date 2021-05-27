package com.stackroute.uberservice.handler;

import com.microsoft.azure.functions.*;
import com.microsoft.azure.functions.annotation.*;
import com.stackroute.uberservice.dto.ResponseDto;
import com.stackroute.uberservice.model.ProspectiveDriver;
import org.springframework.cloud.function.adapter.azure.AzureSpringBootRequestHandler;

import java.util.Optional;

public class ValidateDriverHandler extends AzureSpringBootRequestHandler<Object, ResponseDto> {

    @FunctionName("validateDriver")
    public ResponseDto valodateDriver(
            @HttpTrigger(name="ValidateDriverRequest",
                    methods={HttpMethod.PUT},
                    route = "enrollments/{enrollmentId}/licenseverification/approve",
                    authLevel = AuthorizationLevel.ANONYMOUS)
                    HttpRequestMessage request,
            @BindingName("enrollmentId") Integer enrollmentId,
            ExecutionContext context
    ){
        return handleRequest(enrollmentId,context);
    }

    @FunctionName("inValidateDriver")
    public ResponseDto invVlodateDriver(
            @HttpTrigger(name="inValidateDriverRequest",
                    methods={HttpMethod.PUT},
                    route = "enrollments/{enrollmentId}/licenseverification/decline",
                    authLevel = AuthorizationLevel.ANONYMOUS)
                    HttpRequestMessage request,
            @BindingName("enrollmentId") Integer enrollmentId,
            ExecutionContext context
    ){
        return handleRequest(enrollmentId,context);
    }


    @FunctionName("sbtopicsend")
    public HttpResponseMessage run(
            @HttpTrigger(name = "req", methods = {HttpMethod.GET, HttpMethod.POST}, authLevel = AuthorizationLevel.ANONYMOUS) HttpRequestMessage<Optional<String>> request,
            @ServiceBusTopicOutput(name = "message",
                    topicName = "rogertopic",
                    subscriptionName = "s1",
                    connection = "TopicConnection")
                    OutputBinding<String> message,
            final ExecutionContext context) {

        String name = request.getBody().orElse("Azure Functions");

        message.setValue(name);
        return request.createResponseBuilder(HttpStatus.OK).body("Hello roger topic , " + name).build();

    }

    @FunctionName("sbtopicprocessor")
    public void getTpoic(
            @ServiceBusTopicTrigger(
                    name = "topicmessage",
                    topicName = "rogertopic",
                    subscriptionName = "s1",
                    connection = "TopicConnection"
            ) String message,
            final ExecutionContext context
    ) {
        context.getLogger().info(message);
    }
}
