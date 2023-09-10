package com.um.ejercicio05.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Domicilio extends BaseEntidad {

    private Long id;

    private String calle;
    private int numero;
    @ManyToOne()
    @JoinColumn(name = "persona_id")
    private Persona persona;

}