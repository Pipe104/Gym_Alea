/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic.cliente;

/**
 *
 * @author laver
 */
public class Cliente {
    
    float peso;
    int edad;
    int dias;
    float estatura;
    String sexo;
    String nombre;
    String entrenador;
    String telEntrenador;

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String asignarCosto(int dias){
        
        switch (this.dias){
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
        return "No hay costo";
    }
    
    public String getAsignarEntrenador(){
        return entrenador;
    } 
            
    public void setAsignarEntrenador(String entrenador){
        this.entrenador = entrenador;
    }
    
    public String getTelEntrenador(){
        return telEntrenador;
    }
    
    public void setTelEntrenador(String telEntrenador){
        this.telEntrenador = telEntrenador;
    }
}
