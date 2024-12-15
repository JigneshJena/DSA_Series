import java.util.Scanner;

public class QuickSort_L_42 {
    static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    static void swap(int[] arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }

    static int partition(int[] arr,int st,int end){
        int pivot=arr[st];
        int count=0;
        for (int  i=st+1;i<=end;i++){
            if (arr[i]<=pivot)count++;
        }
        int pivotIdx=st+count;
        swap(arr,st,pivotIdx);
        int i=st,j=end;
        while (i<pivotIdx && j>pivotIdx){
            while (arr[i]<=pivot)i++;
            while (arr[j]>pivot)j--;
            if (i<pivotIdx && j>pivotIdx){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }


    static void QuickSort(int[] arr,int st,int end){
        if(st>= end)return;
        int pi=partition(arr,st,end);
        QuickSort(arr,st,pi-1);
        QuickSort(arr,pi+1,end);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array.");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        QuickSort(arr,0,arr.length-1);

        PrintArray(arr);
    }
}