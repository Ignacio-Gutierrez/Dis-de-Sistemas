package Persona;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private String apellido;
    private int dni;

    private ArrayList<Domicilio> domicilios=new ArrayList<>();


    public Persona() {

    }

    public Persona(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Domicilio getDomicilios(int i) {
        return domicilios.get(i);
    }

    public void setDomicilios(Domicilio domicilios) {
        this.domicilios.add(domicilios);
    }

    public void imprimirDomicilio(){
        for (Domicilio dom:domicilios){
            System.out.println("Domicilio "+dom);
        }
    }

    public void caminar(){
        System.out.println("Estoy caminando");
    }


}
