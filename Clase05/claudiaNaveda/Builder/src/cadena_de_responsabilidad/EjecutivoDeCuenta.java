/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cadena_de_responsabilidad;

/**
 *
 * @author Administrador
 */
public class EjecutivoDeCuenta implements IAprobador
{
    private IAprobador next;
    @Override
    public void setNext(IAprobador aprobador)
    {
        next=aprobador;
    }

    @Override
    public IAprobador getNext()
    {
        return next;
    }

    @Override
    public void solicitudPrestamo(int monto)
    {
        if(monto<=10000)
        {
            System.out.println("Lo manejo yo el Ejecutivo de Cuentas");
        }
        else
        {
            next.solicitudPrestamo(monto);
        }
    }
    
}
