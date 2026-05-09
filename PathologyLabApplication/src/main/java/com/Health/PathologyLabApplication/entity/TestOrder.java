package com.Health.PathologyLabApplication.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "test_order")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TestOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "order_number", unique = true)
    private String orderNumber;

    @Column(name = "patient_name", nullable = false)
    private String patientName;

    @Column(name = "phone")
    private String phone;

    @Column(name = "order_date")
    private LocalDate orderDate;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "test_id")
    private TestMaster testMaster;

    @JsonIgnore
    @OneToOne(mappedBy = "testOrder", cascade = CascadeType.ALL)
    private ResultEntry resultEntry;
}