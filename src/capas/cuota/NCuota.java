/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capas.cuota;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author valde
 */
public class NCuota {

    private List<DCuota> cuotas;

    public NCuota() {
        this.cuotas = new ArrayList<>();
    }

    public void registrarCuota(DCuota cuota) {
        if (cuota != null) {
            this.cuotas.add(cuota);
        }
    }

    public List<DCuota> listarCuotas() {
        return new ArrayList<>(this.cuotas);
    }
}

