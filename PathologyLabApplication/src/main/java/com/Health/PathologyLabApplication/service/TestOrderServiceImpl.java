package com.Health.PathologyLabApplication.service;
import com.Health.PathologyLabApplication.dto.TestOrderRequest;
import com.Health.PathologyLabApplication.entity.TestMaster;
import com.Health.PathologyLabApplication.entity.TestOrder;
import com.Health.PathologyLabApplication.repository.TestMasterRepository;
import com.Health.PathologyLabApplication.repository.TestOrderRepository;
import com.Health.PathologyLabApplication.util.OrderNumberGenerator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TestOrderServiceImpl implements TestOrderService {

    private final TestOrderRepository orderRepository;
    private final TestMasterRepository testRepository;

    @Override
    public TestOrder createOrder(TestOrderRequest request) {

        TestMaster test = testRepository.findById(request.getTestId())
                .orElseThrow(() -> new RuntimeException("Test not found"));

        TestOrder order = TestOrder.builder()
                .orderNumber(OrderNumberGenerator.generate())
                .patientName(request.getPatientName())
                .phone(request.getPhone())
                .orderDate(LocalDate.now())
                .status("PENDING")
                .testMaster(test)
                .build();

        return orderRepository.save(order);
    }

    @Override
    public List<TestOrder> getTodayOrders() {
        return orderRepository.findByOrderDate(LocalDate.now());
    }
}