/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_josevargasrepo;

import java.io.Serializable;

/**
 *
 * @author josevargas
 */
public class Canción implements Serializable{
    private String nombre;
    private int año;
    private Artista artista;
    private int duracion;
    private static final long serialVersionUID=777L;

    
    public Canción(String nombre, int año, Artista artista, int duracion) {
        this.nombre = nombre;
        this.año = año;
        this.artista = artista;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return nombre + " | " + artista + " | " + duracion + " segundos";
    }
    
    
}
