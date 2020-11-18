package com.example.beers.Services;

import com.example.beers.DAO.BeerDAO;
import com.example.beers.Models.Beer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeerAPI {

    private final BeerDAO beerDAO;

    public BeerAPI(BeerDAO beerDAO) {
        this.beerDAO = beerDAO;
    }

    @GetMapping(value = "/BeerList")
    public void getBeerList() {
        beerDAO.findAll().forEach(Beer::getName);
    }

    @GetMapping(value = "/BeerList:{id}")
    public void getBeerId(@PathVariable String id) {
        beerDAO.findById(id);
    }
}

