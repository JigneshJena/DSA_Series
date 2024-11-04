import java.util.Scanner;

public class SumOfDititAndCountDigit29 {

    static int countTheDigit(int x){
        if (x==0)return x;
        int count=0;
        count++;
        return count+countTheDigit(x/10);
    }
    static int totalSumOfDigit(int x){
        if (x==0)return x;
        return x%10+totalSumOfDigit(x/10);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number.");
        int n= sc.nextInt();
        int m=n;
        System.out.println("The total number of digit is = "+totalSumOfDigit(n));
        System.out.println("the total digit in given number is = "+countTheDigit(m));

    }
}
