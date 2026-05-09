package com.Health.PathologyLabApplication.service;

import com.Health.PathologyLabApplication.dto.TestOrderRequest;
import com.Health.PathologyLabApplication.entity.TestOrder;

import java.util.List;

public interface TestOrderService {
    TestOrder createOrder(TestOrderRequest request);

    List<TestOrder> getTodayOrders();
}
