import java.util.Scanner;

public class Fibbonaci28 {
    static int  fibonachi(int n){
        if (n==1||n==0){
            return n;
        }
        int prev=fibonachi(n-1);
        int prevprev=fibonachi(n-2);
        return prev+prevprev;
    }

    public static void main(String [] args){
        for(int i=0;i<=10;i++){
            System.out.print(fibonachi(i)+" ");
        }
    }
}
