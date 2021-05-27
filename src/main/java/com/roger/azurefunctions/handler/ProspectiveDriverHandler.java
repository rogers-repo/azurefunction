package com.stackroute.uberservice.handler;

import com.microsoft.azure.functions.*;
import com.microsoft.azure.functions.annotation.*;
import com.stackroute.uberservice.dto.ResponseDto;
import com.stackroute.uberservice.model.ProspectiveDriver;
import org.springframework.cloud.function.adapter.azure.AzureSpringBootRequestHandler;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.OptionalLong;

public class ProspectiveDriverHandler extends AzureSpringBootRequestHandler<Object, ResponseDto> {

    @FunctionName("saveProspectiveDriver")
    public ResponseDto save(
            @HttpTrigger(name="saveProspectiveDriverRequest",
                    methods={HttpMethod.POST},
                    route = "enrollments",
                    authLevel = AuthorizationLevel.ANONYMOUS)
                    HttpRequestMessage<Optional<ProspectiveDriver>> request,
            ExecutionContext context
            ){
        return handleRequest(request.getBody().get(),context);
    }

    @FunctionName("getProspectiveDriver")
    public ResponseDto getDriver(
            @HttpTrigger(name="getProspectiveDriverRequest",
                    methods={HttpMethod.GET},
                    route = "enrollment/{enrollmentid}",
                    authLevel = AuthorizationLevel.ANONYMOUS)
                    HttpRequestMessage<Optional<ProspectiveDriver>> request,
            @BindingName("enrollmentid") Integer enrollmentid,
            ExecutionContext context
    ){
        return handleRequest(enrollmentid,context);
    }





}
