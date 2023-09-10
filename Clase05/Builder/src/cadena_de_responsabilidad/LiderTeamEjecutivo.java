/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cadena_de_responsabilidad;

/**
 *
 * @author Administrador
 */
public class LiderTeamEjecutivo implements IAprobador
{
    private IAprobador next;

    @Override
    public void setNext(IAprobador aprobador)
    {
        next = aprobador;
    }

    @Override
    public IAprobador getNext()
    {
        return next;
    }

    @Override
    public void solicitudPrestamo(int monto)
    {
        if (monto > 10000 && monto <= 50000)
        {
            System.out.println("Lo manejo yo el lider!");
        }
        else
        {
            next.solicitudPrestamo(monto);
        }
    }
    
}
