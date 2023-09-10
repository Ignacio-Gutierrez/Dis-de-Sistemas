package Builder;

public class Director {

private AutoBuilder autobuilder;

public Auto getAutobuilder() {
    return autobuilder.getAuto();
}

public void setAutobuilder(AutoBuilder autobuilder) {

    this.autobuilder = autobuilder;
}

private AutoBuilder autoBuilder;


public void setAutoBuilder(AutoBuilder ab) {
    autoBuilder = ab;
}
public Auto getAuto() {
    return autoBuilder.getAuto();
}

public void constructAuto() {

    autobuilder.buildMarca();
    autobuilder.buildModelo();
    autobuilder.buildMotor();
    autobuilder.buildPuertas();

}



}
