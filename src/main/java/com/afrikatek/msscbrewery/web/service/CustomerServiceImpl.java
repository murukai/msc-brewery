package com.afrikatek.msscbrewery.web.service;

import com.afrikatek.msscbrewery.web.model.CustomerDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .firstName("Farai")
                .lastName("Chimuti")
                .nickName("Fatso")
                .age(32)
                .build();
    }
}
