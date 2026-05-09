package com.Health.PathologyLabApplication.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "result_entry")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResultEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "result_value")
    private String resultValue;

    @Column(name = "technician_notes")
    private String technicianNotes;

    @Column(name = "completed")
    private Boolean completed;

    @OneToOne
    @JoinColumn(name = "order_id")
    private TestOrder testOrder;
}
