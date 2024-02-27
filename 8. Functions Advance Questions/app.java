import java.util.*;

// 1. Check the Factorial Number:
class Factorial {
    public static void CheckFactorial(int n) {
        int FactorialNumber = 1;
        for (int i = n; i > 1; i--) {
            FactorialNumber = FactorialNumber * i;
        }
        System.out.println(FactorialNumber);
        return;
    }

    public static void main(String[] args) {
        System.out.print("Enter Your Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("The Factorial of " + n + " is: ");
        CheckFactorial(n);
    }
}

// 2. Enter three number and Print the average: (Three Numbers)
class Average {
    public static void AverageOfNumber(int num1, int num2, int num3) {
        int result = (num1 + num2 + num3) / 3;
        System.out.println(result);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int F_No = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int S_No = sc.nextInt();
        System.out.print("Enter Third Number: ");
        int T_No = sc.nextInt();
        System.out.print("Average of " + F_No + "," + S_No + "," + T_No + " is: ");
        AverageOfNumber(F_No, S_No, T_No);
    }
}

// 3. Write a function which can print all n odd number:
class Odd_Numbers {
    public static void PrintOdd(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + ",");
            }
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Length Of the Odd Number: ");
        int n = sc.nextInt();
        System.out.println("The Odd Numbers are: ");
        PrintOdd(n);
    }
}

// 4. Check the Age and get the Permission:
class Age {
    public static void AgeCheck(int n) {
        if (n > 18) {
            System.out.println("You Can apply for the License ");
        } else if (n == 18) {
            System.out.println("If your all required docs are ok then you can apply");
        } else {
            System.out.println("Not Applied ");
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your age: ");
        int age = sc.nextInt();
        AgeCheck(age);
    }
}
