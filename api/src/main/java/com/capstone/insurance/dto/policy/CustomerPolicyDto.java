package com.capstone.insurance.dto.policy;

import com.capstone.insurance.entities.enums.PolicyStatus;
import com.capstone.insurance.entities.enums.PolicyType;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Data
@Builder
public class CustomerPolicyDto {
    private UUID policyId;
    private String policyCode;
    private String policyNumber; // The assigned policy number from CustomerPolicy
    private PolicyType policyType;
    private Double coverageAmount;
    private LocalDate startDate;
    private LocalDate endDate;
    private PolicyStatus status;
}

