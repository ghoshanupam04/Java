
// 1. Check the Array is Sorted Or Not:
import java.util.*;

class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter The Length Of An Array: ");
        int size = sc.nextInt();
        int InputArray[] = new int[size];
        System.out.println("Please Enter Numbers: ");
        for (int i = 0; i < InputArray.length; i++) {
            InputArray[i] = sc.nextInt();
        }
        boolean isAscending = true;
        for (int i = 0; i < InputArray.length - 1; i++) {
            if (InputArray[i] > InputArray[i + 1]) {
                isAscending = false;
            }
        }
        if (isAscending) {
            System.out.println("This is An Sorted Array.");
        } else {
            System.out.println("This is Not an Sorted Array");
        }
    }
}

// 2. Take an array of names as input from the user and print them on the
// screen.
class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter The Length of An Array: ");
        int size = sc.nextInt();
        int EnterArrayNumber[] = new int[size];
        System.out.println("Please Enter The Numbers Which You Wants To Print: ");
        for (int i = 0; i < size; i++) {
            EnterArrayNumber[i] = sc.nextInt();
        }

        for (int i = 0; i <= EnterArrayNumber.length; i++) {
            System.out.print(i + ",");
        }
    }
}

// 3. In The Array Which Number is Maximum number and which Number is Minimum
// Number:
class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter The Size of Length Of An Array:  ");
        int size = sc.nextInt();
        int Input_The_Array_Number[] = new int[size];
        for (int i = 0; i < size; i++) {
            Input_The_Array_Number[i] = sc.nextInt();
        }
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        for (int i = 0; i < Input_The_Array_Number.length; i++) {
            if (Input_The_Array_Number[i] < min) {
                min = Input_The_Array_Number[i];
            }
            if (Input_The_Array_Number[i] > max) {
                max = Input_The_Array_Number[i];
            }
        }
        System.out.println("Smaller Number: " + min);
        System.out.println("Smaller Number: " + max);
    }
}
