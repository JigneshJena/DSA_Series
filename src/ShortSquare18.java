import java.util.Scanner;

public class ShortSquare18 {
    static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void reverse(int[] arr){
        int start=0,end=arr.length-1;
        while (start<end){
            int temp;
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static int[] ShortSquare(int[] arr){
        int left=0;int right=arr.length-1;
        int k=0;
        int[] ans=new int[arr.length];
        while (left<=right){
            if (Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k++]=arr[left]*arr[left];
                left++;
            }
            else {
                ans[k++]=arr[right]*arr[right];
                right--;
            }
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
        System.out.println();

        printarray(ShortSquare(arr));
        int[] ans=ShortSquare(arr);
        System.out.println();
        reverse(ans);
        printarray(ans);
    }
}
