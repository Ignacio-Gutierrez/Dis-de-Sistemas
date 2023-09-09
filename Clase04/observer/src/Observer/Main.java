package Observer;

public class Main {


    public static void main(String[] args) {
        AlarmaLibro alarma = new AlarmaLibro();
        alarma.attach(new Administracion());
        alarma.attach(new Stock());
        alarma.attach(new Compras());

        Libro l1 = new Libro("Bueno","Desing Pattern");
        l1.setEstado("MALO");

        Biblioteca b1 = new Biblioteca();
        b1.devuelveLibro(l1);
    }
}
