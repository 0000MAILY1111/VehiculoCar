/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capas.contrato;

import capas.cliente.DCliente;
import capas.cuota.DCuota;
import capas.vehiculo.DVehiculo;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author valde
 */
public class DContrato {

    private String nroContrato;
    private LocalDate fecha;
    private double monto;
    private DVehiculo vehiculo;
    private DCliente cliente;
    private List<DCuota> cuotas;

    public DContrato(String nroContrato, LocalDate fecha, double monto, DVehiculo vehiculo, DCliente cliente, List<DCuota> cuotas) {
        this.nroContrato = nroContrato;
        this.fecha = fecha;
        this.monto = monto;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.cuotas = cuotas;
    }

    public String getNroContrato() {
        return nroContrato;
    }

    public void setNroContrato(String nroContrato) {
        this.nroContrato = nroContrato;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public DVehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(DVehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public DCliente getCliente() {
        return cliente;
    }

    public void setCliente(DCliente cliente) {
        this.cliente = cliente;
    }

    public List<DCuota> getCuotas() {
        return cuotas;
    }

    public void setCuotas(List<DCuota> cuotas) {
        this.cuotas = cuotas;
    }
}
