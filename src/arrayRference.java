import java.util.Scanner;
public class arrayRference {
    static void printArray(int[]  arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String [] args){

        System.out.println("Enter array element .");
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter Array Element.");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("The Original Array is.");
        printArray(arr);

        int[] arr2=new int[n];
        System.out.println("The Copy array.");
        arr2=arr;
        printArray(arr2);

        System.out.println("Changin the new array .");
        arr2[2]=32;
        arr2[1]=0;
        printArray(arr2);
        System.out.println("The Original array.");//It change the original array if we change the copied array because of the array is pass by refference mean it pass his address and here both arr and arr2 have same array address.

        printArray(arr);
    }
}
