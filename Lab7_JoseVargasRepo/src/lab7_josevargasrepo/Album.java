/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_josevargasrepo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author josevargas
 */
public class Album implements Serializable{
    private String nombre;
    private String año;
    private Artista artista;
    private ArrayList<Canción> canciones = new ArrayList();
    private static final long serialVersionUID=777L;

    public Album(String nombre, String año, Artista artista) {
        this.nombre = nombre;
        this.año = año;
        this.artista = artista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public ArrayList<Canción> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Canción> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return "Album{" + "nombre=" + nombre + ", a\u00f1o=" + año + ", artista=" + artista + '}';
    }
    
    
}
