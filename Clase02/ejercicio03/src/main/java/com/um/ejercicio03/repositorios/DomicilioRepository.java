package com.um.ejercicio03.repositorios;

import com.um.ejercicio03.entidades.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DomicilioRepository extends JpaRepository <Domicilio, Long> {
}