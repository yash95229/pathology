package com.Health.PathologyLabApplication.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Table(name = "test_master")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TestMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "test_name", nullable = false)
    private String testName;

    @Column(name = "test_code", unique = true)
    private String testCode;

    @Column(name = "sample_type")
    private String sampleType;

    @Column(name = "normal_range")
    private String normalRange;

    @Column(name = "price")
    private Double price;

    @JsonIgnore
    @OneToMany(mappedBy = "testMaster")
    private List<TestOrder> testOrders;
}
