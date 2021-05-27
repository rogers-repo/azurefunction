package com.stackroute.uberservice.service;

import com.stackroute.uberservice.model.ProspectiveDriver;

public interface UberDbService {

    ProspectiveDriver getDriverInfo(Integer entrollmentId);
    ProspectiveDriver saveDriver(ProspectiveDriver prospectiveDriver);
}
