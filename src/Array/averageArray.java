package Array;

public class averageArray {
    public static int AverageArray(int b[]){
        int sum=0;
        for (int i=0 ;i<b.length;i++){
            sum+=b[i];
        }
        int average =sum/b.length;
        return average;
    }
}
