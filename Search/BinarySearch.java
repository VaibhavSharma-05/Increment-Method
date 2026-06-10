import java.util.*;

public class BinarySearch {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element : ");
        int element = sc.nextInt();

        int arr[] = {44, 66, 43, 55, 76, 77, 33};

        try {

            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {

                        //Swap
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }

            int li = 0;
            int hi = arr.length - 1;

            while (li <= hi) {

                int mid = (li + hi) / 2;

                if (arr[mid] == element) {
                    System.out.print("Element found at : " + mid + " position");
                    break;
                }
                if (element > arr[mid]) {
                    li = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }
        catch (Exception e){
            System.out.print("Unexpected error :" + e.getLocalizedMessage());
        }
        finally{
            sc.close();
        }
    }
}