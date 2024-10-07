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
public class EjerciciosEspalda implements EjerciciosIn{
      
    private final List<String> ejerciciosEspalda;
    private String ejercicio;
    
    public EjerciciosEspalda(){
        
        ejerciciosEspalda = new ArrayList<>();
        ejerciciosEspalda.add("Dominadas");
        ejerciciosEspalda.add("Remo con barra");
        ejerciciosEspalda.add("Remo con mancuernas");
        ejerciciosEspalda.add("Jalón al pecho");
        ejerciciosEspalda.add("Peso muerto");
        ejerciciosEspalda.add("Remo en máquina");
        ejerciciosEspalda.add("Hiperextensiones");
        ejerciciosEspalda.add("Pull-over con mancuerna");
        ejerciciosEspalda.add("Remo con cable");
        ejerciciosEspalda.add("Face pull");
        ejerciciosEspalda.add("Remo invertido");
        ejerciciosEspalda.add("Pullover en polea");
        ejerciciosEspalda.add("Remo con barra T");
        ejerciciosEspalda.add("Encogimientos de trapecio con barra");
    }
    
    @Override
    public String escogerEjercicio(){
        
        Random r = new Random();        
        
        int n = r.nextInt(ejerciciosEspalda.size());
        ejercicio = ejerciciosEspalda.get(n);
        ejerciciosEspalda.remove(n);
        return ejercicio;
    }   
}

