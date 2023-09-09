package Equipos;

public class Computadora {
    private String marca;
    private double precio;
    private String color;

    private Impresora impre;

    private CPU cpu;


    public Computadora(String marca, double precio, String color,String marcaCPU,String modelo) {
        this.marca = marca;
        this.precio = precio;
        this.color = color;
        this.cpu = new CPU(marcaCPU,modelo);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Impresora getImpre() {
        return impre;
    }

    public void agregarimpresora(Impresora impresora1){
        this.impre = impresora1;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }


}