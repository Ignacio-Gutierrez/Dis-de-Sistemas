package Observer;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AlarmaLibro implements Subjet{

    private ArrayList<ILibroMalEstado> observadores = new ArrayList<>();

    @Override
    public void attach(ILibroMalEstado observador) {
        observadores.add(observador);

    }

    @Override
    public void dettach(ILibroMalEstado observador) {
        observadores.remove(observador);

    }

    @Override
    public void notifyObserver() {

        for (ILibroMalEstado observer:observadores){
            observer.update();
        }

    }
}
