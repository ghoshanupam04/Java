
//Create a Array
class Array {
    public static void main(String[] args) {
        // Defien Array
        int marks[] = new int[3];
        marks[0] = 45; // in java index start with number 0, thats called java is zero index like c++.
        marks[1] = 50;
        marks[2] = 60;
         System.out.println(marks[2]);

        // Print all number using loop:
        for (int i = 0; i <= 3; i++) {
            System.out.println(marks[i]);
        }
    }
}

// Define Array with another way:
class Array {
    public static void main(String[] args) {
        int SubjectMarks[] = { 15, 15, 45 };
        for (int i = 0; i <= 3; i++) {
            System.out.print(SubjectMarks[i] + ",");
        }
    }
}

// Create a User Define Array:
import java.util.*;

class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the Number of an Array: ");
        int size = sc.nextInt();
        int UserArray[] = new int[size];

        for (int i = 0; i < size; i++) {
            UserArray[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            System.out.print(UserArray[i] + ",");
        }
    }
}

// Task: Take an array from the user and then search the numnber if the number
// is searched done then print that:
class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size Of An Array: ");
        int size = sc.nextInt();
        int userarray[] = new int[size];
        for (int i = 0; i < size; i++) {
            userarray[i] = sc.nextInt();
        }
        System.out.print("Which Number you want to find: ");
        int FindNumber = sc.nextInt();
        for (int i = 0; i < userarray.length; i++) {
            if (userarray[i] == FindNumber) { // thats called linier search algo
                System.out.println("Find Number on The Positon of: " + i);
            }
        }
    }
}