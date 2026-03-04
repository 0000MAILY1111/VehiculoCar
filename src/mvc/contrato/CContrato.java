/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.contrato;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import mvc.cliente.MCliente;
import mvc.cuota.CCuota;
import mvc.cuota.MCuota;
import mvc.vehiculo.MVehiculo;

/**
 *
 * @author valde
 */
public class CContrato {

    private List<MContrato> contratos;

    public CContrato() {
        this.contratos = new ArrayList<>();
    }

    public void registrarContrato(MContrato contrato) {
        if (contrato != null) {
            this.contratos.add(contrato);
        }
    }

    public List<MContrato> listarContratos() {
        return new ArrayList<>(this.contratos);
    }

    /**
     * Caso de uso complejo: Registrar contrato de venta a crédito y generar
     * automáticamente las cuotas.
     */
    public MContrato registrarContratoCredito(
            String nroContrato,
            LocalDate fecha,
            double montoTotal,
            MCliente cliente,
            MVehiculo vehiculo,
            int cantidadCuotas,
            LocalDate fechaPrimeraCuota,
            CCuota negocioCuota
    ) {

        if (cantidadCuotas <= 0) {
            throw new IllegalArgumentException("La cantidad de cuotas debe ser mayor a cero");
        }

        List<MCuota> cuotas = new ArrayList<>();
        double montoCuota = montoTotal / cantidadCuotas;

        // Crear contrato sin cuotas inicialmente
        MContrato contrato = new MContrato(nroContrato, fecha, montoTotal, vehiculo, cliente, cuotas);

        for (int i = 1; i <= cantidadCuotas; i++) {
            LocalDate fechaCuota = fechaPrimeraCuota.plusMonths(i - 1);
            MCuota cuota = new MCuota(i, fechaCuota, montoCuota, false, contrato);
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
