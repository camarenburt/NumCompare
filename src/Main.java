import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Please choose a number.");
        num1 = scan.nextInt();

        System.out.println("Please choose a number.");
        num2 = scan.nextInt();

        if (num1 == num2) {
            System.out.println(num1 + " is equal to " + num2 + ".");
        }
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2 + ".");
        }
        if (num1 < num2) {
            System.out.println(num1 + " is less than " + num2 + ".");
        }
    }
}