package com.daniel.hexagonal.application.ports.out;

import com.daniel.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {

    void update(Customer customer);
}
