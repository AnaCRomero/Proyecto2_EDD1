package proyecto.pkg2;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Ana Romero
 */
public class Transaccion {
    static ArrayList lista = new ArrayList<>();
    static Random r = new Random();

    public String Transaccion() {
        String aux="";
        int random = r.nextInt(3)+1;
                
        if (random == 1){
            aux = "Deposito";        
        }else if (random ==2){
            aux = "Retiro";
        }else{
            aux = "Pago";
        }
        lista.add(aux);
        return aux;
    }
    
    public ArrayList getListaT(){
        return this.lista;
    }
}
