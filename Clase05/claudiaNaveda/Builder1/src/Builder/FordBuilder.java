package Builder;

public class FordBuilder extends AutoBuilder{
    @Override
    public void buildMarca() {
         auto.setMarca("Ford");
    }

    @Override
    public void buildModelo() {
         auto.setModelo("Explorer");
    }

    @Override
    public void buildPuertas() {
        auto.setCantidadPuertas(4);
    }

    @Override
    public void buildMotor() {

        Motor motor = new Motor();

        motor.setPotencia("25HP");
        motor.setNumero(124);

    }
}
