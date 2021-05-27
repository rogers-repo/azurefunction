package com.stackroute.uberservice.function;

import com.stackroute.uberservice.dto.ResponseDto;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class InValidateDriver  implements Function<Integer, ResponseDto> {

    @Override
    public ResponseDto apply(Integer enrollmentId) {
        ResponseDto response =new ResponseDto();
        response.setDocument(" Driver not Valid ");
        return response;
    }
}