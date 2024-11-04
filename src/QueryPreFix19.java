import java.util.Scanner;
public class QueryPreFix19 {
    static void printarray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static int[] Inplace(int[]arr){

        for (int i=1;i<arr.length;i++){
            arr[i] +=arr[i-1];
        }
        return arr;
    }


    static int sum(int[] arr,int start,int end){
        int total=0;
        for (int i=start;i<=end;i++){
            total=arr[i]+total;
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array Size .");
        int n;
        n = sc.nextInt();
        int[] arr = new int[n+1];
        System.out.println("Enter the Array .");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        printarray(arr);

        int[] prefix=Inplace(arr);

        System.out.println("Enter number of queries .");
        int q;
        q= sc.nextInt();
        while (q-->0){
            System.out.println("Enter range");
            int s,e;
            s=sc.nextInt();
            e=sc.nextInt();
            int ans=prefix[e]-prefix[s-1];
            System.out.println("Sum"+ans);
        }
    }
}
