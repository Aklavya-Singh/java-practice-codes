import java.util.Scanner;

public class random5 
{
    public static void main(String args[])
    {
        int a;
        Scanner n = new Scanner(System.in);

        System.out.println("Enter the range: ");
        a = n.nextInt();

        for(int i = 1; i<=a; i=i+2)
        {
            System.out.println(i);
            
        }
        n.close();
    }   
}
