
package CS102Final;
import java.util.*;
public class Menu 
{
    private final Scanner USERINPUT = new Scanner(System.in);
    private String itemName;
    private char cheese;
    private char onion;
    private char tomato;
    private char sauce;
    private char bacon;
    private char drinkType;
    private double price;
    //===================================================================
    public Menu()
    {
        
    }

    //====================================================================
    public String getItemName() 
    {
        return itemName;
    }
    public void setItemName() 
    {
        System.out.print("\nEnter your name for this burger order: ");
        this.itemName = USERINPUT.next();
    }    
//=========================================================================
    public char getCheese() 
    {
        return cheese;
    }
    public void setCheese()
    {
        char temp;
        do
        {
            System.out.print("\nAdd cheese? \n"
                    + "(Y)es\n"
                    + "(N)o\n"
                    + "> ");
            
            temp = USERINPUT.next().toUpperCase().charAt(0);
            
            if(temp != 'Y' && temp != 'N')
            {
                System.out.println("\nOnly (Y) for 'Yes', or (N) for 'No' are allowed.");
            }
        }while(temp != 'Y' && temp != 'N');
        
        this.cheese = temp;
    }
    //====================================================================
    public char getOnion() 
    {
        return onion;
    }
    public void setOnion() 
    {
        char temp;
        do
        {
            System.out.print("\nAdd onion? \n"
                    + "(Y)es\n"
                    + "(N)o\n"
                    + "> ");
            
            temp = USERINPUT.next().toUpperCase().charAt(0);
            
            if(temp != 'Y' && temp != 'N')
            {
                System.out.println("\nOnly (Y) for 'Yes', or (N) for 'No' are allowed.");
            }
        }while(temp != 'Y' && temp != 'N');
        this.onion = temp;
    }
    //============================================================================
    public char getTomato() 
    {
        return tomato;
    }
    public void setTomato() 
    {
        char temp;
        do
        {
            System.out.print("\nAdd tomato? \n"
                    + "(Y)es\n"
                    + "(N)o\n"
                    + "> ");
            
            temp = USERINPUT.next().toUpperCase().charAt(0);
            
            if(temp != 'Y' && temp != 'N')
            {
                System.out.println("\nOnly (Y) for 'Yes', or (N) for 'No' are allowed.");
            }
        }while(temp != 'Y' && temp != 'N');
        this.tomato = temp;
    }
//===================================================================================
    public char getSauce()
    {
        return sauce;
    }
    public void setSauce() 
    {
        char temp;
        do
        {
            System.out.print("\nAdd sauce? \n"
                    + "(Y)es\n"
                    + "(N)o\n"
                    + "> ");
            
            temp = USERINPUT.next().toUpperCase().charAt(0);
            
            if(temp != 'Y' && temp != 'N')
            {
                System.out.println("\nOnly (Y) for 'Yes', or (N) for 'No' are allowed.");
            }
        }while(temp != 'Y' && temp != 'N');
        this.sauce = temp;
    }
//=====================================================================================
    public char getBacon() 
    {
        return bacon;
    }
    public void setBacon() 
    {
        char temp;
        do
        {
            System.out.print("\nAdd bacon? \n"
                    + "(Y)es\n"
                    + "(N)o\n"
                    + "> ");
            
            temp = USERINPUT.next().toUpperCase().charAt(0);
            
            if(temp != 'Y' && temp != 'N')
            {
                System.out.println("\nOnly (Y) for 'Yes', or (N) for 'No' are allowed.");
            }
        }while(temp != 'Y' && temp != 'N');
        this.bacon = temp;
    }
 //======================================================================================
    public char getDrinkType()
    {
        return drinkType;
    }

    public void setDrinkType() 
    {
        char temp;
        do
        {
            System.out.print("\nSelect your beverage of choice. \n"
                    + "(W)ater\n"
                    + "(T)ea\n"
                    + "(C)offee\n"
                    + "(S)oda\n"
                    + "(J)uice\n"
                    + "> ");
            
            temp = USERINPUT.next().toUpperCase().charAt(0);
            
            if(temp != 'W' && temp != 'T' && temp != 'C' && temp != 'S' && temp != 'J')
            {
                System.out.println("\nOnly W, T, C, S, or J are allowed.");
            }
        }while(temp != 'W' && temp != 'T' && temp != 'C' && temp != 'S' && temp != 'J');
        this.drinkType = temp;
    }
//=======================================================================================
    public double getPrice() 
    {
        return price;
    }
    
    public void setPrice()
    {
        
        final double BASE_PRICE = 14.99;
        double finalPrice;
        double tempPrice = 0;
        int toppings = 0;
        
        if(cheese == 'Y')
        {
            toppings++;
        }

        if(onion == 'Y')
        {
            toppings++;
        }

        if(tomato == 'Y')
        {
            toppings++;
        }

        if(sauce == 'Y')
        {
            toppings++;
        }

        if(bacon == 'Y')
        {
            toppings++;
        }
      
        switch (drinkType)
        {
            case 'W':
                tempPrice = BASE_PRICE;
                break;
            case 'T':
                tempPrice = BASE_PRICE + 3.99 + (toppings * .99);
                break;
            case 'C':
                tempPrice = BASE_PRICE + 4.99 + (toppings * .99);
                break;
            case 'S':
                tempPrice = BASE_PRICE + 1.99 + (toppings * .99);
                break;
            case 'J':
                tempPrice = BASE_PRICE + 2.99 + (toppings * .99);
                break;
            default:
                break;
        }
        
        
        finalPrice = tempPrice;
        this.price = finalPrice;
    }
    
    
    
    
}
