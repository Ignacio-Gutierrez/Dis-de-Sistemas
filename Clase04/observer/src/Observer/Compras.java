package Observer;

public class Compras implements ILibroMalEstado{
    @Override
    public void update() {
        System.out.println("Ya se envio la orden de compra del libro nuevo");
    }
}
