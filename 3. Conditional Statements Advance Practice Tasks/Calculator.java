
//Calculator:
import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The First Number: ");
        int FirstNum = sc.nextInt();
        System.out.print("Enter The Second Number: ");
        int SecondNum = sc.nextInt();
        System.out.print("Enter The Operator: ");
        char operator = sc.next().charAt(0);
        switch (operator) {

            case '+':
                System.out.println((FirstNum + SecondNum));
                break;
            case '-':
                System.out.println((FirstNum - SecondNum));
                break;
            case '*':
                System.out.println((FirstNum * SecondNum));
                break;
            case '/':
                System.out.println((FirstNum / SecondNum));
                break;
            default: {
                System.out.println("Please Enter Properly");
            }
                break;
        }
    }
}
