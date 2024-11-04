import java.util.Scanner;

public class ShortingEvenOddArray18 {
    static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void swap(int[] arr,int even,int odd){
        int temp;
        temp=arr[even];
        arr[even]=arr[odd];
        arr[odd]=temp;
    }
    static int[] ShortingEvenAndOddArray(int[] arr){
        int even=0,odd=arr.length-1;
        while (even<odd){
            if (arr[even]%2!=0 && arr[odd]%2==0){
                swap(arr,even,odd);
                even++;
                odd--;
            }
            if (arr[even]%2==0){
                even++;
            }
            if (arr[odd]%2!=0){
                odd--;
            }
        }
        return arr;
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
        System.out.println();
        printarray(ShortingEvenAndOddArray(arr));
    }
}
