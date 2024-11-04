import java.util.Scanner;

public class QuerysFrequency17 {
    static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

  static int[] makeFrequencyArray(int[] arr){
        int [] feq=new int[100005];
        for (int i=0;i<arr.length;i++){
            feq[arr[i]]++;
        }
        return feq;
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

        int[] freq=makeFrequencyArray(arr);

        System.out.println("Enter number of querys.");
        int q;
        q=sc.nextInt();

        while (q>0){
            System.out.println("enter the element to find.");
            int x= sc.nextInt();
            if (freq[x]>0){
                System.out.println("Yes");
            }
            else {
                System.out.println("NO");
            }

            q--;
        }

    }
}
