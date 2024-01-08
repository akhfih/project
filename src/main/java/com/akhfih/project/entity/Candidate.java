package com.akhfih.project.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@Table(name = "m_candidate")
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "number", unique = false, nullable = false, length = 1)
    private Integer number;


    @Column(name = "name", unique = false, nullable = false, length = 30)
    private String name;

    @Column(name = "party", unique = false, nullable = false, length = 100)
    private String party;
}
