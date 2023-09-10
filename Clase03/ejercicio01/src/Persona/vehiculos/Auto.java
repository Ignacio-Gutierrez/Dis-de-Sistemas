package Persona.vehiculos;

public class Auto extends Vehiculo{
    private String matricula;

    public Auto(String marca, String matricula) {
        super(marca);
        this.matricula = matricula;
    }

    @Override
    public void arrancar() {

    }

}
