/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Command.src.command;

/**
 *
 * @author Administrador
 */
public class ApagarServer implements Command
{
    private IServer servidor;
    String uno;
    public ApagarServer(IServer servidor)
    {
        this.servidor = servidor;
    }

    @Override
    public void execute()
    {
        
        servidor.conectate();
        servidor.verificaConexion();
        servidor.guardaLog();
        servidor.cerraConexion();
        servidor.apagate();
    }
    
}
