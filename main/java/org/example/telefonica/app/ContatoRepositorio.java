package org.example.telefonica.app;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContatoRepositorio extends MongoRepository<Contato, String> {
}
