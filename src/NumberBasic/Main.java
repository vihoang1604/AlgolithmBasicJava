package NumberBasic;

import java.util.Scanner;

import static NumberBasic.ConvertNumber.convertBinary;
import static NumberBasic.GCD.USCLN;
import static NumberBasic.average3Number.average3Number1;
import static NumberBasic.checkInputNumberPrime.CheckNumberPrime;

public class Main {
    public static void average(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number a = ");
        int a = in.nextInt();
        System.out.print("Enter Number b = ");
        int b = in.nextInt();
        System.out.print("Enter Number c = ");
        int c = in.nextInt();
        average3Number1(a,b,c);
    }
    public static void GCD(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number a = ");
        int a = in.nextInt();
        System.out.print("Enter Number b = ");
        int b = in.nextInt();
        System.out.println("Greatest Common Divisor:"+USCLN(a,b));

    }
    public static void convertBinaryNumber(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number n = ");
        int n = in.nextInt();
        System.out.println("Number " + n + " binary system = ");
        convertBinary(n);
    }
    public  static void checkNumberPrime(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number n = ");
        int n = in.nextInt();
        if(n>0) {
            if (CheckNumberPrime(n) == 1) {
                System.out.println("This is Prime");
            } else {
                System.out.println("This is not Prime");
            }
        }
    }
    public static void main(String[] args){
        average();
        GCD();
        convertBinaryNumber();
        checkNumberPrime();
    }
}
