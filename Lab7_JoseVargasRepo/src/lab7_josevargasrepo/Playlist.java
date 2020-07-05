/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_josevargasrepo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author josevargas
 */
public class Playlist implements Serializable{
    private String nombre;
    private String genero;
    private Date creacion;
    private ArrayList<Canción> canciones = new ArrayList();
    private int duracion;
    private static final long serialVersionUID=777L;

    public Playlist() {
    }

    
    
    public Playlist(String nombre, String genero, Date creacion, int duracion) {
        this.nombre = nombre;
        this.genero = genero;
        this.creacion = creacion;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getCreacion() {
        return creacion;
    }

    public void setCreacion(Date creacion) {
        this.creacion = creacion;
    }

    public ArrayList<Canción> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Canción> canciones) {
        this.canciones = canciones;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return nombre + " | " + genero + " | " + duracion + " segundos";
    }
    
    
    
}
