import java.util.Scanner;

public class PracticeRotation {


    static void PrintArray(int [] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
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
    static void rotationinPlace(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }

    public static  void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length.");
        int x;
        x=sc.nextInt();
        int[] arr=new int[x];
        System.out.println("Enter Array.");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        PrintArray(arr);
        System.out.println("\nEnter Number of time to rotate.");
        int ch;
        ch=sc.nextInt();
        rotationinPlace(arr,ch);
        PrintArray(arr);


    }

}
