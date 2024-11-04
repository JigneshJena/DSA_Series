import java.util.Scanner;

public class SwapVariable17 {
    static void swap(int a,int b){
        int temp;
        temp=a;
        a=b;
        b=temp;

        System.out.println(a+" "+b);
    }
    static void swapWithoutVariable(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1St Element." );
        int a,b;
        a=sc.nextInt();
        System.out.println("Enter 2nd Element.");
        b=sc.nextInt();
        System.out.println("The original value is."+a+" "+b);
       // swap(a,b);
        swapWithoutVariable(a,b);
    }
}
