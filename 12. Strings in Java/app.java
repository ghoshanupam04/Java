//Define a String In Java:
/*class Strings {
    public static void main(String[] args) {
        String MyName = "Anupam Ghosh";
        System.out.println(MyName);
    }
}*/

import java.util.*;

//Create a user Define String.
class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Your Name: ");
        String name = sc.nextLine();
        System.out.println("You are " + name + ".");
        System.out.println("Total Length of My name are:" + name.length()); // Check the length of My name.

        // Concat two Strings:
        System.out.print("Please Enter Your First Name: ");
        String firstname = sc.next();
        System.out.print("Please Enter The Last Name:");
        String lastname = sc.next();
        System.out.println("The Full Name is: " + firstname + " " + lastname); // Concat Strings

        // Create Upercase:
        System.out.println(name.toUpperCase() + "Uppercase"); // this is print on uppercase
        // Create lower case:
        System.out.println(name.toLowerCase() + "LoweCase");

        System.out.print("Please Enter Your Name: ");
        String MyName = sc.nextLine();
        for (int i = 0; i < MyName.length(); i++) {
            System.out.println(MyName.charAt(i));
        }

        // Compare String:
        String me = "Hello";
        String You = "Mello";
        if (me.compareTo(You) == 0) {
            System.out.println("Me Win");
        } else {
            System.out.println("You Ween");
        }

        // Substring:
        String me = "Anupam Ghosh";
        System.out.println(me.substring(0, 6));
    }
}