package com.stackroute.uberservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Authentication {

    private String ownername;
    private String reqnumber;
    private String driverName;
    private String status;
}
