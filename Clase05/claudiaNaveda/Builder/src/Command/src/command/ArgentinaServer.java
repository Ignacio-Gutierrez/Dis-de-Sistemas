/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Command.src.command;

/**
 *
 * @author Administrador
 */
public class ArgentinaServer implements IServer
{

    @Override
    public void apagate()
    {
        System.out.println("Apagando Servidor de Argentina");
    }

    @Override
    public void prendete()
    {
        System.out.println("Prendiendo Servidor de Argentina");
    }

    @Override
    public void conectate()
    {
        System.out.println("Conectando al Servidor de Argentina");
    }

    @Override
    public void verificaConexion()
    {
        System.out.println("Verificando conexion al Servidor de Argentina");
    }

    @Override
    public void guardaLog()
    {
       System.out.println("Guardando Log de Argentina");
    }

    @Override
    public void cerraConexion()
    {
        System.out.println("Cerrando Conexión del Servidor de Argentina");
    }
    
}
