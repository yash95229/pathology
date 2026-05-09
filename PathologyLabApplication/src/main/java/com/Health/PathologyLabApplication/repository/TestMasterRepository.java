package com.Health.PathologyLabApplication.repository;

import com.Health.PathologyLabApplication.entity.TestMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestMasterRepository extends JpaRepository<TestMaster, Long> {

    List<TestMaster> findByTestNameContainingIgnoreCase(String testName);
}