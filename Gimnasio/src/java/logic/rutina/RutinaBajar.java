/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic.rutina;
import java.util.concurrent.ThreadLocalRandom;
import logic.ejercicios.*;
/**
 *
 * @author laver
 */
public class RutinaBajar implements Rutina {

    // Para manejar los ejercicios de cada parte del cuerpo
    String exPecho;
    String exEspalda;
    String exBicep;
    String exPierna;
    String exCardio;
    
    
    // Para almacenar la rutina del día
    StringBuilder rutina = new StringBuilder();
    
    double peso;

    public RutinaBajar(double peso) {
        this.peso = peso;
    }

    @Override
    public String hacerRutina() {

        // Para generar una cantidad de dias aleatoria
         int d = ThreadLocalRandom.current().nextInt(2, 7);
        
        EjerciciosPecho pecho = new EjerciciosPecho();
        EjerciciosEspalda espalda = new EjerciciosEspalda();
        EjerciciosBicep bicep = new EjerciciosBicep();
        EjerciciosPierna pierna = new EjerciciosPierna();
        EjerciciosCardio cardio = new EjerciciosCardio();
        
        for (int i = 0; i < d; i++) {
            rutina.append("<h3> Día ").append(i + 1).append("</h3>").append("<br>");

            // Ejercicio de Pecho
            exPecho = pecho.tomarEjercicio();
            rutina.append(exPecho).append(" - ");
            rutina.append(calcularSeriesYRepeticiones(peso, "pecho")).append("<br>");
            
            // Ejercicio de Espalda
            exEspalda = espalda.escogerEjercicio();
            rutina.append(exEspalda).append(" - ");
            rutina.append(calcularSeriesYRepeticiones(peso, "espalda")).append("<br>");
            
            // Ejercicio de Pierna
            exPierna = pierna.escogerEjercicio();
            rutina.append(exPierna).append(" - ");
            rutina.append(calcularSeriesYRepeticiones(peso, "pierna")).append("<br>");
            
            // Ejercicio de Bíceps
            exBicep = bicep.escogerEjercicio();
            rutina.append(exBicep).append(" - ");
            rutina.append(calcularSeriesYRepeticiones(peso, "bicep")).append("<br>");
            
            // Ejercicios de Cardio (dos veces)
            for (int j = 0; j < 2; j++) {
                exCardio = cardio.escogerEjercicio();
                rutina.append(exCardio).append(" - ");
                rutina.append(calcularSeriesYRepeticiones(peso, "cardio")).append("<br>");
            }
            
            rutina.append("<br>");
        }

        return rutina.toString();
    }

    @Override
    public String calcularSeriesYRepeticiones(double peso, String tipoEjercicio) {
        int series;
        int repeticiones;
        
        switch (tipoEjercicio.toLowerCase()) {
            case "pecho" -> {
                series = (int) Math.ceil(peso / 8); 
                repeticiones = (int) Math.min(20, 12 + peso / 20);
            }
                
            case "espalda" -> {
                series = (int) Math.ceil(peso / 9);
                repeticiones = (int) Math.min(18, 14 + peso / 18);
            }
                
            case "pierna" -> {
                series = (int) Math.ceil(peso / 7);
                repeticiones = (int) Math.max(15, 10 + peso / 15);
            }
                
            case "bicep" -> {
                series = (int) Math.ceil(peso / 10); 
                repeticiones = (int) Math.max(12, 8 + peso / 12);
            }
                
            case "cardio" -> {
                series = 5; // Series fijas para cardio
                repeticiones = (int) Math.max(20, 25 + peso / 25);
            }
                
            default -> {
                series = (int) Math.ceil(peso / 8); 
                repeticiones = (int) Math.max(10, 12);
            }
        }
        
        return series + " series de " + repeticiones + " repeticiones";
    }
}
