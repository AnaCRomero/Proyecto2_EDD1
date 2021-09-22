package proyecto.pkg2;
import java.util.ArrayList;


/**
 *
 * @author Ana Romero
 */
public class Colas extends Lista{
    Transaccion trans = new Transaccion();
    static Cajero cajero = new Cajero();


    public void imprimirColas() {
        for (int i = 0; i < listaColas.size(); i++) {
            System.out.print(listaColas.get(i));
        }
        System.out.println("");
    }
    
    public void agregarColas(int cant) {
        for (int i = 0; i < cant; i++) {
            listaColas.add(cajero);
        }
    }
    
    public ArrayList agregarColas2(int cant) {
        for (int i = 0; i < cant; i++) {
            listaColas.add(cajero);
        }
        return listaColas;
    }
    
    public void anularColas(){
        listaColas.removeAll(listaColas);
    }
    
    public void quitarColas(int pos){
        listaColas.remove(pos);
        System.out.println("Elemento eliminado exitosamente!!");
    }
}
