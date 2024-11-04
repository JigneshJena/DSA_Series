import java.util.Scanner;

public class UniqueValue16 {
    static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
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
            int doubl=-1;
            for (int i=0;i<arr.length;i++){
                for (int j=i+1;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        arr[i]=-1;
                        arr[j]=-1;
                    }
                }

            }
            int ans=-1;
            for (int i=0;i<arr.length;i++){
                if(arr[i]>0){
                    ans=arr[i];
                }
            }

            System.out.println("The Unique Element is >"+ans);
    }
}

