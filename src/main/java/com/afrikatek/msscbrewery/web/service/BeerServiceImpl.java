package com.afrikatek.msscbrewery.web.service;

import com.afrikatek.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService{

    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Chibuku Scud")
                .beerStyle("Masese")
                .build();
    }

    @Override
    public BeerDto save(BeerDto beerDto) {
        return BeerDto.builder()
                .id(beerDto.getId())
                .beerName(beerDto.getBeerName())
                .beerStyle(beerDto.getBeerStyle())
                .upc(beerDto.getUpc())
                .build();
    }

    @Override
    public void updateBeer(BeerDto beerDto) {
        // update the beer
    }

    @Override
    public void deleteBeer(UUID beerId) {
        // delete the beer
    }
}
