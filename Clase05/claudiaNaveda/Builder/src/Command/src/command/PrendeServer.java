     /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Command.src.command;

/**
 *
 * @author Administrador
 */
public class PrendeServer implements Command
{

   private IServer servidor;
   
   
   
    public PrendeServer(IServer servidor)
    {
        this.servidor=servidor;
    }

    @Override
    public void execute()
    {
        servidor.prendete();
        servidor.conectate();
        servidor.verificaConexion();
        servidor.guardaLog();
        servidor.cerraConexion();
    }
    
}
