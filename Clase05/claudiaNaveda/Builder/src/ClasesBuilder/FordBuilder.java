package ClasesBuilder;

public class FordBuilder extends AutoBuilder {
	
	public void buildMarca() {
		auto.setMarca("Ford");	
	}

	
	public void buildModelo() {
		auto.setModelo("Kuga");
	}

	public void buildMotor() {
		Motor motor = new Motor ();
		motor.setNumero(21212);
		motor.setPotencia("20 hp");
		auto.setMotor(motor);
	}
	public void buildPuertas() {
		auto.setCantidadDePuertas(4);
	}
}
