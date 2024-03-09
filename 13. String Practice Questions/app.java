import java.util.*;

// 1. Change Some Character in The String:
class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Your Name: ");
        String name = sc.nextLine();
        System.out.println("You are " + name.replace("A", "C"));
    }
}

/*
 * 2.Input an email from the user. You have to create a username from the email
 * by deleting the part that
 * comes after ‘@’. Display that username to the user.
 */
class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Your Gmail: ");
        String gmail = sc.nextLine();
        String result = " ";
        for (int i = 0; i < gmail.length(); i++) {
            if (gmail.charAt(i) == '@') {
                break;
            } else {
                result += gmail.charAt(i);
            }
        }
        System.out.println(result);
    }
}
