package com.example.cities_api.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity(name = "State")
@Table(name = "estado")
public class State {

    @Id
    private Long id;

    @Column(name = "nome")
    private String name;

    private String uf;
    private Integer ibge;

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(name = "ddd")
    private List<Integer> ddd;

    @ManyToOne
    @JoinColumn(name = "pais", referencedColumnName = "id")
    private Country country;
}
