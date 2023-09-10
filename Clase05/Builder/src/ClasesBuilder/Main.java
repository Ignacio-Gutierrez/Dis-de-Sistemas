package ClasesBuilder;

public class Main {

    public static void main(String[] args) {


    AutoDirector director = new AutoDirector();

    FordBuilder ford1= new FordBuilder();

    director.setAutoBuilder(ford1);

    director.constructAuto();


    Auto auto = director.getAuto();

        System.out.println(auto.getMarca());
        System.out.println(auto.getModelo());


}}
