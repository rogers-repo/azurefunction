package com.stackroute.uberservice.function;

import com.stackroute.uberservice.dto.ResponseDto;
import com.stackroute.uberservice.model.ProspectiveDriver;
import com.stackroute.uberservice.service.UberDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class GetProspectiveDriver implements Function<Integer, ResponseDto> {

    @Autowired
    UberDbService service;

    @Override
    public ResponseDto apply(Integer enrollmentId) {
        ResponseDto reponse=new ResponseDto();
        ProspectiveDriver driver= service.getDriverInfo(enrollmentId);
        reponse.setMessage(" Data retrived from cosmosdb");
        reponse.setDocument(driver);
        return reponse;
    }
}
