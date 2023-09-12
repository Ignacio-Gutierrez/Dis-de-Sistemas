package ClasesBuilder;

public abstract class AutoBuilder {
	
	protected Auto auto;
	
	public Auto getAuto() {
		return auto;
	}
	public void crearAuto() {
		
		auto = new Auto();
		
	}
		public abstract void buildMotor();
		
		public abstract void buildModelo();
		
		public abstract void buildMarca();
		
		public abstract void buildPuertas();
	
}
