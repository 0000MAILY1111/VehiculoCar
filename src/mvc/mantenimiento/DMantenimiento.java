/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.mantenimiento;

import capas.mantenimiento.*;
import capas.Database;
import capas.vehiculo.DVehiculo;
import java.time.LocalDate;

/**
 *
 * @author valde
 */
public class DMantenimiento {

   private int nroMantenimiento;
    private LocalDate fecha;
    private String placa;
    private String marca;
    private String modelo;
    private String accesorios; // Ej: "Radio, ETC"
    private String descripcion;
    private String personaRecepcion;
    private DVehiculo vehiculo;

    private Database database;

    public DMantenimiento(int nroMantenimiento, LocalDate fecha, String placa, String marca, String modelo, String accesorios, String descripcion, String personaRecepcion, DVehiculo vehiculo, Database database) {
        this.nroMantenimiento = nroMantenimiento;
        this.fecha = fecha;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.accesorios = accesorios;
        this.descripcion = descripcion;
        this.personaRecepcion = personaRecepcion;
        this.vehiculo = vehiculo;
        this.database = database;
    }

    public int getNroMantenimiento() {
        return nroMantenimiento;
    }

    public void setNroMantenimiento(int nroMantenimiento) {
        this.nroMantenimiento = nroMantenimiento;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
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

    public String getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(String accesorios) {
        this.accesorios = accesorios;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPersonaRecepcion() {
        return personaRecepcion;
    }

    public void setPersonaRecepcion(String personaRecepcion) {
        this.personaRecepcion = personaRecepcion;
    }

    public DVehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(DVehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Database getDatabase() {
        return database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }
   

}
