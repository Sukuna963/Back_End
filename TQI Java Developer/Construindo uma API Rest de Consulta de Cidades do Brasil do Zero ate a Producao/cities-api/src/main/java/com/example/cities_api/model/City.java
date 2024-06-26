package com.example.cities_api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "City")
@Table(name = "cidade")
public class City {

    @Id
    private Long id;

    @Column(name = "nome")
    private String name;

    private Integer ibge;

    @Column(name = "lat_lon")
    private String location;

    @ManyToOne
    @JoinColumn(name = "uf", referencedColumnName = "id")
    private State state;
}
