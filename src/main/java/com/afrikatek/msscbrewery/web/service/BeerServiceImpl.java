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
}
