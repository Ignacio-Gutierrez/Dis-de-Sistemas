package Observer;

public interface Subjet {
    void attach(ILibroMalEstado observador);
    void  dettach(ILibroMalEstado observador);
    void notifyObserver();
}
