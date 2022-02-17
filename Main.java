
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        int a, b;
        char op;
        a = input.nextInt();
        op = input1.nextLine().charAt(0);
        b = input.nextInt();
        switch (op) {
            case '+':
                System.out.println(a + b);
                System.exit(0);
            case '-':
                System.out.println(a - b);
                System.exit(0);
            case '*':
                System.out.println(a * b);
                System.exit(0);
            case '/': {
                if (b == 0) {
                    System.out.println("Cannot Divide By Zero");
                    System.exit(0);
                }
                System.out.println((float) a / b);
                System.exit(0);
            }
            default:
                System.out.println("Invalid Input");
                System.exit(0);
        }
    }

}