package proyecto.pkg2;
import java.util.ArrayList;

/**
 *
 * @author Ana Romero
 */
public class Lista {
    static ArrayList listaColas = new ArrayList();
    static ArrayList listaPilas = new ArrayList();
    
    public void imprimirC() {
        for (int i = 0; i < listaColas.size(); i++) {
            System.out.print("[" + listaColas.get(i) + "]");
        }
        System.out.println("");
    }
    
    public void imprimirP() {
        for (int i = 0; i < listaPilas.size(); i++) {
            System.out.print("[" + listaPilas.get(i) + "]");
        }
        System.out.println("");
    }
 
    public void anularP(){
        listaPilas.removeAll(listaPilas);
    }
    
    public void anularC(){
        listaColas.removeAll(listaColas);
    }
}
