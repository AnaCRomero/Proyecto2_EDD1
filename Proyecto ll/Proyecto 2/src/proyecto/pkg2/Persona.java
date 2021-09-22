package proyecto.pkg2;

import java.util.ArrayList;

/**
 *
 * @author Ana Romero 
 */
public class Persona {
    static private ArrayList listaPersona = new ArrayList();
    static private String transaccion;
    
    public Persona() {
        listaPersona.add(transaccion);
    }
    
    public ArrayList AgregarPersona(){
        Transaccion tran = new Transaccion();
        transaccion = tran.Transaccion();
        listaPersona.add(transaccion);
        return listaPersona;    
    }

    @Override
    public String toString() {
        return Persona.transaccion;
    }
}
