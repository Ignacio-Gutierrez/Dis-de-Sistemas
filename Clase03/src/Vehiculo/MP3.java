package Vehiculo;

public class MP3 {
    private String marcaMP3;
    private int capacidad;

    public MP3() {
    }

    public MP3(String marcaMP3, int capacidad) {
        this.marcaMP3 = marcaMP3;
        this.capacidad = capacidad;
    }

    public String getMarcaMP3() {
        return marcaMP3;
    }

    public void setMarcaMP3(String marcaMP3) {
        this.marcaMP3 = marcaMP3;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }


}
