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
public class User {
    protected String Name;
    protected int ID;
    protected String Password;
    protected String Email;
    protected String Role;
   

    public User() {
        this.Name = "Empty";
        this.ID = 0;
        this.Password = "Empty";
        this.Email = "Empty";
        this.Role = "Empty";
    }

    public User(String Name, int ID, String Password, String Email , String Role) {
        this.Name = Name;
        this.ID = ID;
        this.Password = Password;
        this.Email = Email;
        this.Role = Role;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

   

    public String getName() {
        return Name;
    }

    public int getID() {
        return ID;
    }

    public String getPassword() {
        return Password;
    }

    public String getEmail() {
        return Email;
    } 

    public String getRole() {
        return Role;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }
   
}
