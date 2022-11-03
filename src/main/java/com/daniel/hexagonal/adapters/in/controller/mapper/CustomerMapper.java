package com.daniel.hexagonal.adapters.in.controller.mapper;

import com.daniel.hexagonal.adapters.in.controller.request.CustomerRequest;
import com.daniel.hexagonal.adapters.in.controller.response.CustomerResponse;
import com.daniel.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);

    CustomerResponse toCustomerResponse(Customer customer);
}
