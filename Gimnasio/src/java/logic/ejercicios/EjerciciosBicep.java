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
public class EjerciciosBicep implements EjerciciosIn{
    
    private final List<String> ejerciciosBiceps;
    private String ejercicio;
    
    public EjerciciosBicep(){
       
       ejerciciosBiceps = new ArrayList<>();
       ejerciciosBiceps.add("Curl con barra");
       ejerciciosBiceps.add("Curl con mancuernas");
       ejerciciosBiceps.add("Curl martillo");
       ejerciciosBiceps.add("Curl concentrado");
       ejerciciosBiceps.add("Curl predicador");
       ejerciciosBiceps.add("Curl en banco inclinado");
       ejerciciosBiceps.add("Curl con banda de resistencia");
       ejerciciosBiceps.add("Curl con cable");
       ejerciciosBiceps.add("Curl inverso");
       ejerciciosBiceps.add("Curl de bíceps en máquina");
       ejerciciosBiceps.add("Curl con mancuerna en posición de pie");
       ejerciciosBiceps.add("Curl en martillo en banco inclinado");
       ejerciciosBiceps.add("Curl con barra Z");
       ejerciciosBiceps.add("Curl de bíceps con agarre ancho");
    }
    
    @Override
    public String escogerEjercicio(){
        
        Random r = new Random();        
        
        int n = r.nextInt(ejerciciosBiceps.size());
        ejercicio = ejerciciosBiceps.get(n);
        ejerciciosBiceps.remove(n);
        return ejercicio;
    }   
}
