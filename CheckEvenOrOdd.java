import java.util.Scanner;
import java.io.*;
class Evenodd
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        if ((a & 1) == 0)     or  if((a/2)*a==0)
        System.out.println(a + " is even");
        else
        System.out.println(a + " is odd");
    }
}
