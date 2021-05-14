package com.cap.hms;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface contactRepository extends MongoRepository<contact, String>{

}
