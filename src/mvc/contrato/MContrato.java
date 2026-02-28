/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.contrato;


import java.time.LocalDate;
import java.util.List;
import mvc.cliente.MCliente;
import mvc.cuota.MCuota;
import mvc.vehiculo.MVehiculo;

/**
 *
 * @author valde
 */
public class MContrato {

    private String nroContrato;
    private LocalDate fecha;
    private double monto;
    private MVehiculo vehiculo;
    private MCliente cliente;
    private List<MCuota> cuotas;

    public MContrato(String nroContrato, LocalDate fecha, double monto, MVehiculo vehiculo, MCliente cliente, List<MCuota> cuotas) {
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

    public MVehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(MVehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public MCliente getCliente() {
        return cliente;
    }

    public void setCliente(MCliente cliente) {
        this.cliente = cliente;
    }

    public List<MCuota> getCuotas() {
        return cuotas;
    }

    public void setCuotas(List<MCuota> cuotas) {
        this.cuotas = cuotas;
    }
}
