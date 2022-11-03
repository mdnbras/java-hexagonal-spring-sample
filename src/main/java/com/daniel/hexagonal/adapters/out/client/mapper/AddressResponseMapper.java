package com.daniel.hexagonal.adapters.out.client.mapper;

import com.daniel.hexagonal.adapters.out.client.response.AddressResponse;
import com.daniel.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);
}
