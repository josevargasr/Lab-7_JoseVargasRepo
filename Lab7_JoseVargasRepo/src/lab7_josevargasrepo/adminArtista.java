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
public class adminArtista {
    private ArrayList<Artista> listaartistas = new ArrayList();
    private File archivo = null;

    public adminArtista(String path) {
        archivo = new File(path);
    }

    public ArrayList<Artista> getListaartistas() {
        return listaartistas;
    }

    public void setListaartistas(ArrayList<Artista> listaartistas) {
        this.listaartistas = listaartistas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "adminArtista{" + "listaartistas=" + listaartistas + ", archivo=" + archivo + '}';
    }
    
    public void cargarArchivo() {
        try {            
            listaartistas = new ArrayList();
            Artista temp;
            if (archivo.exists()) {
                  FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Artista) objeto.readObject()) != null) {
                        listaartistas.add(temp);
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
            for (Artista t : listaartistas) {
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
