package com.Health.PathologyLabApplication.service;

import com.Health.PathologyLabApplication.dto.TestMasterRequest;
import com.Health.PathologyLabApplication.entity.TestMaster;

import java.util.List;

public interface TestMasterService {
    TestMaster createTest(TestMasterRequest request);

    List<TestMaster> getAllTests();

    List<TestMaster> searchTests(String name);
}
