/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cadena_de_responsabilidad;

/**
 *
 * @author Administrador
 */
public interface IAprobador
{
    public void setNext(IAprobador aprobador);
    public IAprobador getNext();
    public void solicitudPrestamo(int monto);
}
