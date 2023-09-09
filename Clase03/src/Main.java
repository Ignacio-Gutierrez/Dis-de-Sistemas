import Equipos.Computadora;
import Equipos.Impresora;
import Persona.Persona;
import Persona.Domicilio;
import Vehiculo.*;


public class Main {
    public static void main(String[] args){
        Persona p1= new Persona("Pepe","Argento",23456765);
        System.out.println("La persona se llama "+p1.getNombre()+" "+p1.getApellido());
        System.out.println("Su DNI es "+p1.getDni());
        p1.caminar();

        Domicilio d1= new Domicilio("huarpes",123);

        //p1.setmDomicilio(d1);
        //System.out.println(p1.getNombre()+" "+p1. getApellido()+" vive en "+p1.getmDomicilio().getCalle()+" "+p1.getmDomicilio().getNumero());

        d1.setnPersona(p1);
        System.out.println(d1.getCalle()+" "+d1.getNumero()+" es el domicilio de "+d1.getnPersona().getNombre()+" "+d1.getnPersona().getApellido());

        Computadora compu1= new Computadora("Dell",220,"Negro","AMD","Ryzen 5 5600");

        Impresora impre1= new Impresora("Laser","EPSON");

        compu1.agregarimpresora(impre1);
        System.out.println("La compu es "+compu1.getMarca()+" "+compu1.getColor()+",tiene un precio de "+compu1.getPrecio()+" y tiene una impresora "+impre1.getMarca()+" con cartuchos "+impre1.getCartucho());

        Auto auto1= new Auto("Nissan",29);

        MP3 mp3a= new MP3("Sony",280);

        Garaje garaje1= new Garaje("Chile",2343);

        auto1.agregarMP3(mp3a);
        System.out.println("El auto es un "+auto1.getMarca()+" con ruedas que tiene una medida de "+auto1.getRuedas().getMedida()+" ademas tiene un MP3 marca "+auto1.getMp3().getMarcaMP3()+" con una capacidad de "+auto1.getMp3().getCapacidad());

        auto1.setnGaraje(garaje1);
        System.out.println("El auto se encuentra en un garaje en la calle "+auto1.getnGaraje().getCalle()+" al "+auto1.getnGaraje().getNumero());
    }
}