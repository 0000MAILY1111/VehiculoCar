/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capas.cuota;

import capas.contrato.DContrato;
import java.time.LocalDate;

/**
 *
 * @author valde
 */
public class DCuota {

    public DCuota(int nroCuota, LocalDate fecha, double monto, boolean pagada, DContrato contrato) {
        this.nroCuota = nroCuota;
        this.fecha = fecha;
        this.monto = monto;
        this.pagada = pagada;
        this.contrato = contrato;
    }

    public int getNroCuota() {
        return nroCuota;
    }

    public void setNroCuota(int nroCuota) {
        this.nroCuota = nroCuota;
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

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public DContrato getContrato() {
        return contrato;
    }

    public void setContrato(DContrato contrato) {
        this.contrato = contrato;
    }
    private int nroCuota;
    private LocalDate fecha;
    private double monto;
    private boolean pagada;
    private DContrato contrato;

}
