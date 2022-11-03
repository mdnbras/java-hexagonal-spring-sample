package com.daniel.hexagonal.adapters.out.repository.mapper;

import com.daniel.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.daniel.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);

}
