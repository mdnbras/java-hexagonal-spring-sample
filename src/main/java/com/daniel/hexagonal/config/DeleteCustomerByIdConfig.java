package com.daniel.hexagonal.config;

import com.daniel.hexagonal.adapters.out.DeleteCustomerByIdAdapter;
import com.daniel.hexagonal.application.core.usecase.DeleteCustomerByIdUseCase;
import com.daniel.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            DeleteCustomerByIdAdapter insertCustomerAdapter
    ) {
        return new DeleteCustomerByIdUseCase(findCustomerByIdUseCase, insertCustomerAdapter);
    }

}
