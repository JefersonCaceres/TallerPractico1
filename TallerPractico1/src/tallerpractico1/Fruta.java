/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpractico1;

import java.util.ArrayList;

/**
 * Representa fruta con sus atributos 
 * @author Jefferson Caceres
 */
public class Fruta {
    String name;
    private float averageWeight;
    ArrayList<String> colors;
    
    
    // metodo get de ArrayList
    public ArrayList<String> getColors() {
        return colors;
    }
    // metodo set
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
    
}
