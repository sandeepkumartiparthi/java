//java program to demonstrate a method
import java.util.Scanner;
import java.lang.Math;
import java.io.*;
class CircleArea
{
    double x,y,r;
    double add()
    {
        return(22/7.0*r*r);
    }
}
class CircleDemo
{
    public static void main(String[] args)
    {
        CircleArea Ca=new CircleArea();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x and y");
        Ca.x= sc.nextDouble();
        Ca.y= sc.nextDouble();
        Ca.r= Math.sqrt((Ca.x*Ca.x)+(Ca.y*Ca.y));
        System.out.println("the area of circle is"+Ca.add());
    }
}
