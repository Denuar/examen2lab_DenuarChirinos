/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2lab_denuarchirinos;

/**
 *
 * @author Denuar
 */
public class Tecnico {
    private String nombre, edad, genero;
    private int cantidad;

    public Tecnico() {
    }

    public Tecnico(String nombre, String edad, String genero, int cantidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Tecnico{" + "nombre=" + nombre + ", cantidad=" + cantidad + '}';
    }
    
}
