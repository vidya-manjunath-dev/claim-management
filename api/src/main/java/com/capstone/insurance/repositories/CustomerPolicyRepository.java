package com.capstone.insurance.repositories;

import com.capstone.insurance.entities.CustomerPolicy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CustomerPolicyRepository extends JpaRepository<CustomerPolicy, Long> {

    boolean existsByCustomerIdAndPolicyId(UUID customerId, UUID policyId);

    List<CustomerPolicy> findByCustomerId(UUID customerId);
    
    Optional<CustomerPolicy> findByCustomerIdAndPolicyId(UUID customerId, UUID policyId);
}
