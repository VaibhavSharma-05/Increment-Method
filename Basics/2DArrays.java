import java.util.*;

public class Vaibhav {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of rows : ");
        int rows = sc.nextInt();

        System.out.print("Enter no. of cols : ");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                System.out.println("Input numbers :");
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter value where you want to x occurs at = ");
        int x = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (numbers[i][j] == x) {
                    System.out.println("x found at this indices : (" + i + "," + j + ")");
                }
            }
        }
    }
}