package Observer;

public class Administracion implements ILibroMalEstado{
    @Override
    public void update() {
        System.out.println("Usted tiene una multa por devolver el libro roto");
    }
}
