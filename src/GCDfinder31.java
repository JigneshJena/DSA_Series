import java.util.Scanner;

public class GCDfinder31 {

    static int lcm(int x,int y){
        int lcm=x*y/gcd(x,y);
        return lcm;
    }

    static int gcd(int x,int y){
        if (y==0) return x;
        return gcd(y,x%y);
    }

    static int IterativeGCD(int x,int y){
        while (x % y !=0){
            int rem=x%y;
            x=y;
            y=rem;
        }
        return y;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two Number.");
        int x=sc.nextInt();
        int y=sc.nextInt();

        System.out.println("The GCD of "+x+" and "+y+" is "+IterativeGCD(x,y));
        System.out.println("The GCD better time and spaceComplexity is "+gcd(x,y));
        System.out.println("The lcm of the given number is "+lcm(x,y));
    }
}
