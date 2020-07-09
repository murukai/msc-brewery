package com.afrikatek.msscbrewery.web.controller;

import com.afrikatek.msscbrewery.web.model.CustomerDto;
import com.afrikatek.msscbrewery.web.service.CustomerService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDto> getCustomerById(@PathVariable("customerId") UUID customerId){
        return new ResponseEntity<>(customerService.getCustomerById(customerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity getPostCustomer(@RequestBody CustomerDto customerDto){
        CustomerDto customer = customerService.saveCustomer(customerDto);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/beer" + customer.getId());
        return new ResponseEntity(headers, HttpStatus.OK);
    }

    @PutMapping("{customerId}")
    public ResponseEntity getUpdateCustomer(@PathVariable("customerId") UUID customerId, @RequestBody CustomerDto customerDto){
        CustomerDto updatedCustomer = customerService.updateCustomer(customerDto);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("{customerId}")
    public ResponseEntity getDeleteCustomer(@PathVariable("customerId") UUID customerId){
        customerService.deleteCustomer(customerId);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
