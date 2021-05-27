package com.stackroute.uberservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DriverLicence {
    private String licencenumber;
    private String dateOfIssue;
    private String validtill;
    private String rto;
    private String driverName;


}
