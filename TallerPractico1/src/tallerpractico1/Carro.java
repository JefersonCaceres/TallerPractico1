/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpractico1;

/**
 *  representa un carro con sus atributos y metodos
 * @author Jefferson Caceres
 */
public class Carro {
    
    private int model;
    protected String make;
    public String color;
    public double peso;
    public byte doorNumber;
    public boolean start;

    public Carro() {
        
        this.start= true;
        
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getMarca() {
        return make;
    }

    public void setMarca(String marca) {
        this.make = marca;
    }
    // con este metodo sabemos si el carro esta encendido 
    public void StartCar(){
        if(start==true){
        System.out.println("el carro esta encendido");
        }else{
            System.out.println("El Carro esta apagado");
        }
    }
    
    
}
