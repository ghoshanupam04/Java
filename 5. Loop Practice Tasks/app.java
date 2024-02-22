
// i> Using user input print the numbers.
import java.util.*;

class Practice {
    public static void main(String[] args) {
        System.out.print("Please enter the number to print: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for (int i = 1; i <= input; i++) {
            System.out.print(i + ", ");
        }
    }
}

// ii> Print the sum of n natural number:
class Practice {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}

// iii> Print the table of a number by the user input:
class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int n = sc.nextInt();
        System.out.print("Enter the Length Of the Number: ");
        int lengthOfNumber = sc.nextInt();
        for (int i = 1; i <= lengthOfNumber; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
}

// Print all even Number till n:
class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int LengthOfTheNumber = sc.nextInt();
        for (int i = 1; i <= LengthOfTheNumber; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}