package org.example.telefonica.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class MongoDBConnection {

    private final MongoTemplate mongoTemplate;

    @Autowired
    public MongoDBConnection(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public void testarConexao() {
        System.out.println("Conectado ao MongoDB: " + mongoTemplate.getDb().getName());
    }
}
