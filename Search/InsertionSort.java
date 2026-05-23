public class InsertionSort {

    public static void main(String args[]){

        int arr[] = {23, 75 ,32 ,65, 24, 89}

        //for passes
        for(int i=0; i < arr.length; i++){
            min = i;

                //for searching 
            for(int j=i+1; j<arr.length; j++){ 
                if(arr[min] > arr[j]){   // To check smallest element index number 
                    min = j;
                }
            }

                int temp = arr[min];     // Swap
                arr[min] = arr[i];
                arr[i] = temp;

            }
        }
    }
