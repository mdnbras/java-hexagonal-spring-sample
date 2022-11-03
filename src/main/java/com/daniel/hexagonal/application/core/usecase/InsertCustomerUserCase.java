package com.daniel.hexagonal.application.core.usecase;

import com.daniel.hexagonal.application.core.domain.Customer;
import com.daniel.hexagonal.application.ports.in.InsertCustomerInputPort;
import com.daniel.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import com.daniel.hexagonal.application.ports.out.InsertCustomerOutputPort;
import com.daniel.hexagonal.application.ports.out.SendCpfForValidationOutputPort;

public class InsertCustomerUserCase implements InsertCustomerInputPort {

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;

    private final InsertCustomerOutputPort insertCustomerOutputPort;

    private final SendCpfForValidationOutputPort sendCpfForValidationOutputPort;

    public InsertCustomerUserCase(
            FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
            InsertCustomerOutputPort insertCustomerOutputPort,
            SendCpfForValidationOutputPort sendCpfForValidationOutputPort
    ) {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
        this.sendCpfForValidationOutputPort = sendCpfForValidationOutputPort;
    }

    @Override
    public void insert(Customer customer, String zipCode) {
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        insertCustomerOutputPort.insert(customer);
        sendCpfForValidationOutputPort.send(customer.getCpf());
    }
}
