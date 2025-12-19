package com.capstone.insurance.repositories;

import com.capstone.insurance.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface CustomerRepository extends JpaRepository<Customer, UUID> {

    Optional<Customer> findByEmail(String email);

    Optional<Customer> findByCustomerCode(String customerCode);

    Optional<Customer> findByUserId(Long userId);

    // Find the highest customer code to generate next one
    Optional<Customer> findTopByOrderByCustomerCodeDesc();
}
