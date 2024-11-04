import java.util.Scanner;

public class FollowUpQuestion33 {

    static boolean isShorted(int[] arr,int idx) {
            if (arr.length==idx) return true;
            if (arr[idx]<arr[idx-1]) return false;
        return isShorted(arr,idx+1);
    }
        public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter array size.");
            int size = sc.nextInt();
            System.out.println("Enter array element.");
            int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            if (isShorted(arr,1)) System.out.println("The Array is sorted");
            else System.out.println("The Array is not Shorted.");
        }

}