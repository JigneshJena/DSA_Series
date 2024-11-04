import java.util.Scanner;

public class RotationArray17 {
    static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }



    static void swap(int[] arr,int i,int j) {

        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int[] arr,int start,int end){
        while (start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }



    //This is better algo in-place
    static void rotationinPlace(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }







    //This is Bruet Forece





    static int[] rotate(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        System.out.println("The k value is>"+k);
        int[] ans=new int[n];
        int j=0;
        for (int i=n-k;i<n;i++){
            ans[j++]=arr[i];
        }
        for (int i=0;i<n-k;i++){
            ans[j++]=arr[i];
        }
        return ans;
    }
        public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter array Size .");
            int n;
            n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the Array .");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int k;
            System.out.println("Enter the kth rotation ");
            k=sc.nextInt();
            System.out.println("The rotate array is >");
            printarray(rotate(arr,k));

        }
    }

