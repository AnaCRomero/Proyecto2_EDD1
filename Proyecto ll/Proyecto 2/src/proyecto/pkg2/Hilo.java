package proyecto.pkg2;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JProgressBar;

/**
 *
 * @author Ana Romero
 */
public class Hilo {
    private boolean vivo;
    private JProgressBar ProgressBar;
    static Random r = new Random();
    static private int cantidad;
    static private int aux=0;
    static private Colas cola1 = new Colas();
    static ArrayList lista = new ArrayList();
    static private ArrayList valores = new ArrayList();

    public Hilo(JProgressBar ProgressBar, boolean vivo) {
        this.ProgressBar = ProgressBar;
        this.vivo = vivo;
    }

    public void run(int cajeros) {
        while (aux <= 1200){
            while (ProgressBar.getValue() <= ProgressBar.getMaximum() - 1) {
                if (vivo) {
                    ProgressBar.setValue(ProgressBar.getValue() + 1);
                }
                try {
                    cola1.agregarColas(cajeros);
                    int random = r.nextInt(3)+1;
                    
                    switch (random) {
                        case 1: {
                            cantidad = 10;
                            aux+=cantidad;
                            this.valores.add(cantidad);
                        }break;
                        case 2: {
                            cantidad = 20;
                            aux+=cantidad;
                            this.valores.add(cantidad);
                        }break;
                        case 3: {
                            cantidad = 30;
                            aux+=cantidad;
                            this.valores.add(cantidad);
                        }break;
                    }
                    Thread.sleep(1200);
                } catch (InterruptedException ex) {
                    System.out.println("Lo sentimos, ha ocurrido un error :c");
                }
            }
        }
    }
    
    public ArrayList run2(int cajeros) {
        while(aux <= 1200){
            while (ProgressBar.getValue() <= ProgressBar.getMaximum() - 1) {
                if (vivo) {
                    ProgressBar.setValue(ProgressBar.getValue() + 1);
                }
                try {
                    lista = cola1.agregarColas2(cajeros);
                    int random = 0;
                    random = r.nextInt(3)+1;

                    switch (random) {
                        case 1: {
                            cantidad = 10;
                            aux+=cantidad;
                            this.valores.add(cantidad);
                        }break;
                        case 2: {
                            cantidad = 20;
                            aux+=cantidad;
                            this.valores.add(cantidad);
                        }break;
                        case 3: {
                            cantidad = 30;
                            aux+=cantidad;
                            this.valores.add(cantidad);
                        }break;
                    }
                    Thread.sleep(1200);
                } catch (InterruptedException ex) {
                    System.out.println("Lo sentimos, ha ocurrido un error :c");
                }
            }
        }
        return lista;
    }

    public int getValor() {
        return this.cantidad;
    }
}
