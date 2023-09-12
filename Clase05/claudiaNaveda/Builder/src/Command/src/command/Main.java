/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Command.src.command;

/**
 *
 * @author Administrador
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
       
        
        
        Command commander = new PrendeServer(new BrasilServer());
        
        Invoker serverAdmin = new Invoker(commander);
        
        serverAdmin.run();
    }
}
