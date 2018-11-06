import java.util.Scanner;
public class recursiondriver
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = counted(n);
        System.out.println(c);
    }
    public static int counted(int count)
    {
        if (count <=0)
        {
            return 0;
        }
        if (count%2==1)
        {
            return count + counted(count-2);
        }
        if (count%2==0)
        {
            count-=1;
            return count + counted(count-2);
        }
        return 0;
    }
}