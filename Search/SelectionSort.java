
public class SelectionSort {

    public static void main (String args []){

        int arr [] = {54,23,65,22,44,66};

        for(int i=0; i<arr.length-1; i++){
            int smallest = i;

            for(int j=i+1; j<arr.length; j++){
                if(arr[smallest] > arr[j]){
                    smallest =j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        for(int no : arr){
            System.out.print(no+" ");
        }
    }
}