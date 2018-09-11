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
public class Raton extends DispositivoEntrada {

    private final int idRaton;
    private static int contadorRatones;
    
    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
            ++contadorRatones;
        idRaton = contadorRatones;
    }

    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + '}';
    }
}
