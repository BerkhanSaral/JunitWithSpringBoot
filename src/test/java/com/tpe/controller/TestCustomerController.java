package com.tpe.controller;

import com.tpe.repository.CustomerRepository;
import com.tpe.service.CustomerService;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TestCustomerController {

    @Mock
    private CustomerService customerService;

    @InjectMocks
    private  CustomerController customerController;

}
