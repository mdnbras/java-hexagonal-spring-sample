package com.daniel.hexagonal.config;

import com.daniel.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.daniel.hexagonal.adapters.out.InsertCustomerAdapter;
import com.daniel.hexagonal.adapters.out.SendCpfValidationAdapter;
import com.daniel.hexagonal.application.core.usecase.InsertCustomerUserCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUserCase insertCustomerUserCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter,
            SendCpfValidationAdapter sendCpfValidationAdapter
    ) {
        return new InsertCustomerUserCase(
                findAddressByZipCodeAdapter,
                insertCustomerAdapter,
                sendCpfValidationAdapter
        );
    }

}
