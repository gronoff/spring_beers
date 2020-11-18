package com.example.beers.repository;

import com.example.beers.Models.Beer;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface BeersRepository extends MongoRepository<Beer, String> {


}
