import java.util.*;

//code to detect if the number that was given by the user is odd or even

public class random {
    
    public static void main(String args[])
    {
        int n;
        
        System.out.println("Hello");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();

        if (n%2 == 0) 
        {
            System.out.println("This is an even number!");  
        }
        else
        {
            System.out.println("This is an odd number!");
        }
        r.close();
    }

}
