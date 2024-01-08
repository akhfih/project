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
@Table(name = "m_voter")
public class Voter {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "nik", unique = true, nullable = false, length = 16)
    private String nik;

    @Column(name = "name", unique = false, nullable = false, length = 30)
    private String name;

    @Column(name = "address", unique = false, nullable = false, length = 100)
    private String address;

}
