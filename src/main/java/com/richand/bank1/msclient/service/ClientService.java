package com.richand.bank1.msclient.service;

import com.richand.bank1.msclient.entity.Client;
import com.richand.bank1.msclient.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public Flux<Client> findAll() {
        return clientRepository.findAll();
    }

    public Mono<Client> findById(Long id){
        return clientRepository.findById(id);
    }

    public Mono<Client> create(Client client){
        return clientRepository.insert(client);
    }
}
