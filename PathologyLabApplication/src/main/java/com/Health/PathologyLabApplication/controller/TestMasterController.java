package com.Health.PathologyLabApplication.controller;

import com.Health.PathologyLabApplication.dto.TestMasterRequest;
import com.Health.PathologyLabApplication.entity.TestMaster;
import com.Health.PathologyLabApplication.service.TestMasterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/tests")
@RequiredArgsConstructor
@CrossOrigin("*")
public class TestMasterController {

    private final TestMasterService service;

    @PostMapping
    public TestMaster createTest(@RequestBody TestMasterRequest request) {
        return service.createTest(request);
    }

    @GetMapping
    public List<TestMaster> getAllTests() {
        return service.getAllTests();
    }

    @GetMapping("/search")
    public List<TestMaster> searchTests(@RequestParam String name) {
        return service.searchTests(name);
    }
}