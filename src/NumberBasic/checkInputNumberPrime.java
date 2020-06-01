package NumberBasic;

public class checkInputNumberPrime {
    public static int CheckNumberPrime(int n){
        int dem=0;
        for (int i=1;i<=n;i++){
            if(n % i ==0){
                dem++;
            }
        }
        if (dem==2){
            return 1;
        }
        else
            return 0;
    }
}
