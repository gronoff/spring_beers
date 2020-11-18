package com.example.beers.DAO;

import com.example.beers.Models.Beer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
public interface BeersRepository extends MongoRepository<Beer, String> {
    List<Beer> findAllByName();
}
