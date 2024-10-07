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
public class EjerciciosCardio implements EjerciciosIn {
    
    private final List<String> ejerciciosCardio;
    private String ejercicio;
    
    public EjerciciosCardio() {
        ejerciciosCardio = new ArrayList<>();
        ejerciciosCardio.add("Correr 100 metros");
        ejerciciosCardio.add("Ciclismo 10 minutos");
        ejerciciosCardio.add("Saltar la cuerda 1 minuto");
        ejerciciosCardio.add("Burpees");
        ejerciciosCardio.add("HIIT (30 segundos de trabajo)");
        ejerciciosCardio.add("Nadar 20 metros");
        ejerciciosCardio.add("Elíptica 15 minutos");
        ejerciciosCardio.add("Saltos con rodillas al pecho");
        ejerciciosCardio.add("Boxeo 3 minutos");
        ejerciciosCardio.add("Caminar a paso rápido 5 minutos");
        ejerciciosCardio.add("Saltos en cuclillas");
        ejerciciosCardio.add("Mountain climbers");
        ejerciciosCardio.add("Tijeras");
        ejerciciosCardio.add("Kettlebell swings");
    }
    
    @Override
    public String escogerEjercicio(){
        
        Random r = new Random();        
        
        int n = r.nextInt(ejerciciosCardio.size());
        ejercicio = ejerciciosCardio.get(n);
        ejerciciosCardio.remove(n);
        return ejercicio;
    }   
    
}
