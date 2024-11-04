import java.util.Scanner;

public class SubArraySum19 {
    static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int TotalSumArray(int[] arr){
        int totalSum=0;
        for (int i=0;i<arr.length;i++){
            totalSum+=arr[i];
        }
        return totalSum;
    }

    static boolean subArraySum(int[] arr){
        int totalSum=TotalSumArray(arr);
        int prefix=0;
        for (int i=0;i<arr.length;i++){
            prefix+=arr[i];
            int suffixsum=totalSum-prefix;
            if (prefix==suffixsum){
                return  true;
            }
    }
        return false;
    }

//    static int[] sufixmaker(int[] arr){
//        int[] suff=new int[arr.length];
//        int index=0;
//        for (int i=arr.length-2;i>=0;i--){
//
//            suff[index]=arr[i+1]+arr[i];
//            index++;
//        }
//        return suff;
//    }

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
        System.out.println("\nThe SubArray was "+subArraySum(arr));
//        int[] chachinfix=prefixmaker(arr);
//        int[] sufixchacher=sufixmaker(arr);
//
//       for (int i=0;i<arr.length-2;i++){
//           if (chachinfix[i]==sufixchacher[i+1]){
//               System.out.println("TRUE");
//           }
//           else {
//               System.out.println("FALSE");
//           }
//       }
    }
}
