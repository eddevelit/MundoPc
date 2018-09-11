/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundopc.com.gm.mundopc;

/**
 *
 * @author HP
 */
public class Teclado extends DispositivoEntrada{

    private final int idTeclado; 
    private static int contadorTeclados;
    
    public Teclado(String tipoEntrada, String marca)
    {
        super(tipoEntrada,marca);
        ++contadorTeclados;
        idTeclado = contadorTeclados;
    }

    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idTeclado + " marca: " + super.getMarca()+'}';
    }
    
    
    
}
