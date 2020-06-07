/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gofo;

/**
 *
 * @author Abd Elrahman
 */

import java.util.ArrayList;
public class Player extends User{
       private Playground obj1;
    private ArrayList<Player> MyTeam;//for emails
    private  Registerition obj2;
    
    

    public Player() {
        obj1 = new Playground();
        MyTeam = new ArrayList<Player>();
        obj2 = new Registerition();
        
    }
    
    public void CreateTeam(Player Obj)
    {
       
        
            MyTeam.add(Obj);
        
    }
}
