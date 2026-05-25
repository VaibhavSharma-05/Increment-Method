import java.util.*;

public class Vaibhav {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Age = ");
        int Age = sc.nextInt();

        if (Age >= 18) {
            System.out.print("eligible for vote");
        } else {
            System.out.print("Not eligible");
        }
    }
}