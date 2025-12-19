package com.capstone.insurance.dto.policy;

import com.capstone.insurance.entities.enums.PolicyStatus;
import com.capstone.insurance.entities.enums.PolicyType;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class PolicyDto {
    private java.util.UUID id;
    private String policyCode;
    private PolicyType policyType;
    private Double coverageAmount;
    private LocalDate startDate;
    private LocalDate endDate;
    private PolicyStatus status;
}
