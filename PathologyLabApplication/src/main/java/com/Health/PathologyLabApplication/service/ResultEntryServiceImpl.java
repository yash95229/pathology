package com.Health.PathologyLabApplication.service;
import com.Health.PathologyLabApplication.dto.ResultEntryRequest;
import com.Health.PathologyLabApplication.entity.ResultEntry;
import com.Health.PathologyLabApplication.entity.TestOrder;
import com.Health.PathologyLabApplication.repository.ResultEntryRepository;
import com.Health.PathologyLabApplication.repository.TestOrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ResultEntryServiceImpl implements ResultEntryService {

    private final ResultEntryRepository resultRepository;
    private final TestOrderRepository orderRepository;

    @Override
    public ResultEntry saveResult(Long orderId, ResultEntryRequest request) {

        TestOrder order = orderRepository.findById(orderId)
                .orElseThrow(() -> new RuntimeException("Order not found"));

        ResultEntry result = ResultEntry.builder()
                .resultValue(request.getResultValue())
                .technicianNotes(request.getTechnicianNotes())
                .completed(true)
                .testOrder(order)
                .build();

        order.setStatus("COMPLETED");

        return resultRepository.save(result);
    }

    @Override
    public ResultEntry getResultByOrder(Long orderId) {

        return resultRepository.findByTestOrderId(orderId)
                .orElseThrow(() -> new RuntimeException("Result not found"));
    }
}