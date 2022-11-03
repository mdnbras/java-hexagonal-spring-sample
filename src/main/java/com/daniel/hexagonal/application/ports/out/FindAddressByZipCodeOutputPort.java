package com.daniel.hexagonal.application.ports.out;

import com.daniel.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);

}
