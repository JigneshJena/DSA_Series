import java.util.Scanner;

public class Recurson27 {

    static void recursion(int n){
        if (n==1) {
            System.out.print(n + " ");
            return;
        }
         recursion(n-1);
        System.out.print(n+" ");
    }

    static int  factorial(int n){
        if (n==0){
            return 1;
        }
        int a=n;
        return a=a*factorial(n-1);

    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number.");
        int n=sc.nextInt();

        System.out.println("Factorial of given number is."+factorial(n));
    }
}
