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
public class Playground {
    private String Name;
    private String Location;
    private int Size;
    private int PricePerHour;
    private String OwnerName;
    public ArrayList<String> Slots;
    public ArrayList<String> Available;
    
    
    public Playground() {
        this.Name = "Empty";
        this.Location = "Empty";
        this.PricePerHour = 0;
        this.Size = 0;
        
        Slots = new ArrayList<String>();
        Available = new ArrayList<String>();
    }

    
    public Playground(String Name, String Location, int Size, int PricePerHour, ArrayList<String> Slots) {
        this.Name = Name;
        this.Location = Location;
        this.Size = Size;
        this.PricePerHour = PricePerHour;
        this.Slots = Slots;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String OwnerName) {
        this.OwnerName = OwnerName;
    }

    
    
    
    public void setSlo(String Slo) {
        Slots.add(Slo);
        Available.add("True");
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int Size) {
        this.Size = Size;
    }

    public int getPricePerHour() {
        return PricePerHour;
    }

    public void setPricePerHour(int PricePerHour) {
        this.PricePerHour = PricePerHour;
    }

    public void setSlots(String slot) {
        Slots.add(slot);
        String Avai = "True";
        Available.add(Avai);
    }    

    public ArrayList<String> getSlots() {
        return Slots;
    }

    public ArrayList<String> getAvailable() {
        return Available;
    }
   
}
