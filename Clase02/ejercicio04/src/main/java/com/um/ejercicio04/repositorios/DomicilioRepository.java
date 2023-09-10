package com.um.ejercicio04.repositorios;

import com.um.ejercicio04.entidades.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DomicilioRepository extends JpaRepository <Domicilio, Long> {
}