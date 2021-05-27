package com.stackroute.uberservice.function;

import com.stackroute.uberservice.dto.ResponseDto;
import com.stackroute.uberservice.model.ProspectiveDriver;
import com.stackroute.uberservice.service.UberDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.function.Function;

@Component
public class SaveProspectiveDriver implements Function<ProspectiveDriver, ResponseDto> {

    @Autowired
    UberDbService service;

    @Override
    public ResponseDto apply(ProspectiveDriver prospectiveDriver) {
        ResponseDto response=new ResponseDto();
        final Integer id= new Random().nextInt(100);
        System.out.println("Integer id " + id );
        prospectiveDriver.setEnrollmentid(id);
        response.setMessage("saved the document to mongo db");
        response.setDocument(prospectiveDriver);
        System.out.println("start to save  " );
        service.saveDriver(prospectiveDriver);
        System.out.println("cpmpleted  save  " );
        return response;
    }
}
