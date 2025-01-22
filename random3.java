import java.util.Scanner;

public class random3 
{
    public static void main(String args[])
    {
        int a;
        Scanner n = new Scanner(System.in);

        System.out.println("Enter the number of nth terms needed: ");
        a = n.nextInt();

        for(int i = 1; i<=a; i++)
        {
            System.out.println(i);
        }
        n.close();


    }
    

}
