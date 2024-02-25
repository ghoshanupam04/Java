import java.util.*;

// i>Create a Simple Function:
class Functions {
    public static void PrintMyName(String name) { // here we can declare the function
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        PrintMyName("I am Anupam Ghosh"); // call the function
    }
}

// ii> Create a function where user can input his/her name:

class Functions {
    public static void OuterInputName(String inp_name) { // declare the function
        System.out.println(inp_name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // user input
        System.out.print("What is Your Name: ");
        String userName = sc.nextLine();
        OuterInputName("You are " + userName); // call the function
    }
}

// iii> Make a function to add two numbers and return sum

class Functions {
    public static void AddTwoSum(int num1, int num2) {
        System.out.println((num1 + num2));
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int FirstNumber = sc.nextInt();
        System.out.print("Enter the Second Number: ");
        int SecondNumber = sc.nextInt();
        System.out.print("Sum of the two Number is: ");
        AddTwoSum(FirstNumber, SecondNumber);
    }
}
