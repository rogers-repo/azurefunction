package com.stackroute.uberservice.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class ProspectiveDriver {
    @Id
    private  Integer enrollmentid;
    private String name;
    private String age;
    private String gender;
    private RegCertificate regCertificate;
    private Authentication auth;
    private DriverLicence driverLicence;


}
