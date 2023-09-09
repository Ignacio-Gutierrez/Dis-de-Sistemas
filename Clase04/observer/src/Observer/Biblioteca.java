package Observer;

public class Biblioteca {
    public void devuelveLibro(Libro libro){
        if(libro.getEstado().equals("MALO")){
            AlarmaLibro alarma = new AlarmaLibro();
            alarma.notifyObserver();
        }
    }
}
