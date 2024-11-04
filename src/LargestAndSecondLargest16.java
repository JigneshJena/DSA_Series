import java.util.Scanner;

public class LargestAndSecondLargest16 {
    static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    static int max(int[] arr){
        int mx=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx;
    }

    static int min(int[] arr){
        int mn=arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]<mn){
                mn=arr[i];
            }
        }
        return mn;
    }

    static int secondMin(int[] arr){
        int mn=min(arr);
        for (int i=0;i<arr.length;i++){
            if(arr[i]==mn){
                arr[i]=Integer.MAX_VALUE;
            }
        }
        int secondmin=min(arr);
        return secondmin;
    }




    static int secondMax(int[] arr){
        int mx=max(arr);
        for (int i=0;i<arr.length;i++){
            if(arr[i]==mx){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secondmax=max(arr);
        return secondmax;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array Size .");
        int n;
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Array .");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        printarray(arr);
//        int min=Integer.MAX_VALUE;
//        int max=Integer.MIN_VALUE;
//        int smin=-1;
//        int smax=-1;
//        for (int i=0;i<arr.length;i++){
//            smin=min;
//            if(min>arr[i]){
//            min=arr[i];
//            }
//            smax=max;
//            if(max<arr[i]){
//                max=arr[i];
//            }
//        }
//        System.out.println("The Max is >"+max);
//        System.out.println("The Second Max is >"+smax);
//        System.out.println("The Min is >"+min);
//        System.out.println("The Second Min is >"+smin);
//        System.out.println("\nThe second largest element is>"+secondMax(arr));
        System.out.println("\nThe second Smallest element is>"+secondMin(arr));
    }
}
