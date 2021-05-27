package com.stackroute.uberservice.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RegCertificate {

    private String regnumber;
    private String ownername;
    private String model;

}
