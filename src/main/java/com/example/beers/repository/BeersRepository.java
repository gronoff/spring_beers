package com.example.beers.repository;

import com.example.beers.Models.Beer;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface BeersRepository extends MongoRepository<Beer, String> {

    // void delete(Optional<Beer> beer);
}
