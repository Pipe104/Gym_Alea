/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic.cliente;

import logic.cliente.Cliente;

/**
 *
 * @author laver
 */
public class ClienteNormal extends Cliente{
    
    @Override
    public String asignarCosto(int dias){
        
        switch (dias){
            case 3 -> {
                return "El valor de su mensualiad es de 50 mil pesos";
            }
            case 4 -> {
                return "El valor de su mensualidad es de 55 mil pesos";
            }
            case 5 -> {
                return "El valor de su mensualidad es de 60 mil pesos";
            }
            case 6 -> {
                return "El valor de su mensualidad es de 65 mil pesos";
            }
        }
        return "Hubo un error en la seleccion de su costo";
    }
    
}
