/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capas.contrato;

import capas.cliente.DCliente;
import capas.cuota.DCuota;
import capas.cuota.NCuota;
import capas.vehiculo.DVehiculo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author valde
 */
public class NContrato {

    private List<DContrato> contratos;

    public NContrato() {
        this.contratos = new ArrayList<>();
    }

    public void registrarContrato(DContrato contrato) {
        if (contrato != null) {
            this.contratos.add(contrato);
        }
    }

    public List<DContrato> listarContratos() {
        return new ArrayList<>(this.contratos);
    }

    /**
     * Caso de uso complejo: Registrar contrato de venta a crédito y generar
     * automáticamente las cuotas.
     */
    public DContrato registrarContratoCredito(
            String nroContrato,
            LocalDate fecha,
            double montoTotal,
            DCliente cliente,
            DVehiculo vehiculo,
            int cantidadCuotas,
            LocalDate fechaPrimeraCuota,
            NCuota negocioCuota
    ) {

        if (cantidadCuotas <= 0) {
            throw new IllegalArgumentException("La cantidad de cuotas debe ser mayor a cero");
        }

        List<DCuota> cuotas = new ArrayList<>();
        double montoCuota = montoTotal / cantidadCuotas;

        // Crear contrato sin cuotas inicialmente
        DContrato contrato = new DContrato(nroContrato, fecha, montoTotal, vehiculo, cliente, cuotas);

        for (int i = 1; i <= cantidadCuotas; i++) {
            LocalDate fechaCuota = fechaPrimeraCuota.plusMonths(i - 1);
            DCuota cuota = new DCuota(i, fechaCuota, montoCuota, false, contrato);
            cuotas.add(cuota);

            if (negocioCuota != null) {
                negocioCuota.registrarCuota(cuota);
            }
        }

        contrato.setCuotas(cuotas);
        registrarContrato(contrato);

        return contrato;
    }
}

