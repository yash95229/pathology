package com.Health.PathologyLabApplication.repository;

import com.Health.PathologyLabApplication.entity.TestOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TestOrderRepository extends JpaRepository<TestOrder, Long> {

    List<TestOrder> findByOrderDate(LocalDate orderDate);
}