package com.afrikatek.msscbrewery.web.service;

import com.afrikatek.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    public BeerDto getBeerById(UUID beerId);
}
