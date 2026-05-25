import java.util.*;

public class BinarySearch {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element : ");
        int element = sc.nextInt();

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int li = 0;
        int hi = arr.length - 1;

        while (li <= hi) {

            int mid = (li + hi) / 2;

            if (arr[mid] == element) {
                System.out.print("Element found at " + mid + " index position ");
            }
            if (element > arr[mid]) {
                li = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
    }
}