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
public class Computadora {
    private final int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorComputadora;
    
    public Computadora()
    {
        ++contadorComputadora;
        idComputadora = contadorComputadora;
    }
    public Computadora(String nombre)
    {
        this();
        this.nombre = nombre;
    }
    
}
