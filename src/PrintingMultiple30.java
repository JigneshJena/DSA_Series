import java.util.Scanner;

public class PrintingMultiple30 {

    static void printMultiple(int n,int r){
        if (r==0) return;
        printMultiple(n,r-1);
        System.out.print(n*r+" ");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number and Range.");
        int n=sc.nextInt();
        int r=sc.nextInt();
        printMultiple(n,r);
    }
}
