package com.um.controllerConRepo;

import com.um.controllerConRepo.entidades.Persona;
import com.um.controllerConRepo.repositorios.PersonaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ControllerConRepoApplication {

	@Autowired
	PersonaRepositorio personaRepositorio;

	public static void main(String[] args) {
		SpringApplication.run(ControllerConRepoApplication.class, args);
	}

	@Bean
	CommandLineRunner init(PersonaRepositorio personaRepo) {
		return args -> {
			System.out.println("-----------------ESTOY FUNCIONANDO---------");

			// Crear instancia de Persona y agregar domicilios
			Persona persona = Persona.builder()
					.nombre("Juan")
					.apellido("Pérez")
					.edad(30)
					.build();

			// Guardar el objeto Persona en la base de datos
			personaRepositorio.save(persona);

			// Recuperar el objeto Persona desde la base de datos
			Persona personaRecuperada = personaRepositorio.findById(persona.getId()).orElse(null);

			if (personaRecuperada != null) {
				System.out.println("Nombre: " + personaRecuperada.getNombre());
				System.out.println("Apellido: " + personaRecuperada.getApellido());
				System.out.println("Edad: " + personaRecuperada.getEdad());
			}
		};
	}
}