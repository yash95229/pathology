package com.Health.PathologyLabApplication.dto;

import lombok.Data;

@Data
public class TestOrderRequest {

    private String patientName;
    private String phone;
    private Long testId;
}
