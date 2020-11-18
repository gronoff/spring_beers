package com.example.beers.repository;

import com.example.beers.Models.Beer;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
public interface BeersRepository extends MongoRepository<Beer, String> {

    @Override
    default <S extends Beer> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    default List<Beer> findAll() {
        return null;
    }

    @Override
    default List<Beer> findAll(Sort sort) {
        return null;
    }

    @Override
    default <S extends Beer> S insert(S entity) {
        return null;
    }

    @Override
    default <S extends Beer> List<S> insert(Iterable<S> entities) {
        return null;
    }

    @Override
    default <S extends Beer> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    default <S extends Beer> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }
}
