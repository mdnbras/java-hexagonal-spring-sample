package com.daniel.hexagonal.application.ports.in;

import com.daniel.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find(String id);
}
