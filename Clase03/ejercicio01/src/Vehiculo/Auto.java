package Vehiculo;

public class Auto {
    private String marca;

    private MP3 mp3;

    private Rueda ruedas;

    private Garaje nGaraje;

    public Auto(String marca,int medida) {
        this.marca = marca;
        this.ruedas = new Rueda(medida);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public MP3 getMp3() {
        return mp3;
    }

    public void agregarMP3(MP3 mp31){
        this.mp3 = mp31;
    }

    public Rueda getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda ruedas) {
        this.ruedas = ruedas;
    }

    public Garaje getnGaraje() {
        return nGaraje;
    }

    public void setnGaraje(Garaje nGaraje) {
        this.nGaraje = nGaraje;
    }
}
