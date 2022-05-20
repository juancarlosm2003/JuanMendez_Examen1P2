/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juanmendez_examen1p2;

/**
 *
 * @author Juan Carlos Mendez
 */
public class laptop extends PCS {

    String marca, definicion;
    boolean RGB;

    public laptop() {
        super();
    }

    public laptop(String marca, String definicion, boolean RGB, String direccion, String mascara, String hostname, int RAM, int almacenamiento) {
        super(direccion, mascara, hostname, RAM, almacenamiento);
        this.marca = marca;
        this.definicion = definicion;
        this.RGB = RGB;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDefinicion() {
        return definicion;
    }

    public void setDefinicion(String definicion) {
        this.definicion = definicion;
    }

    public boolean isRGB() {
        return RGB;
    }

    public void setRGB(boolean RGB) {
        this.RGB = RGB;
    }

    @Override
    public String toString() {
        return "laptop{" + "marca=" + marca + ", definicion=" + definicion + ", RGB=" + RGB + '}';
    }

}
