package com.Health.PathologyLabApplication.service;

import com.Health.PathologyLabApplication.dto.TestMasterRequest;
import com.Health.PathologyLabApplication.entity.TestMaster;
import com.Health.PathologyLabApplication.repository.TestMasterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestMasterServiceImpl implements TestMasterService {

    private final TestMasterRepository repository;

    @Override
    public TestMaster createTest(TestMasterRequest request) {

        TestMaster test = TestMaster.builder()
                .testName(request.getTestName())
                .testCode(request.getTestCode())
                .sampleType(request.getSampleType())
                .normalRange(request.getNormalRange())
                .price(request.getPrice())
                .build();

        return repository.save(test);
    }

    @Override
    public List<TestMaster> getAllTests() {
        return repository.findAll();
    }

    @Override
    public List<TestMaster> searchTests(String name) {
        return repository.findByTestNameContainingIgnoreCase(name);
    }
}