import java.util.Scanner;

public class SortProblemQ1_L_40 {

    static void sort(int[] arr){
        int n=arr.length;
        for (int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if (arr[j]==0 && arr[j+1]!=0){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
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
        sort(arr);
        PrintArray(arr);
    }
}

