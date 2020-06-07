/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gofo;

import java.util.ArrayList;

/**
 *
 * @author Abd Elrahman
 */
public class PlaygroundOwner extends User{
     private String Phone;
     private int Balance;
     //private ArrayList<Playground> Store;        

    public PlaygroundOwner()
    {
        this.Phone = "Empty";
        Balance = 0;
       //Store = new ArrayList<Playground>();
       
    }

     
    public PlaygroundOwner(String Phone , String Name, int ID, String Password, String Email , String Role) {
        super(Name, ID, Password, Email , Role);
        this.Phone = Phone;
     
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

   
    public String getPhone() {
        return Phone;
    }

   

    /*public void setStore(Playground obj) {
        Store.add(obj);
    }*/

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int Balance) {
        this.Balance = this.Balance +  Balance;
    }
      
   
}
