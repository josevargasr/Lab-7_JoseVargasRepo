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
public class Usuario implements Serializable{
    private String nombre;
    private String apellido;
    private String usuario;
    private String password;
    private Date nacimiento;
    private ArrayList<Canción> canciones = new ArrayList();
    private ArrayList<Playlist> playlist = new ArrayList();
    private ArrayList<Artista> artistas = new ArrayList();
    private static final long serialVersionUID=777L;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String usuario, String password, Date nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.password = password;
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public ArrayList<Canción> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Canción> canciones) {
        this.canciones = canciones;
    }

    public ArrayList<Playlist> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(ArrayList<Playlist> playlist) {
        this.playlist = playlist;
    }

    public ArrayList<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(ArrayList<Artista> artistas) {
        this.artistas = artistas;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
    
    
    
}
