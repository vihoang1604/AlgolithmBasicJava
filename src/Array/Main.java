package Array;

import static Array.RemoveElementArray.reomove;
import static Array.SortArray.bubbleSort;
import static Array.averageArray.AverageArray;

public class Main {

    static int[] arr = {1, 6, 3, 9, 5,6};

    public static void showArray(int [] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void areageArray(){
        int average=AverageArray(arr);
        System.out.println("average array:"+average );

    }
    public static void sortArray(){
        bubbleSort(arr);
        showArray(arr);
    }
    public static void reverseCotent(){
        int[] b = new int[arr.length];
        int j = arr.length;
        for (int i = 0; i < arr.length; i++) {
            b[j - 1] = arr[i];
            j = j - 1;
        }
        showArray(b);
    }
    public static void secondHighestValueArray(){
        int max=arr[0];
        for(int i=1;i<=arr.length;i++)
        {
            if(arr[i]>max) max=arr[i];

        }
        int max2=arr[0];
        for(int i=1;i<=arr.length;i++)
        {
            if(arr[i]>max2 && arr[i]<max) max2=arr[i];
        }
        System.out.println(max2);
    }

    public static void RemoveElement(){
        int[] b = reomove(arr,2);
        showArray(b);
    }
    public static void main(String[] args){
        //areageArray();
        //sortArray();
       // reverseCotent();
       RemoveElement();
      //  secondHighestValueArray();
    }
}
