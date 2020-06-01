package Array;

public class SortArray {
    public static void bubbleSort(int arr[])
    {
        int i, j,temp;
        for (i = 0; i < arr.length-1; i++) {
            for (j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
