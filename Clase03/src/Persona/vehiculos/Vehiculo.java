package Persona.vehiculos;

public abstract class Vehiculo {
    protected String marca;

    public Vehiculo(String marca) {
    }

    public abstract void arrancar();

    public Vehiculo() {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}

