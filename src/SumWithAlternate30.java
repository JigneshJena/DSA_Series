import java.util.Scanner;

public class SumWithAlternate30 {

    static int AlternateSign(int n){
        if (n==0) return 0;
        if (n%2==0) return  AlternateSign(n-1)-n;
        return AlternateSign(n-1)+n;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number.");
        int n=sc.nextInt();
        System.out.println("The total of given number with Alternate Sign. "+AlternateSign(n));
    }
}
