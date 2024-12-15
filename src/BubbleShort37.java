import java.util.Scanner;

public class BubbleShort37 {

    static void printArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }



//   BRUTE Force


    static void BubbleShortDESC(int[] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=i;j<arr.length;j++){
                if (arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }


    static void BubbleShort(int[] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=i;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }



    static void betterBubbleShort(int[] a){
        for (int i=0;i<a.length-1;i++){
            for (int j=0;j<a.length-i-1;j++){
                if (a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size.");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        betterBubbleShort(arr);
        printArray(arr);
//        BubbleShort(arr);
//        System.out.println("In Increasing order");
//        printArray(arr);
//        System.out.println("In Decreasing order");
//        BubbleShortDESC(arr);
//        printArray(arr);

    }
}
