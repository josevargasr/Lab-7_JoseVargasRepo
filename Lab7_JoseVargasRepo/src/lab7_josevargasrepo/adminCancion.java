/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_josevargasrepo;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author josevargas
 */
public class adminCancion {
    private ArrayList<Canción > listacanciones = new ArrayList();
    private File archivo = null;

    public adminCancion(String path) {
        archivo = new File(path);
    }

    public ArrayList<Canción> getListacanciones() {
        return listacanciones;
    }

    public void setListacanciones(ArrayList<Canción> listacanciones) {
        this.listacanciones = listacanciones;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "adminCancion{" + "listacanciones=" + listacanciones + ", archivo=" + archivo + '}';
    }
    
    public void cargarArchivo() {
        try {            
            listacanciones = new ArrayList();
            Canción temp;
            if (archivo.exists()) {
                  FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Canción) objeto.readObject()) != null) {
                        listacanciones.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            } //fin if           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Canción t : listacanciones) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
