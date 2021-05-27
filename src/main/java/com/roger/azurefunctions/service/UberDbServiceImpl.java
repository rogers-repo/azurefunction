package com.stackroute.uberservice.service;

import com.stackroute.uberservice.model.ProspectiveDriver;
import com.stackroute.uberservice.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UberDbServiceImpl implements UberDbService {
    @Autowired
    DriverRepository driverRepository;

    @Override
    public ProspectiveDriver getDriverInfo(Integer enrollmentId) {
       return driverRepository.findById(enrollmentId).orElse(null);
    }

    @Override
    public ProspectiveDriver saveDriver(ProspectiveDriver prospectiveDriver) {
        return driverRepository.save(prospectiveDriver);
    }
}
