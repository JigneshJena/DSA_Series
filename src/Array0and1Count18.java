import java.util.Scanner;

public class Array0and1Count18 {
    static void printarray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void swap(int[] arr,int start,int end){
        int temp;
        temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    static int[] betterApporach(int[] arr){
        int start=0;int end=arr.length-1;
        while (start<end){

            if (arr[start]==1&&arr[end]==0){
                swap(arr,start,end);
                start++;
                end--;
            }
            if (arr[start]==0){
                start++;
            }
             if (arr[end]==1){
                end--;
            }
        }
        return arr;
    }


    static int[] Short0and1Array(int[] arr){
        int count=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==0){
                count++;
            }
        }
        for (int i=0;i<arr.length;i++){
            if (i<count){
                arr[i]=0;
                count--;
            }
            else {
                arr[i]=1;
            }
        }
//        for (int i=count+1;i<arr.length;i++){
//            arr[i]=1;
//        }
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

        System.out.println();
        //printarray(Short0and1Array(arr));

        printarray(betterApporach(arr));
    }
}
