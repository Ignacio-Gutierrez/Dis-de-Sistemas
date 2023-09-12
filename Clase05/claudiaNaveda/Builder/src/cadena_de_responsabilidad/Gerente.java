/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cadena_de_responsabilidad;

/**
 *
 * @author Administrador
 */
public class Gerente implements IAprobador
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
        if (monto > 50000 && monto <= 100000)
        {
            System.out.println("Lo manejo yo el gerente!");
        }
        else
        {
            next.solicitudPrestamo(monto);
        }
    }
}
