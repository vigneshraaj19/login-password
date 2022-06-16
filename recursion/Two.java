package recursion;
import java.util.*;

public class Two
{
    public static void main (String [] args)
    {
         String password = "vigneshraaj";
         String username = "vigneshraaj";

        for (int i = 0; i < 3; i++) 
        {
            
            Scanner input = new Scanner(System.in);
            System.out.print("\nEnter Your Username: ");
            String value1 = input.nextLine();
            System.out.print("\nEnter Your Password: ");
            String value = input.nextLine();

             if(i==2)
            {
            System.out.println("more than 3 attemps please try again");
            }

             else if (!(value.equals(password)) && !(value1.equals(username)) ) 
            {
                System.out.println("\nWrong username and password Try Again");
            } 
            else if(value.equals(password) && value1.equals(username))
            {
                System.out.println("\n Login Successful!");
//                System.out.println("\n Sign out");
                break;
            }
            
        }
       
    }
}