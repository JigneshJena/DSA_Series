import java.util.Scanner;

public class SumOfArrayRecursion32 {

    // This is for total Array Sum
    static int SumArray(int[] arr,int idx ){
        if (arr.length==idx) return 0;
        return SumArray(arr,idx+1)+arr[idx];
    }
   // This if for given index to total index Sum
    static int IndexSumArray(int[] arr,int idx ){
        if (arr.length-1==idx) return arr[idx];
        return SumArray(arr,idx+1)+arr[idx];
    }

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter array size.");
            int sz=sc.nextInt();
            int[] arr=new int[sz];
            for (int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            int ind=0;
        System.out.println("The sum of the array is ."+SumArray(arr,ind));
        System.out.println("Give Index starting ( 0 to  "+sz+")");
        int start=sc.nextInt();

        System.out.println("The sum of the array is ."+IndexSumArray(arr,start));
    }
}
