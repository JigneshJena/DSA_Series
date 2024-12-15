import java.util.Scanner;

public class InsertionSort39 {

    static void InsertionShort(int[] arr){
        int n=arr.length;
        for (int i=1;i<n;i++){
            int j=i;
            while (j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }

    static void PrintArray(int [] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Array.");
        int n=sc.nextInt();
        int [] arr=new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        InsertionShort(arr);
        PrintArray(arr);



    }
}
