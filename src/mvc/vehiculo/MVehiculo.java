/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.vehiculo;

import mvc.Database;



/**
 *
 * @author valde
 */
public class MVehiculo {

    public MVehiculo(String placa, String marca, String modelo, String nroChasis, String color, int kilometraje, Database database) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.nroChasis = nroChasis;
        this.color = color;
        this.kilometraje = kilometraje;
        this.database = database;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNroChasis() {
        return nroChasis;
    }

    public void setNroChasis(String nroChasis) {
        this.nroChasis = nroChasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public Database getDatabase() {
        return database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }

      private String placa;
    private String marca;
    private String modelo;
        private String nroChasis;
    private String color;
    private int kilometraje;

    private Database database;
       @Override
    public String toString() {
        return "Vehiculo{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", nroChasis='" + nroChasis + '\'' +
                ", color='" + color + '\'' +
                ", kilometraje=" + kilometraje +
                '}';
    }

    public boolean requiereMantenimiento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void agregarKilometraje(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}