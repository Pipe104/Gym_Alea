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
public class EjerciciosPecho {
    
    private final List<String> ejerciciosPecho;
    private String ejercicio;
    
    public EjerciciosPecho(){
        
        ejerciciosPecho = new ArrayList<>();
        ejerciciosPecho.add("Flexiones de brazos");
        ejerciciosPecho.add("Press de banca con barra");
        ejerciciosPecho.add("Press de banca con mancuernas");
        ejerciciosPecho.add("Press inclinado con mancuernas");
        ejerciciosPecho.add("Fondos en paralelas");
        ejerciciosPecho.add("Aperturas con mancuernas");
        ejerciciosPecho.add("Press de pecho en máquina");
        ejerciciosPecho.add("Flexiones en TRX");
        ejerciciosPecho.add("Pec Deck");
        ejerciciosPecho.add("Flexiones con agarre cerrado");
        ejerciciosPecho.add("Press declinado con barra"); 
        ejerciciosPecho.add("Cruces de cables"); 
        ejerciciosPecho.add("Flexiones en anillas");
        ejerciciosPecho.add("Press con mancuerna en banco inclinado");
    }
    
    public String tomarEjercicio(){
        
        Random r = new Random();        
        
        int n = r.nextInt(ejerciciosPecho.size());
        ejercicio = ejerciciosPecho.get(n);
        ejerciciosPecho.remove(n);
        return ejercicio;
    }
    
}
