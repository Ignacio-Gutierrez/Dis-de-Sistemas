package com.um.controller.controladores;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "api/personas")
public class PersonaControlador {

    @GetMapping("subRuta")
    public ResponseEntity<String> holaMundo() {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body("Te saludo desde la Api Controller");
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("{\"error\":\"Error. Por favor intente luego\"}");
        }
    }


    // OTRO METODO
    @GetMapping("subRutaChau")
    public ResponseEntity<?> chauMundo() {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body("Me despido desde la Api Controller");
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("{\"error\":\"Error. Por favor intente luego\"}");
        }
    }


    // BUSCO POR LA URL
    @GetMapping("/{id}")
    public ResponseEntity<String> getById(@PathVariable Long id) {

        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body("Te devuelvo un registro de la base de datos por el ID buscado");
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("{\"error\":\"Error. Por favor intente luego\"}");
        }
    }

    // BUSCO TODOS LOS REGISTROS
    @GetMapping("/all")
    public ResponseEntity<String> getAll() {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body("Te devuelvo una lista de registros");
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("{\"error\":\"Error. Por favor intente luego\"}");
        }
    }


    // DOY DE ALTA UN REGISTRO
    @PostMapping()
    public ResponseEntity<String> create(@RequestBody String persona) {
        try {
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body("Te devuelvo la persona creada: " + persona);
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("{\"error\":\"Error. Por favor intente luego\"}");
        }
    }

    // ACTUALIZO UN REGISTRO
    @PutMapping("/{id}")
    public ResponseEntity<String> update(@PathVariable Long id, @RequestBody String persona) {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body("Te devuelvo la persona actualizada: " + persona);
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("{\"error\":\"Error. Por favor intente luego\"}");
        }
    }

    // ELIMINAR UN REGISTRO
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id, @RequestBody String persona) {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body("Se eliminnó a: " + persona);
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("{\"error\":\"Error. Por favor intente luego\"}");
        }
    }

}