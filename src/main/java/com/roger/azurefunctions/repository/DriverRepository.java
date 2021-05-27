package com.stackroute.uberservice.repository;


import com.stackroute.uberservice.model.ProspectiveDriver;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public interface DriverRepository extends MongoRepository<ProspectiveDriver,Integer> {
}
