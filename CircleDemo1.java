//java program to demonstrate method(example2)
import java.util.Scanner;
import java.io.*;
class CircleArea1
{
    double r;
    double area()
    {
        return(22/7.0*r*r);
    }
}
class CircleDemo1
{
    public static void main(String[] args)
    {
        CircleArea1 Ca1=new CircleArea1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the r");
        Ca1.r= sc.nextDouble();
        System.out.println("the area of circle is"+Ca1.area());
    }
}
