import java.util.Scanner;

public class PreFixSum19 {

    static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    //Time and spce complexity better way
    static int[] InPlacePreFix(int[] arr){
        for (int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }

    //Better but not satifiying spce
    static int[] BetterWayPrefix(int[] arr){
        int[] prefix=new int[arr.length];
        prefix[0]=arr[0];
        for (int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        return prefix;
    }


    //This is my bruet Force Code

    static int[] Prefix(int[] arr){

        int[] ans=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            int store=0;
            for (int j=0;j<=i;j++){

                store=arr[j]+store;
            }
            ans[i]=store;
        }

        return ans;
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
        int[] ans=Prefix(arr);
        System.out.println();
        printarray(ans);
        System.out.println("\nThe better version of prefix.");
        printarray(BetterWayPrefix(arr));

        System.out.println("\nWithout using any new array");
        printarray(InPlacePreFix(arr));
    }
}