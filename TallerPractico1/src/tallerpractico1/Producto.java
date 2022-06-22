/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpractico1;

/**
 * Representa un producto con sus metodos get y set
 * @author Jefferson Caceres
 */
public class Producto {
    
    private float id;
    public String name;
    protected float price;

    public float getId() {  // este metodo me devuelve la id 
        return id;
    }

    public void setId(float id) { // este metodo me permite modificar la id
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    
    
}
