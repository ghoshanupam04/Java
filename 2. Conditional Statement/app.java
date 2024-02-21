
//if-else Condition
class Condition {
    public static void main(String[] args) {
        int age = 19; //in this case you are also eligible because your age is greater then the condition. if 17 then not
        if (age >= 18) {
            System.out.println("You are Eligible for this party");
        } else {
            System.out.println("You are not eligible for this party");
        }
    }
}

// Else-if condition:
class Condition {
    public static void main(String[] args) {
        int age = 17;
        if (age > 18) {
            System.out.println("You Can Apply For the License");
        } else if (age >= 18) {
            System.out.println("If you have all the required Documents then you can also Applying.");
        } else {
            System.out.println("You Can't Apply for the License ");
        }
    }
}

// Switch-case:
import java.util.*;

class Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Your any of the number(1/2/3): ");
        int input = sc.nextInt();
        switch (input) {
            case 1: {
                System.out.println("Hello");
                break;
            }
            case 2: {
                System.out.println("Hii");
                break;
            }
            case 3: {
                System.out.println("Hey There");
                break;
            }
            default: {
                System.out.println("Namaste");
            }
        }
    }
}