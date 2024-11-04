import java.util.Scanner;

public class arrayPrintRecursion32 {
    static void PrintArrayRecursion(int[] arr,int idx) {
        if (arr.length==idx)return;
        System.out.print(arr[idx]+" ");
        PrintArrayRecursion(arr,idx+1);
        System.out.println();
        System.out.print(arr[idx]+" ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size.");
        int size= sc.nextInt();
        System.out.println("Enter array element.");
        int[] arr=new int[size];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int idx=0;
        PrintArrayRecursion(arr,idx);
    }
}
