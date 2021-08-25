package com.TraineesTracker.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.TraineesTracker.Entities.TraineesDetails;

@Repository
public interface TraineesDetailsRepository extends CrudRepository<TraineesDetails, Long>{

}
