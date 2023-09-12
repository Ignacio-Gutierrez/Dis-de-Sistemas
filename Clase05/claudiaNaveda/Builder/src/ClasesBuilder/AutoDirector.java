package ClasesBuilder;

public class AutoDirector {
	
	private AutoBuilder autoBuilder;
	
	public void constructAuto() {
		autoBuilder.crearAuto();
		autoBuilder.buildMarca();
		autoBuilder.buildModelo();
		autoBuilder.buildMotor();
		autoBuilder.buildPuertas();
	}
	public void setAutoBuilder(AutoBuilder ab) {
		autoBuilder = ab;
	}
	public Auto getAuto() {
		return autoBuilder.getAuto();
	}
}
