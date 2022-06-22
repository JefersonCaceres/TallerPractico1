/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpractico1;

/**
 * Representa un futbolista con sus metodos
 * @author Jefferson Caceres
 */
public class Futbolista {
    
    private String team;
    public String name;
    public String latsName;
    public int shirtNumber;
    protected String gamePosition;
    public String dominantFoot;
    public int age;
    public boolean localGame;

    public Futbolista() {
       this.localGame=false;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getGamePosition() {
        return gamePosition;
    }

    public void setGamePosition(String gamePosition) {
        this.gamePosition = gamePosition;
    }

    

   
    // este metodo nos dice si el jugador se encuentra en consentracion 
    public void Concentrarse(){
        System.out.println("The player is concentrating for the next match");
    }
    
    // Este metodo nos dice si el jugador juega de local o viaja de visitante 
    public void Viajar(boolean lugarJuego){
        if(lugarJuego==localGame){
            System.out.println("The player goes on a trip for his next meeting");
        }else{
            System.out.println("The player will play at home");
        }
    
    }
}
