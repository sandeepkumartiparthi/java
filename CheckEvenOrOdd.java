import java.util.Scanner;

public class CheckEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number :");
        n = sc.nextInt();
        if (isEven(n) == 0)
            System.out.print("The given number is Even\n");
        else
            System.out.print("The given number is Odd\n");
    }

    private static int isEven(int n) {
        return n & 1;
    }

}
