
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Command.src.command;

/**
 *
 * @author Administrador
 */
public class Invoker
{
    private Command commander;

    public Invoker(Command commander)
    {
        this.commander = commander;
    }
    public void run()
    {
        commander.execute();
    }
}
