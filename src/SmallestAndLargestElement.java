import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class SmallestAndLargestElement {



    //Finding the largest and smallest element.
    static void Smallest_and_Largest(int[] arr){
        int max=-1;
        int min=arr[0];
        for (int i=0;i<arr.length;i++){
            if (min>arr[i]){
                min=arr[i];
            }
            if (max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Min is ."+min);
        System.out.println("max is. "+max);

    }

    //Sorting the array a
    static void sortedarray(int[] arr){
        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    //check the array sorted or not?
    static void checkSorted(int[] arr){
    for (int i=1;i<arr.length;i++){
        if(arr[i]<arr[i-1]){
            System.out.println("unsorted");
            break;
        }
    }
    }



    static void KthSmallestAndKthLargest (int[] arr,Scanner sc){
        Arrays.sort(arr);
//         for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
         int n;
        System.out.println("Enter the kth smallest element .");
        n=sc.nextInt();
        System.out.println("the kth smallest element is  ."+arr[n-1]);
        System.out.println("Enter the kth largest element .");
        n=sc.nextInt();
        System.out.println("the kth Largest element is ."+arr[arr.length-n]);
    }


    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        int[] arr=new int[5];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        checkSorted(arr);
        Smallest_and_Largest(arr);
        sortedarray(arr);
        KthSmallestAndKthLargest(arr,sc);
    }
}
