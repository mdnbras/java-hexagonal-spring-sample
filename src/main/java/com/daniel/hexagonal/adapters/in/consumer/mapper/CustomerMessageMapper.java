package com.daniel.hexagonal.adapters.in.consumer.mapper;

import com.daniel.hexagonal.adapters.in.consumer.message.CustomerMessage;
import com.daniel.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface CustomerMessageMapper {

    @Mapping(target = "address", ignore = true)
    Customer toCustomer(CustomerMessage customerMessage);

}
