
// To Check the number is Even or Odd.
import java.util.*;

class EvenOdd {
    public static void main(String[] args) {
        System.out.print("Enter The Number: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input % 2 == 0) {
            System.out.println("The Number is Even Number.");
        } else {
            System.out.println("The Number is Odd Number");
        }
    }
}