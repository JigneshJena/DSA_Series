

import java.util.Scanner;
//Check the Q query if the given number is present in query ? Query can be more than be Inputed Array
public class PracticeFrequency {
    static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int[] findQuery(int[] arr){
        int[] freqency=new int[10003];
        for (int i=0;i<arr.length;i++){
            freqency[arr[i]]++;
        }
        return freqency;
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length.");
        int x;
        x = sc.nextInt();
        int[] arr = new int[x];
        System.out.println("Enter Array.");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        PrintArray(arr);

        int[] freq=findQuery(arr);
        int no;
        System.out.println("Enter the number of query.");
        no=sc.nextInt();
        while (no>0){
            System.out.println("Enter element to search.");
            int search;
            search= sc.nextInt();
            if(freq[search]>0){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
            no--;
        }

    }
}
