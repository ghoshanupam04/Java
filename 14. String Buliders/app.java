import java.util.*;

//Declare String Builder:
class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Anupam Ghosh");
        System.out.println(sb);
        System.out.println(sb.charAt(0)); // Only print the 'A'

        // Change Character in Particular Index:
        sb.setCharAt(0, 'W');
        System.out.println(sb);

        // Insert Character in StringBuilder
        sb.insert(0, 'x');
        System.out.println(sb); // Insert Element at the FIrst index.

        // Delete Index
        sb.delete(0, 7);
        System.out.println(sb);

        // Append:
        sb.append(" Anupam");
        System.out.println(sb);
    }
}
