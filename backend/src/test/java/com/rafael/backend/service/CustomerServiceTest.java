package com.rafael.backend.service;

import com.rafael.backend.dto.CustomerRequest;
import com.rafael.backend.model.Customer;
import com.rafael.backend.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

class CustomerServiceTest {

    @Test
    void testRegisterCustomer() {
        // Arrange
        CustomerRepository mockRepo = Mockito.mock(CustomerRepository.class);
        CustomerService customerService = new CustomerService(mockRepo);

        CustomerRequest request = new CustomerRequest("John Doe", "john@example.com", "FR");
        Customer expected = new Customer("John Doe", "john@example.com", "FR");

        Mockito.when(mockRepo.save(any(Customer.class))).thenReturn(expected);

        // Act
        Customer result = customerService.register(request);

        // Assert
        assertNotNull(result);
        assertEquals("John Doe", result.getName());
        assertEquals("john@example.com", result.getEmail());
        assertEquals("FR", result.getCountry());
    }
}
