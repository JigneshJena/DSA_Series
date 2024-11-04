import java.util.Scanner;

public class FollowUpFindLastIndex33 {



        static int LastIndex(int[] arr, int target, int idx){
        if (arr.length == idx) return -1; // Base case: end of the array

        // Recursively find the index in the rest of the array
        int index = LastIndex(arr, target, idx + 1);

        // If not found in the rest of the array and the current element matches the target, update the index
        if (index == -1 && arr[idx] == target) {
            return idx;
        }

        // Otherwise, return the index found from the recursive call
        return index;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size.");
        int size= sc.nextInt();
        System.out.println("Enter array element.");
        int[] arr=new int[size];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter target Value.");
        int target=sc.nextInt();
        System.out.println("The Target Sum of Index is "+LastIndex(arr,target,0));
    }
}
