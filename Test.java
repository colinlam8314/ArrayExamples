import java.util.Scanner;
public class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n = sc.nextInt();
        int answer = factorial(n);
        System.out.println("Answer is "+answer);
    }
    
    public static int factorial(int n)
    {
        System.out.println(n);
        if (n<=1)
            return n;
        else if (n>1)
            return n*factorial(n-1);
            
        return n;
    }
}