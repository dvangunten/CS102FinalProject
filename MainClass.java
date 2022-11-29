
package CS102Final;

import java.util.*;


public class MainClass 
{
    private static final Scanner USERINPUT =  new Scanner(System.in);


    public static void main(String[] args)
    {
        
        char choice = 'E';
        Menu[] userOrder;
        
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
                    
                }
                case 'E':
                {
                    System.out.println("\nThank you for your order");
                    break;
                }
                default:
                {
                    System.out.println("\nOnly O or Q are valid entries");
                }
            }
        
            
        }while(choice != 'E');

    }
//==========================================
    private static char setMenu()
    {
        System.out.print("\n====== Daniel's Burgers ======\n"
                + "\tPress 'O' to (O)rder items\n"
                + "\tPress 'E' to (E)xit and complete your order\n"
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
                System.out.println("\nOnly number inputs are allowed.");
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
    private static void displayReceipt(Menu[] setOrder)
    {
        for(int i = 0; i < setOrder.length; i++)
        {
            System.out.printf("\n======= Daniel's Burgers Customer Bill =======\n"
            + "\tName: %s\n"
            + "\tTotal Amount: $%.2f\n",setOrder[i].getItemName(),setOrder[i].getPrice());
            
            
        }
        
        for(int i = 0; i < setOrder.length; i++)
        {
            System.out.printf("\n======= Daniel's Burgers Sales Report =======\n"
            + "\tName: %s\n"
            + "\tDrink: %c\n"
            + "\tCheese: %c\n"
            + "\tOnion: %c\n"
            + "\tTomato: %c\n"
            + "\tSauce: %c\n"
            + "\tBacon: %c\n"
            + "\tTotal Amount: $%.2f\n",setOrder[i].getItemName(),setOrder[i].getDrinkType(),setOrder[i].getCheese(),setOrder[i].getOnion(),setOrder[i].getTomato(),
            setOrder[i].getSauce(),setOrder[i].getBacon(),setOrder[i].getPrice());
            
            
        }
    }
    
}
