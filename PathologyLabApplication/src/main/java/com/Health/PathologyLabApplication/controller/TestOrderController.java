package com.Health.PathologyLabApplication.controller;
import com.Health.PathologyLabApplication.dto.TestOrderRequest;
import com.Health.PathologyLabApplication.entity.TestOrder;
import com.Health.PathologyLabApplication.service.TestOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
@CrossOrigin("*")
public class TestOrderController {

    private final TestOrderService service;

    @PostMapping
    public TestOrder createOrder(@RequestBody TestOrderRequest request) {
        return service.createOrder(request);
    }

    @GetMapping("/today")
    public List<TestOrder> getTodayOrders() {
        return service.getTodayOrders();
    }
}