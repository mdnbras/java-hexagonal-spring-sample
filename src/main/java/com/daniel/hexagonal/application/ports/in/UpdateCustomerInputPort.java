package com.daniel.hexagonal.application.ports.in;

import com.daniel.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort {

    void update(Customer customer, String zipCode);
}
