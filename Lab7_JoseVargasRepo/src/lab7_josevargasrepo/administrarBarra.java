package lab7_josevargasrepo;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;

public class administrarBarra extends Thread {

    private JProgressBar barra;
    private boolean vive;
    private JTable tabla;
    private JDialog ventana;
    private JList lista;
    private JLabel parte;
    private Playlist p;

    public administrarBarra(JProgressBar barra, JTable tabla, JDialog ventana, JLabel parte, Playlist p) {
        this.barra = barra;
        vive = true;
        this.tabla = tabla;
        this.ventana = ventana;
        this.parte = parte;
        this.p = p;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    @Override
    public void run() {
        while (vive) {
            DefaultTableModel m = (DefaultTableModel) tabla.getModel();
            for (int i = 0; i < p.getCanciones().size(); i++) {
                parte.setText("Reproduciendo: " + p.getCanciones().get(i).getNombre());
                barra.setValue(0);
                barra.setMaximum(p.getCanciones().get(i).getDuracion());
                for (int j = 0; j < barra.getMaximum(); j++) {
                    barra.setValue(barra.getValue() + 1);
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                }
                Object[] row = {p.getCanciones().get(i).getNombre(), p.getCanciones().get(i).getDuracion() + " segundos"};
                m.addRow(row);
                tabla.setModel(m);
                barra.setValue(0);
            }
            JOptionPane.showMessageDialog(ventana, "Fin de la reproducción");
            ventana.dispose();
            vive = false;
        }
    }
    

}
