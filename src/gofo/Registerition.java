/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gofo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Abd Elrahman
 */
public class Registerition {
    public ArrayList<PlaygroundOwner> Owners ;
    public ArrayList<Player> players ;
    public ArrayList<Playground> grounds ;
    public Booking Book;
    //private ArrayList<Playground>Wait;
    public ArrayList<Adminstrator> admin;

    public Registerition() {
        Owners = new ArrayList<PlaygroundOwner>();
        players = new ArrayList<Player>();
        grounds = new ArrayList<Playground>();
        Book = new Booking();
        //Wait = new ArrayList<Playground>();
        admin = new ArrayList<Adminstrator>();
    }
    public void DisplaySlotsOfSpecificPlayground(String Name)
    {
        if(grounds.size()==0)
        {
             System.out.println("There is no playgrounds in the system");  
        }
        else
        {
            for(int i=0 ; i<grounds.size() ; i++)
        {
            if(grounds.get(i).getName().equalsIgnoreCase(Name))
            {
                for(int j = 0 ; j<grounds.get(i).Slots.size() ; j++)
                {
                    System.out.println("Slot "+(j+1)+" "+grounds.get(i).Slots.get(j));
                }
            }
         }
        }
    }
     public void FilterPlaygrounds(String location)
    {
       if(grounds.size()==0)
         {
             System.out.println("There is o playgrounds in the system");
         }
         else
         {
             for(int i=0 ; i<grounds.size() ; i++)
             {
                 if(grounds.get(i).getLocation().equals(location))
                 {
                    System.out.println("Playground number "+(i+1)+" :");
                System.out.println("Name: "+grounds.get(i).getName());
                System.out.println("OwnerName "+grounds.get(i).getOwnerName());
                System.out.println("Location: "+grounds.get(i).getLocation());
                System.out.println("Size: "+grounds.get(i).getSize());
                System.out.println("PricePerHour: "+grounds.get(i).getPricePerHour());
                for(int j=0 ; j<grounds.get(i).Slots.size() ; j++)
                {
                    System.out.println("Slot "+(j+1)+" "+grounds.get(i).Slots.get(j)+" "+grounds.get(i).Available.get(j));
                    
                }
                System.out.println("*********************************************");
                 }
             }
         }
    }
    public void BookPlayground(String Name , String arr)
    {
        Playground obj = new Playground();
        int Price = 0;
        String name = " ";
        for(int i=0 ; i<grounds.size() ; i++)
        {
            if(grounds.get(i).getName().equals(Name))
            {
                Price = grounds.get(i).getPricePerHour();
                name = grounds.get(i).getOwnerName();
                for(int j=0 ; j<grounds.get(i).Slots.size() ; j++)
                {
                   if(grounds.get(i).Slots.get(j).equals(arr))
                   {
                       if(grounds.get(i).Available.get(j).equals("True"))
                       {
                           grounds.get(i).Available.set(j , "False");
                    
                           System.out.println("Booked");
                       }
                       else
                       {
                           System.out.println("The slot number is Booked choose another slot");
                       }
               
                   }
                }
              
            }
        }
        
    }
    public void SetAdmin(Adminstrator obj)
    {
        admin.add(obj);
    }
    
    public void setPlayer(Player obj)
    {
        players.add(obj);
    }
    public void setOwner(PlaygroundOwner obj)
    {
        Owners.add(obj);
    }
    public void SetPlayground(Playground obj)
    {
        grounds.add(obj);
    }
    
    
    public ArrayList<PlaygroundOwner> getOwners() {
        return Owners;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public ArrayList<Playground> getGrounds() {
        return grounds;
    }

    
    
    public boolean CheckOwner(String email , String Password)
    {
           for(int i=0 ; i<Owners.size() ; i++){
	        if(Owners.get(i).getEmail().equalsIgnoreCase(email) && Owners.get(i).getPassword().equals(Password))
                {
                    return true;
                }
	   }
        return false;
    }
    public boolean CheckAdmin(String email , String Password)
    {
           for(int i=0 ; i<admin.size() ; i++){
	        if(admin.get(i).getEmail().equalsIgnoreCase(email) && admin.get(i).getPassword().equals(Password))
                {
                    return true;
                }
	   }
        return false;
    }
    public boolean Checkplayer(String email , String Password)
    {
        if(players.size()==0)
        {
            return false;
        }
        else
        {
            for(int i=0 ; i<players.size() ; i++){
	        if(players.get(i).getEmail().equalsIgnoreCase(email) && players.get(i).getPassword().equals(Password))
                {
                    return true;
                } 
	   }
        }
           return false;
    }
    public int GetSize()
    {
        return Owners.size();
    }
   public int verificationCode()
    {
        int mini = 1000;
        int maxi = 9999;
        int randomInt = (int)(Math.random() * (maxi-mini+1)+mini);
        return randomInt;
    }
   public int SetID()
   {
        int mini = 1000;
        int maxi = 9999;
        int randomInt = (int)(Math.random() * (maxi-mini+1)+mini);
        return randomInt;
   }
     public void DisplayOwners(){
        if(Owners.size()==0)
        {
            System.out.println("There is no owners in the system");
        }
        else if(Owners.size()!=0)
        {
            for(int i=0 ; i<Owners.size() ; i++)
            {
                System.out.println("Owner number "+(i+1)+" :");
                System.out.println("Name: "+Owners.get(i).getName());
                System.out.println("ID: "+Owners.get(i).getID());
                System.out.println("Password: "+Owners.get(i).getPassword());
                System.out.println("Email: "+Owners.get(i).getEmail());
                System.out.println("Phone: "+Owners.get(i).getPhone());
                System.out.println("*********************************************");
            }
        }
    }
     public void DisplayPlayers(){
        if(players.size()==0)
        {
            System.out.println("There is no players in the system");
        }
        else if(players.size()!=0)
        {
            for(int i=0 ; i<players.size() ; i++)
            {
                System.out.println("Player number "+(i+1)+" :");
                System.out.println("Name: "+players.get(i).getName());
                System.out.println("ID: "+players.get(i).getID());
                System.out.println("Password: "+players.get(i).getPassword());
                System.out.println("Email: "+players.get(i).getEmail());
                System.out.println("*********************************************");
            }
        }
    }
     /*public void DisplayPlaygroundWithSpecificLocation(String Location)
     {
         
     }*/
     public void DisplayPlaygrounds(){
        if(grounds.size()==0)
        {
            System.out.println("There is no playgrounds in the system");
        }
        else if(grounds.size()!=0)
        {
            for(int i=0 ; i<grounds.size() ; i++)
            {
                System.out.println("Playground number "+(i+1)+" :");
                System.out.println("Name: "+grounds.get(i).getName());
                System.out.println("OwnerName "+grounds.get(i).getOwnerName());
                System.out.println("Location: "+grounds.get(i).getLocation());
                System.out.println("Size: "+grounds.get(i).getSize());
                System.out.println("PricePerHour: "+grounds.get(i).getPricePerHour());
                for(int j=0 ; j<grounds.get(i).Slots.size() ; j++)
                {
                    System.out.println("Slot "+(j+1)+" "+grounds.get(i).Slots.get(j)+" "+grounds.get(i).Available.get(j));
                    
                }
                System.out.println("*********************************************");
            }
        }
    }
   static boolean isValid(String email) {
      String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
      return email.matches(regex);
   }
   
   public void CheckplayerForCreateTeam(String Name)
    {
         if(players.size()==0 || players.size()==1)
        {
            System.out.println("There is no players in the system to invite");
        }
         else
         {
             for(int i=0 ; i<players.size() ; i++){
	        if(players.get(i).getName().equalsIgnoreCase(Name))
                {
                    players.get(i).CreateTeam(players.get(i));
                    System.out.println("Created Successful");
                    return;
                } 
	   }      
         }
    }
   
}
