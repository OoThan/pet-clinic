package com.oothan.springdev.petclinic.models;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created By oothan on Jun, 2022
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "visits")
public class Visit extends BaseEntity {

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;
}
