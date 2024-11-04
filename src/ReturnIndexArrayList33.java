import java.util.ArrayList;
import java.util.Scanner;

public class ReturnIndexArrayList33 {
    static ArrayList<Integer> FindingIndex(int[] arr, int target, int idx){
        ArrayList<Integer> i=new ArrayList<>();
        if (arr.length==idx) return i;
        if (arr[idx]==target) {
           i.add(idx);
        }
ArrayList<Integer> RemainingIndex=FindingIndex(arr,target,idx+1);
//        i.addAll(RemainingIndex);

        return  i;
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
        ArrayList<Integer> ans=FindingIndex(arr,target,0);
        for (Integer i: ans){
            System.out.print(i+" ");
        }
    }
}
