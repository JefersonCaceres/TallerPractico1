/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpractico1;

/**
 * Representa una cuenta bancaria con sus atributos
 * @author Jefferson Caceres
 */
public class CuentaBancaria {
    private int accountNumber;
    protected boolean activated;



// metodo get     
    public boolean getActivated() {
        return activated;
    }
// metodo set
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
    
    
}
