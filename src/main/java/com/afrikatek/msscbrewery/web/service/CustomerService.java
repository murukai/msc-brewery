package com.afrikatek.msscbrewery.web.service;

import com.afrikatek.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
