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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author valde
 */
public class NMantenimiento {
    
    private List<DMantenimiento> mantenimientos;
    private int contadorMantenimientos;

    public NMantenimiento() {
        this.mantenimientos = new ArrayList<>();
        this.contadorMantenimientos = 0;
    }

    /**
     * CASO DE USO: Registrar Mantenimiento
     * Se registra cuando el vehículo alcanza los 5000 km
     */
    public DMantenimiento registrarMantenimiento(DVehiculo vehiculo, 
                                               String accesorios,
                                               String descripcion,
                                               String personaRecepcion) throws Exception {
        
        // Validar que el vehículo requiera mantenimiento
        if (!vehiculo.requiereMantenimiento()) {
            System.out.println("⚠ Advertencia: El vehículo tiene " + 
                             vehiculo.getKilometraje() + " km. " +
                             "Aún no requiere mantenimiento (5000 km)");
        }
        
        contadorMantenimientos++;
        
       
        DMantenimiento mantenimiento = new DMantenimiento(
            contadorMantenimientos,           // nroMantenimiento
            LocalDate.now(),                  // fecha
            vehiculo.getPlaca(),              // placa
            vehiculo.getMarca(),              // marca
            vehiculo.getModelo(),             // modelo
            accesorios,                       // accesorios
            descripcion,                      // descripcion
            personaRecepcion,                 // personaRecepcion
            vehiculo,                         // vehiculo
            new Database()                    // database
        );
        
        mantenimiento.setVehiculo(vehiculo);
        mantenimientos.add(mantenimiento);
        
        // Resetear kilometraje después del mantenimiento
        vehiculo.agregarKilometraje(-vehiculo.getKilometraje());
        
        System.out.println("✓ Mantenimiento registrado exitosamente");
        return mantenimiento;
    }

    public List<DMantenimiento> consultarMantenimientosPorPlaca(String placa) {
        List<DMantenimiento> resultado = new ArrayList<>();
        for (DMantenimiento m : mantenimientos) {
            if (m.getPlaca() != null && m.getPlaca().equalsIgnoreCase(placa)) {
                resultado.add(m);
            }
        }
        return resultado;
    }

    public List<DMantenimiento> getAllMantenimientos() {
        return new ArrayList<>(mantenimientos);
    }
    
    // ✅ MÉTODO ADICIONAL: Buscar por número de mantenimiento
    public DMantenimiento buscarPorNumero(int nroMantenimiento) {
        return mantenimientos.stream()
                .filter(m -> m.getNroMantenimiento() == nroMantenimiento)
                .findFirst()
                .orElse(null);
    }
    
    // ✅ MÉTODO ADICIONAL: Contar mantenimientos de un vehículo
    public int contarMantenimientosPorPlaca(String placa) {
        return (int) mantenimientos.stream()
                .filter(m -> m.getPlaca() != null && m.getPlaca().equalsIgnoreCase(placa))
                .count();
    }
}