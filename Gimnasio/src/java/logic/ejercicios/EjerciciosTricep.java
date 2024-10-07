/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic.ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author laver
 */
public class EjerciciosTricep implements EjerciciosIn {
    
    private final List<String> ejerciciosTriceps;
    private String ejercicio;
    
    public EjerciciosTricep(){
        
        ejerciciosTriceps = new ArrayList<>();
        ejerciciosTriceps.add("Fondos en paralelas");
        ejerciciosTriceps.add("Extensión de tríceps con mancuerna");
        ejerciciosTriceps.add("Extensión de tríceps en polea alta");
        ejerciciosTriceps.add("Press de tríceps en máquina");
        ejerciciosTriceps.add("Patada de tríceps");
        ejerciciosTriceps.add("Extensión de tríceps con barra");
        ejerciciosTriceps.add("Fondos en banco");
        ejerciciosTriceps.add("Extensión de tríceps con banda de resistencia");
        ejerciciosTriceps.add("Press francés con barra");
        ejerciciosTriceps.add("Rompecráneos con mancuerna");
        ejerciciosTriceps.add("Extensión de tríceps sobre la cabeza con mancuerna");
        ejerciciosTriceps.add("Press de tríceps con agarre cerrado");
        ejerciciosTriceps.add("Extensión de tríceps en banco inclinado");
        ejerciciosTriceps.add("Extensión de tríceps con cuerda en polea baja");
    }
    
    @Override
    public String escogerEjercicio(){
        
        Random r = new Random();        
        
        int n = r.nextInt(ejerciciosTriceps.size());
        ejercicio = ejerciciosTriceps.get(n);
        ejerciciosTriceps.remove(n);
        return ejercicio;
    }   
}
