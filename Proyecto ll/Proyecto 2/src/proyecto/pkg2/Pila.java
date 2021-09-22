package proyecto.pkg2;
import java.util.ArrayList;

/**
 *
 * @author Ana Romero
 */
public class Pila extends Lista{
    public void imprimirPila() {      
        for (int i = 0; i < listaPilas.size(); i++) {
            System.out.println("[" + listaPilas.get(i)+"]");
        }
        System.out.println("");
        
    }
    
    
    public ArrayList AnulaPila() {
        listaPilas.removeAll(listaPilas);
        return listaPilas;
    }
    
    public char TopePila(){
        System.out.println(listaPilas);
        int tam = listaPilas.size();
        char cadena;
        cadena = (char) listaPilas.get(tam);
        return cadena;
    }
    
    public void MetePila() {
        Transaccion transaccion = new Transaccion();
        ArrayList aux = new ArrayList();
        aux = transaccion.getListaT();
        listaPilas = aux;
    }
    
    public boolean VaciaPila(ArrayList lista){
        boolean flag;
        if (!lista.isEmpty()) {
            flag = false;
        }else{
            flag = true;
        }
        return flag;
    }
}
