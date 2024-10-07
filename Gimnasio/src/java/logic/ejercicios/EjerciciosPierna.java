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
public class EjerciciosPierna implements EjerciciosIn{
    
    private final List<String> ejerciciosPierna;
    private String ejercicio;
    
    public EjerciciosPierna(){
        
        ejerciciosPierna = new ArrayList<>();
        ejerciciosPierna.add("Sentadillas");
        ejerciciosPierna.add("Prensa de piernas");
        ejerciciosPierna.add("Zancadas");
        ejerciciosPierna.add("Peso muerto rumano");
        ejerciciosPierna.add("Extensión de piernas");
        ejerciciosPierna.add("Curl de piernas");
        ejerciciosPierna.add("Elevación de talones (pantorrillas)");
        ejerciciosPierna.add("Sentadilla sumo");
        ejerciciosPierna.add("Sentadilla en una pierna");
        ejerciciosPierna.add("Puente de glúteos");
        ejerciciosPierna.add("Sentadilla frontal");
        ejerciciosPierna.add("Peso muerto convencional");
        ejerciciosPierna.add("Zancadas laterales");
        ejerciciosPierna.add("Elevación de talones en prensa");
    }
    
    @Override
    public String escogerEjercicio(){
        
        Random r = new Random();        
        
        int n = r.nextInt(ejerciciosPierna.size());
        ejercicio = ejerciciosPierna.get(n);
        ejerciciosPierna.remove(n);
        return ejercicio;
    }   
}
