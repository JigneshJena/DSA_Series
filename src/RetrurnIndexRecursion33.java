import java.util.ArrayList;
import java.util.Scanner;

public class RetrurnIndexRecursion33 {

    static void FindingIndex(int[] arr,int target,int idx){
        if (arr.length==idx) return;
        if (arr[idx]==target) {
            System.out.println("The Target " + target + " Found " + idx + " Index ");
        }
        FindingIndex(arr,target,idx+1);
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
        System.out.println("Enter Target Value. ");
        int target=sc.nextInt();
        FindingIndex(arr,target,0);
    }
}
