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
import java.util.Scanner;
public class GOFO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        ArrayList<PlaygroundOwner> storing = new ArrayList<PlaygroundOwner>();
        Booking Book = new Booking();
        ArrayList<Playground> Wait = new ArrayList<Playground>();
        PlaygroundOwner Owner = new PlaygroundOwner();
        Player player1 = new Player();
        Playground Play = new Playground();
        Registerition Reg  = new Registerition();
        Adminstrator admin = new Adminstrator();
       /*Variables to enter when log in pr Sign up*/
        String Name = "";
        String Role = "";
        String Password = "";
        int ID;
        String Email = "";
        int Code;
        String Phone = "";
        /////////////////////////////////
        String PlaygroundName = " ";
        String Location = " ";
        int Size = 0;
        int PricePerHour = 0;
        String Slots = " ";
        //////////////////////////////////
        int chooseForSmallMenu = 0;
        do
        {
            System.out.println("1)Log in as playgroundOwner");
            System.out.println("2)Log in as player");
            System.out.println("3)Log in as Admin");
            System.out.println("4)Sign up as PlaygroundOwner");
            System.out.println("5)Sign up as Player");
            System.out.println("6)Sign up as Admin");
            System.out.println("7)Close the system");
             System.out.println("Choose one of the previous: ");
             chooseForSmallMenu = input.nextInt();
             if(chooseForSmallMenu==1)
             {
                 System.out.println("Enter Your Email: ");
                  String email = input.next();
                  System.out.println("Enter Your Password: ");
                  Password = input.next();
                   boolean passed = true;
                   passed = passed & Reg.CheckOwner(email , Password);
                   if(passed==true)
                   {
                       int choice3 = 0;
                       do
                       {
                           System.out.println("1)Add your playground");
                       System.out.println("2)Log out");
                       
                       choice3 = input.nextInt();
                       if(choice3==1)
                       {
                           String Answer = " ";
                           int NumOfSlots = 0;
                           Play.setOwnerName(Name);
                               System.out.println("Enter the name of the playground: ");
                               input.nextLine();
                               PlaygroundName = input.nextLine();
                               Play.setName(PlaygroundName);
                               System.out.println("Enter the name of the Location: ");
                               Location = input.nextLine();
                               Play.setLocation(Location);
                               System.out.println("Enter the name of the Size: ");
                               Size = input.nextInt();
                               Play.setSize(Size);
                               System.out.println("Enter the name of the PricePerHour: ");
                               PricePerHour = input.nextInt();
                               Play.setPricePerHour(PricePerHour);
                               System.out.println("How Many Timeslots in the playground?");
                               NumOfSlots = input.nextInt();
                               for(int i=0 ; i<NumOfSlots ; i++)
                               {
                                   input.nextLine();
                                   System.out.println("Enter Slot number: "+(i+1));
                                   Slots = input.nextLine();
                                   Play.setSlo(Slots);
                                   
                               }
                               Wait.add(Play);
                               Play = new Playground();
                       }
                       
                       }while(choice3!=2);
                   }
                   else
                   {
                       System.out.println("You are not in the system ,please create an account");
                   }
                   
             }
             else if(chooseForSmallMenu==2)
             {
                 System.out.println("Enter Your Email: ");
                 String email2 = input.next();
                     System.out.println("Enter Your Password: ");
                  Password = input.next();
                   boolean passed = true;
                   passed = passed & Reg.Checkplayer(email2 , Password);
                   if(passed==true)
                   {
                        while (true) {
                    int choice = 0;
                    System.out.println("1) View available playgrounds");
                    System.out.println("2) Book playground");
                    System.out.println("3) Invite and create team");
                    System.out.println("4) View available playgrounds in a specific location");
                    System.out.println("5)Send Emails");
                    System.out.println("6) Log out");
                    choice = input.nextInt();
                    if (choice == 1) {
                        Reg.DisplayPlaygrounds();
                    }
                    else if (choice == 2) 
                    {
                        String ans = " ";
                        String S = " ";
                        String Na ;
                        String Reply = "Yes";
                        System.out.println("Enter the playground you want: ");
                        input.nextLine();
                        S = input.nextLine();
                        Reg.DisplaySlotsOfSpecificPlayground(S);
                        do
                        {
                            ans = " ";
                            input.nextLine();
                            System.out.println("Choose slots");
                            Na = input.nextLine();
                            Reg.BookPlayground(S , Na);
                            Na = " ";
                            System.out.println("Do you want to Enter another slot?");
                            ans = input.next();
                        }while(ans.equalsIgnoreCase("Yes"));
                        
                    } 
                    else if (choice == 3) {
                        String reply = "yes";
                        do {
                            String email = "";
                            System.out.println("Enter the player name");
                            input.nextLine();
                            String Playername = input.nextLine();
                            Reg.CheckplayerForCreateTeam(Playername);
                            System.out.println("Do you want to enter another player");
                            reply = input.next();
                        }while (reply.equalsIgnoreCase("Yes"));
                    } else if (choice == 4) {
                        String Loc = "";
                        System.out.println("Enter the loocation: ");
                            input.nextLine();
                        Loc = input.nextLine();
                        Reg.FilterPlaygrounds(Loc);
                    } 
                    else if(choice == 5){
                        System.out.println("Emails are sent successuful");
                    }
                    else if (choice == 6) {
                       break;
                    }
                }
                   }
                   else
                   {
                       System.out.println("You are not in the system ,please create an account");
                   }
                   
             }
             else if(chooseForSmallMenu==3)
             {
                 System.out.println("Enter Your Email: ");
                  String email2 = input.next();
                     System.out.println("Enter Your Password: ");
                  Password = input.next();
                   boolean passed = true;
                   passed = passed & Reg.CheckAdmin(email2 , Password);
                   if(passed==true)
                   {
                       int c2 = 0;
                       do
                       {
                           System.out.println("1)Approve Playground");
                           System.out.println("2)DisplayAllPlaygrounds");
                       System.out.println("3)Log out");
                       System.out.println("Choose one of the previous: ");
                       c2 = input.nextInt();
                       if(c2==1)
                       {
                           String Agree = " ";
                           if(Wait.size()==0)
                           {
                               System.out.println("There is no waiting playgrounds");
                           }
                           else
                           {
                               System.out.println("Here is all playground in the system");
                           for(int i=0 ; i<Wait.size() ; i++)
                           {
                               System.out.println("Playground num "+(i+1)+" "+Wait.get(i).getName());
                               System.out.println("Approve or not?(Yes or No)");
                               Agree = input.next();
                               if(Agree.equalsIgnoreCase("yes"))
                               {
                                   Reg.SetPlayground(Wait.get(i));
                                   Wait.remove(i);
                               }
                           }
                           }
                       }
                       else if(c2==2)
                       {
                           Reg.DisplayPlaygrounds();
                       }
                       else if(c2==3)
                       {
                           System.out.println("Bye Bye");
                       }
                       }while(c2!=3);
                   }
                   else
                   {
                       System.out.println("You are not in the system ,please create an account");
                   }
             }
             else if(chooseForSmallMenu==4)
             {
                 System.out.println("Enter your Name: ");
                 input.nextLine();
                 Name = input.nextLine();
                 Owner.setName(Name);
                 Role = "PlaygroundOwner";
                 Owner.setRole(Role);
                 System.out.println("Enter Password: ");
                 Password = input.next();
                 Owner.setPassword(Password);
                 boolean p = Reg.isValid(Email);
                 do
                 {
                     System.out.println("Enter Email: ");
                      Email = input.next();
                 }while(Reg.isValid(Email)==false);
                 Owner.setEmail(Email);
                 ID = Reg.SetID();
                 System.out.println("Your ID: "+ID);
                 Owner.setID(ID);
                 System.out.println("Enter your phone: ");
                 Phone = input.next();
                 Owner.setPhone(Phone);
                 int cod = 0;
                 int verCode = Reg.verificationCode();
                 do
                 {
                     System.out.println("Enter the following verification code: "+verCode);
                     cod = input.nextInt();
                 }while(cod!=verCode);
                 Reg.setOwner(Owner);
                 Owner = new PlaygroundOwner();
                 System.out.println("Register Completed");
             }
             else if (chooseForSmallMenu == 5) 
             {
                 System.out.println("Enter your Name: ");
                 input.nextLine();
                 Name = input.nextLine();
                 player1.setName(Name);
                 Role = "Player";
                 player1.setRole(Role);
                 System.out.println("Enter Password: ");
                 Password = input.next();
                 player1.setPassword(Password);
                 boolean p = Reg.isValid(Email);
                 do
                 {
                     input.nextLine();
                     System.out.println("Enter Email: ");
                      Email = input.next();
                      
                 }while(Reg.isValid(Email)==false);
                 player1.setEmail(Email);
                 ID = Reg.SetID();
                 System.out.println("Your ID: "+ID);
                 player1.setID(ID);
                 int cod = 0;
                 int verCode = Reg.verificationCode();
                do
                {
                     System.out.println("Enter the following verification code: "+verCode);
                 cod = input.nextInt();
                }while(cod!=verCode);
                 Reg.setPlayer(player1);
                 player1 = new Player();
                 System.out.println("Register Completed");
                
             }
             else if(chooseForSmallMenu==6)
             {
                 System.out.println("Enter your Name: ");
                 input.nextLine();
                 Name = input.nextLine();
                 admin.setName(Name);
                 Role = "Admin";
                 admin.setRole(Role);
                 System.out.println("Enter Password: ");
                 Password = input.next();
                 admin.setPassword(Password);
                 boolean p = Reg.isValid(Email);
                 do
                 {
                     input.nextLine();
                     System.out.println("Enter Email: ");
                      Email = input.nextLine();
                      
                 }while(Reg.isValid(Email)==false);
                 admin.setEmail(Email);
                 ID = Reg.SetID();
                 System.out.println("Your ID: "+ID);
                 admin.setID(ID);
                    int cod = 0;
                 int verCode = Reg.verificationCode();
                do
                {
                     System.out.println("Enter the following verification code: "+verCode);
                 cod = input.nextInt();
                }while(cod!=verCode);
                 Reg.SetAdmin(admin);
                 admin = new Adminstrator();
                 System.out.println("Register Completed");
             }
             else if(chooseForSmallMenu==7)
             {
                 System.out.println("Thanks for using our Application");
                 break;
             }
        }while(true);
        
    }
    
}
