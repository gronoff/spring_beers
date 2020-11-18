package com.example.beers.DAO;


import com.example.beers.Models.Beer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public abstract class BeerDAO implements BeersRepository {


    @Override
    public List<Beer> findAll() {
        return new ArrayList<Beer>();
    }
}
