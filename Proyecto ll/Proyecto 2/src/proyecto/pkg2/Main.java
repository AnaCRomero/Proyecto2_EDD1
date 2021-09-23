package proyecto.pkg2;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import static proyecto.pkg2.Lista.listaPilas;

/**
 *
 * @author Ana Romero - 11941043
 */
public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        rbtnC.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CantColas = new javax.swing.ButtonGroup();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        rbtnC = new javax.swing.JRadioButton();
        rbtnB = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cant = new javax.swing.JSpinner();
        GO = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        FONDO = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENU");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 50));

        CantColas.add(rbtnC);
        rbtnC.setForeground(new java.awt.Color(204, 204, 204));
        rbtnC.setText("Cajero");
        getContentPane().add(rbtnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        CantColas.add(rbtnB);
        rbtnB.setForeground(new java.awt.Color(204, 204, 204));
        rbtnB.setText("Banco");
        getContentPane().add(rbtnB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Cantidad de cajeros:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Crear cola en:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        cant.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        getContentPane().add(cant, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 70, -1));

        GO.setText("Go");
        GO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GOMouseClicked(evt);
            }
        });
        getContentPane().add(GO, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 100, 40));
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, -1, -1));

        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/foto.jpg"))); // NOI18N
        FONDO.setText("Crear cola en:");
        getContentPane().add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GOMouseClicked
        Hilo h = new Hilo(jProgressBar1, true);
        int cantidad = (int) cant.getValue();
        Pila pila = new Pila();
        Colas cola = new Colas();

        if (rbtnB.isSelected()) {
            h.run(cantidad);
            JOptionPane.showMessageDialog(null, "Termino el tiempo!!!");

            pila.MetePila();
            pila.imprimirPila();
            pila.AnulaPila();
            cola.anularColas();

        } else {
            ArrayList lista = new ArrayList();
            for (int i = 0; i < cantidad; i++) {
                lista = h.run2(cantidad);
            }
            JOptionPane.showMessageDialog(null, "Termino el tiempo!!!");

            pila.MetePila();
            pila.imprimirPila();
            pila.AnulaPila();
            cola.anularColas();
            lista.removeAll(lista);

        }
    }//GEN-LAST:event_GOMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup CantColas;
    private javax.swing.JLabel FONDO;
    private javax.swing.JButton GO;
    private javax.swing.JSpinner cant;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JRadioButton rbtnB;
    private javax.swing.JRadioButton rbtnC;
    // End of variables declaration//GEN-END:variables
    static Scanner entrada = new Scanner(System.in);
    JProgressBar a = jProgressBar1;
    Hilo b = new Hilo(a,true);
    
}
