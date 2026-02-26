/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capas.cliente;

import java.util.Map;

/**
 *
 * @author valde
 */
public class NCliente {

    private DCliente DatoCliente;

    public NCliente() {
        this.DatoCliente = new DCliente();
    }

    public void cargarDatos(Map<String, Object> data) {
        DatoCliente.cargarDatos(data);
    }

    public Object[] guardar() {
        return DatoCliente.guardar();
    }

    public Map<String, Object[]> listar() {
        return DatoCliente.listar();
    }

    public void eliminar(String id) {
        DatoCliente.eliminar(id);
    }
}
