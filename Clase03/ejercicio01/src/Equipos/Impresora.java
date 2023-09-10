package Equipos;

public class Impresora {
    private String cartucho;
    private String marca;

    public Impresora() {
    }

    public Impresora(String cartucho, String marca) {
        this.cartucho = cartucho;
        this.marca = marca;
    }

    public String getCartucho() {
        return cartucho;
    }

    public void setCartucho(String cartucho) {
        this.cartucho = cartucho;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}