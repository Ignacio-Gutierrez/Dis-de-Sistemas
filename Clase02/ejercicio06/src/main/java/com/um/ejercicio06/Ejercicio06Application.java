package com.um.ejercicio06;

import com.um.ejercicio06.entidades.Domicilio;
import com.um.ejercicio06.entidades.Persona;
import com.um.ejercicio06.repositorios.DomicilioRepository;
import com.um.ejercicio06.repositorios.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Ejercicio06Application {

	@Autowired
	PersonaRepository personaRepository;
	@Autowired
	DomicilioRepository domicilioRepository;
	public static void main(String[] args) {
		SpringApplication.run(Ejercicio06Application.class, args);
	}



	@Bean
	CommandLineRunner init(PersonaRepository personaRepo, DomicilioRepository domicilioRepo) {
		return args -> {
			System.out.println("-----------------ESTOY FUNCIONANDO---------");

			// Crear instancias de Domicilio
			Domicilio domicilio1 = Domicilio.builder()
					.calle("Calle 1")
					.numero(123)
					.build();

			Domicilio domicilio2 = Domicilio.builder()
					.calle("Calle 2")
					.numero(456)
					.build();

			// Crear instancias de Persona y agregar domicilios
			Persona persona1 = Persona.builder()
					.nombre("Juan")
					.apellido("Pérez")
					.edad(30)
					.build();

			Persona persona2 = Persona.builder()
					.nombre("María")
					.apellido("Gómez")
					.edad(25)
					.build();

			// Agregar domicilios a las personas
			persona1.agregarDomicilio(domicilio1);
			persona1.agregarDomicilio(domicilio2);

			persona2.agregarDomicilio(domicilio2);


			// Asignar las personas a los domicilios
			domicilio1.getPersonas().add(persona1);
			domicilio2.getPersonas().add(persona1);
			domicilio2.getPersonas().add(persona2);

			// Guardar las personas y los domicilios en la base de datos
			personaRepository.save(persona1);
			// personaRepository.save(persona2);
		};
	}
}