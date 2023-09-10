package Builder;

public class FiatBuilder extends AutoBuilder{
    @Override
    public void buildMarca() {
        auto.setMarca("Fiat");
    }

    @Override
    public void buildModelo() {
       auto.setModelo("Pulse");
    }

    @Override
    public void buildPuertas() {
         auto.setCantidadPuertas(2);
    }

    @Override
    public void buildMotor() {
        Motor motor = new Motor();

        motor.setNumero(123);
        motor.setPotencia("23HP");


    }
}
