package Array;

public class RemoveElementArray {
    public static int [] reomove(int []arr,int index){
        if (arr == null
                || index < 0
                || index >= arr.length) {

            return arr;
        }
        int[] anotherArray = new int[arr.length - 1];
        for(int i=0,j=0;i<arr.length;i++){
            if (i!=index){
                anotherArray[j++] = arr[i];
            }
        }
        return anotherArray;
    }
}
