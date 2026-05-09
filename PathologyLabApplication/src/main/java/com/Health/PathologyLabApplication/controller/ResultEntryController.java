package com.Health.PathologyLabApplication.controller;
import com.Health.PathologyLabApplication.dto.ResultEntryRequest;
import com.Health.PathologyLabApplication.entity.ResultEntry;
import com.Health.PathologyLabApplication.service.ResultEntryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/results")
@RequiredArgsConstructor
@CrossOrigin("*")
public class ResultEntryController {

    private final ResultEntryService service;

    @PostMapping("/{orderId}")
    public ResultEntry saveResult(
            @PathVariable Long orderId,
            @RequestBody ResultEntryRequest request) {

        return service.saveResult(orderId, request);
    }

    @GetMapping("/{orderId}")
    public ResultEntry getResult(@PathVariable Long orderId) {
        return service.getResultByOrder(orderId);
    }
}