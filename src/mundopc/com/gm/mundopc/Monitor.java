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
public class Monitor {
    private final int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitores;
    
    public Monitor()
    {
        ++contadorMonitores;
        idMonitor = contadorMonitores;
    }
    public Monitor(String m, double t)
    {
        this();
        marca = m;
        tamanio = t;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }
    
    public String toString()
    {
        return "Monitor{id: "+this.idMonitor+" marca: "+this.marca+" tamaño: "+this.tamanio+"}";
    }
}
