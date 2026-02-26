/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capas.cliente;

import java.util.Map;
import capas.Database;

/**
 *
 * @author valde
 */
public class DCliente {

    public DCliente(String id, String ci, String nombrecompleto, String telefono, String direccion, Database database) {
        this.id = id;
        this.ci = ci;
        this.nombrecompleto = nombrecompleto;
        this.telefono = telefono;
        this.direccion = direccion;
        this.database = database;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Database getDatabase() {
        return database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }

    private String id;
    private String ci;
    private String nombrecompleto;
    private String telefono;
    private String direccion;

    private Database database;

    
     public Object[] guardar() {
        Object[] data = {id, ci, nombrecompleto};
        return database.store(data);
    }

    public Map<String, Object[]> listar() {
        return this.database.list();
    }

    public void cargarDatos(Map<String, Object> dato) {
        id = dato.get("id").toString();
        ci = dato.get("ci").toString();
        nombrecompleto = dato.get("nombrecompleto").toString();

    }

    public void eliminar(String id) {
        database.delete(id);
    }
    
    
}

