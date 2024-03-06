import java.util.*;

//Create a 2D Array:
class Two_D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the Length Of Rows: ");
        int row = sc.nextInt();
        System.out.print("Please Enter The Length Of Columns: ");
        int column = sc.nextInt();
        int[][] Declare_The_Two_D_Array = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                Declare_The_Two_D_Array[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(Declare_The_Two_D_Array[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}

// 2. Check The Position of the Number In 2D Array:
class Two_D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Row: ");
        int row = sc.nextInt();
        System.out.print("Columns: ");
        int columns = sc.nextInt();
        int[][] FindTheNumberInArray = new int[row][columns];
        System.out.println("Please Enter The Numbers: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                FindTheNumberInArray[i][j] = sc.nextInt();
            }
        }
        System.out.print("Please Enter The Number Which You Want TO Find: ");
        int FindTheNumber = sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                if (FindTheNumberInArray[i][j] == FindTheNumber) {
                    System.out.println("The Position we can Find The Number is: " + "(" + i + "," + j + ")");
                }
            }
        }
    }
}