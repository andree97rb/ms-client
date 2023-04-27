package com.richand.bank1.msclient.repository;

import com.richand.bank1.msclient.entity.Client;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;


public interface ClientRepository extends ReactiveMongoRepository<Client, Long> {
}
