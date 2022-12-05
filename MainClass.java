
package CS102Final;

import java.util.*;


public class MainClass 
{
    private static final Scanner USERINPUT =  new Scanner(System.in);


    public static void main(String[] args)
    {
        
        char choice = 'E';
        Menu[] userOrder = null;        
        boolean passCheck = false;
        
        
        do
        {
            choice = setMenu();
            
            switch(choice)
            {
                case 'O':
                {
                    userOrder = setUserOrder();
                    for(int i = 0; i < userOrder.length; i++)
                    {
                        userOrder[i] = new Menu();
                        userOrder[i].setItemName();
                        userOrder[i].setCheese();
                        userOrder[i].setOnion();
                        userOrder[i].setTomato();
                        userOrder[i].setSauce();
                        userOrder[i].setBacon();
                        userOrder[i].setDrinkType();
                        userOrder[i].setPrice();
                    }
                   
                    displayReceipt(userOrder);
                    break;
                }
                case 'A':
                {
                    if(userOrder != null)
                    {        
                        passCheck = checkAdmin(passCheck);
                        if(passCheck == true)
                        {
                            displayAdmin(userOrder);
                        }
                    }
                    else
                    {
                        System.out.println("\nNo customer orders to audit at this time.");
                    }
                    break;
                }
                case 'E':
                {
                    System.out.println("\nThank you for visiting Daniel's Burgers!");
                    break;
                }
                default:
                {
                    System.out.println("\nOnly O, A, or Q are valid entries");
                }
            }
        
            
        }while(choice != 'E');

    }
//============================================================================
    private static char setMenu()
    {
        System.out.print("\n========== Daniel's Burgers ==========\n"
                + "\tPress 'O' to (O)rder items\n"
                + "\tPress 'A' for (A)dmin mode\n"
                + "\tPress 'E' to (E)xit\n"
                + "> ");
        char answer = USERINPUT.next().toUpperCase().charAt(0);
        return answer;
    }
   //==================================================================== 
    private static Menu[] setUserOrder()
    {
        Menu[] custOrder = new Menu[0];
        int numOfOrders;
                
        do
        {
            System.out.print("\nEnter the number of items to order: ");
            while(!USERINPUT.hasNextInt())
            {
                System.out.println("\nOnly number inputs are allowed.\n");
                System.out.print("Re-Enter the number of items to order.\n");
                USERINPUT.next();
            }
            numOfOrders = USERINPUT.nextInt();
            
            if(numOfOrders == 0)
            {
                System.out.println("\nCannot have an order of 0 items.");
            }
        }while(numOfOrders < 1);
        custOrder = new Menu[numOfOrders];
        return custOrder;
    }
    //================================================================================
    private static boolean checkAdmin(boolean passCheck)
    {
        
        String adminPass = "admin123";
        String passAttempt = "";
        
        
        do
        {
            System.out.print("\nEnter the Admin password: \n"
                    + "> ");
            passAttempt = USERINPUT.next();
            while(!passAttempt.equals(adminPass))
            {   
                System.out.println("\nIncorrect Password. Try again.\n");
                System.out.print("Re-Enter the Admin password: \n"
                        + "> ");
                passAttempt = USERINPUT.next();
                
            }
        }while(!passAttempt.equals(adminPass));
        if(passAttempt.equals(adminPass))
        {
            passCheck = true;
        }
        return passCheck;
        
    }
    //===================================================================================
    private static void displayAdmin(Menu[] setOrder)
    {
        System.out.print("\n======= Daniel's Burgers Sales Report =======\n");
        for(int i = 0; i < setOrder.length; i++)  
        {
            System.out.printf("\tName: %s\n"
            + "\tDrink: %c\n"
            + "\tCheese: %c\n"
            + "\tOnion: %c\n"
            + "\tTomato: %c\n"
            + "\tSauce: %c\n"
            + "\tBacon: %c\n"
            + "\tTotal Amount: $%.2f\n\n",setOrder[i].getItemName(),setOrder[i].getDrinkType(),
            setOrder[i].getCheese(),setOrder[i].getOnion(),setOrder[i].getTomato(),
            setOrder[i].getSauce(),setOrder[i].getBacon(),setOrder[i].getPrice());
            
            
        }
    }
    //================================================================================
    private static void displayReceipt(Menu[] setOrder)
    {
        System.out.print("\n======= Daniel's Burgers Customer Bill =======\n");
        for(int i = 0; i < setOrder.length; i++)
        {
            System.out.printf("\tName: %s\n"
            + "\tTotal Amount: $%.2f\n\n",setOrder[i].getItemName(),setOrder[i].getPrice());
            
            
        }
        
       
    }
    
}
