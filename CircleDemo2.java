import java.util.Scanner;
import java.io.*;
class CircleArea2
{
    double r;
    double area()
    {
        return(22/7.0*r*r);
    }
}
class CircleDemo2
{
    public static void main(String[] args)
    {
        CircleArea2 Ca1=new CircleArea2();
        CircleArea2 Ca2=new CircleArea2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius1");
        Ca1.r= sc.nextDouble();
        System.out.println("Enter the radius2");
        Ca2.r= sc.nextDouble();
        System.out.println("the area of 1st circle is"+Ca1.area());
        System.out.println("the area of 2nd circle is"+Ca2.area());
    }
}
