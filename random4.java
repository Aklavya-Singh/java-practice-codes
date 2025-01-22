import java.util.Scanner;

public class random4 
{
    public static void main(String args[])
    {
        int a, sum = 0;
        Scanner n = new Scanner(System.in);

        System.out.println("Enter the number of nth terms needed: ");
        a = n.nextInt();

        for(int i = 1; i<=a; i++)
        {
            sum = sum +i;
        }
        System.out.println("Sum is: " + sum);
        n.close();
    }
}
