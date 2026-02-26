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

    private String id;
    private String ci;
    private String nombrecompleto;

    private Database database;

    public DCliente() {
        this.id = "";
        this.ci = "";
        this.nombrecompleto = "";
        this.database= new Database();
    }

    public DCliente(String id, String ci, String nombrecompleto) {
        this.id = id;
        this.ci = ci;
        this.nombrecompleto = nombrecompleto;
        this.database = new Database();
    }
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

