package com.um.Project.entidades;

import jakarta.persistence.*;
import lombok.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="persona")
public class Persona extends BaseEntidad {

    @Column(name = "nombre")
    private String nombre;

    private String apellido;
    private int edad;
}