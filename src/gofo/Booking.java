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
public class Booking {
    private PlaygroundOwner obj;
    private Registerition Reg;
    
    public Booking()
    {
      
    }
    public void CalculateMoney(int numOfSlots , int PricePerHour , String OwnerName)
    {
        int Money = 0;
        Money = numOfSlots * PricePerHour;
        System.out.println("You will pay : "+Money);
        for(int i=0 ; i<Reg.Owners.size() ; i++)
        {
            if(Reg.Owners.get(i).equals(OwnerName))
            {
                Reg.Owners.get(i).setBalance(Money);
            }
        }
    }
   
}
