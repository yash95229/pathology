package com.Health.PathologyLabApplication.dto;

import lombok.Data;

@Data
public class TestMasterRequest {
    private String testName;
    private String testCode;
    private String sampleType;
    private String normalRange;
    private Double price;
}
