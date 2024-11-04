import java.util.Scanner;

public class ReapetedElement16 {
    static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int reapeatlast(int[] arr) {
        int lastreapeat=-1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {

                    lastreapeat=arr[i];
                }
            }
        }
        return lastreapeat;
    }
    static int reapeat(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {

                    return arr[i];
                }
            }
        }
        return -1;
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
        System.out.println("The first reapeat values is "+reapeat(arr));
        System.out.println("The last  reapeat values is "+reapeatlast(arr));
    }
}
