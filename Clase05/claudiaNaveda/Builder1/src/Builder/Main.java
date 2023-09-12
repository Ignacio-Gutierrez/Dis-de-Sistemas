package Builder;

public class Main {

    public static void main(String[] args) {

        Director director = new Director();

        AutoBuilder autoFord = new FordBuilder();

        director.setAutoBuilder(autoFord);

        director.constructAuto();

        Auto auto = director.getAuto();

        System.out.println(auto.getModelo());
        System.out.println(auto.getMarca());
    }
}
