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
public class Computadora {
    private String serie, año, color, material;
    private Parte parte;

    public Computadora() {
    }

    public Computadora(String serie, String año, String color, String material, Parte parte) {
        this.serie = serie;
        this.año = año;
        this.color = color;
        this.material = material;
        this.parte = parte;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Parte getParte() {
        return parte;
    }

    public void setParte(Parte parte) {
        this.parte = parte;
    }

    @Override
    public String toString() {
        return "Computadora{" + "serie=" + serie + ", color=" + color + ", parte=" + parte + '}';
    }
    
}
