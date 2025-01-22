import java.util.*;

public class random2
{
    public static void main(String args[])
    {
        int r, t , add1;
        Scanner n = new Scanner(System.in);

        //Take User input
        System.out.print("Please enter the first number: ");
        r = n.nextInt();

        System.out.print("Please enter the second number: ");
        t = n.nextInt();

        add1 = r + t;

        System.out.println("The sum of your numbers is: " + add1);

        n.close();
    }





}