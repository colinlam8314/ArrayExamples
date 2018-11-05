import java.util.Scanner;
public class recursiondriver
{
    public static void main(String[] args)
    {
        int c = counted(9);
        System.out.println(c);
    }
    public static int counted(int count)
    {
        if (count%2==0)
        {
            return count;
        }
        if (count>=9)
        {
            return count;
        }
        return counted(count)+counted(count+2);
    }
}