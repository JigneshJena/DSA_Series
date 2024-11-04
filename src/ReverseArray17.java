import java.util.Scanner;

public class ReverseArray17 {
    static void printarray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int reverse(int a,int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
        return a;
    }
    static int[] reverseArray(int[] arr){
        int a=0,b=arr.length-1;
        for (int i=0;i<arr.length;i++){
            if (a<=b){
                int temp;
                temp=arr[a];
                arr[a]=arr[b];
               arr[b]=temp;
               a++;
               b--;
            }
        }
        return arr;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array Size .");
        int n;
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the Array .");
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        printarray(arr);
        reverseArray(arr);
        System.out.println();
        printarray(arr);
    }
}
