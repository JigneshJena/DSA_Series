import java.util.Scanner;

public class TowNumberPower29 {
    static int powerofNumber(int n,int p){
        if (p==0)return 1;
        return powerofNumber(n,p-1)*n;
    }
    static int timeComplexity(int p,int q){
        if (q==0) return 1;
        int small=timeComplexity(p,q/2);
        if (q % 2==0){
            return small*small;
        }
        return p * small*small;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number and power.");
        int n= sc.nextInt();
        int p= sc.nextInt();
        System.out.println("The powr of two number is = "+timeComplexity(n,p));

    }
}
