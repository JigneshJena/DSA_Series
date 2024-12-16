//import java.util.Enumeration;
//
//public class SwapingMistake_ProbSolving_44 {
//
//    static void sortArray(int[] arr){
//        int n=arr.length;
//        int x=-1,y=-1;
//        if (n<=1)return;// corner case.edge case
//        for (int i=1;i<n;i++){
//            if (arr[i-1]>arr[i]){
//                if (x==-1){
//                    x=i-1;
//                    y=i;
//                }
//                else {
//                    y=i;
//                }
//            }
//        }
//        if (x!=-1 && y!=-1) {
//            int temp = arr[x];
//            arr[x] = arr[y];
//            arr[y] = temp;
//        }
//    }
//    public static void main(String[] args) {
//        int[] num={11,10,4,5,7,9,2,1};
//        sortArray(num);
//        for (int val:num){
//            System.out.print(val+" ");
//        }
//    }
//}
public class SwapingMistake_ProbSolving_44 {

    static void sortArray(int[] arr) {
        int n = arr.length;
        if (n <= 1) return; // corner case.edge case

        int first = -1, second = -1;
        // Identify the first two elements that are out of order
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i]) {
                if (first == -1) {
                    first = i - 1;
                    second = i;
                } else {
                    second = i;
                }
            }
        }

        // Swap the first two out-of-order elements
        if (first != -1 && second != -1) {
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }

        // If still not sorted, further check and correct
        if (!isSorted(arr)) {
            // Find next potential misplacement and correct it
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    second = i;
                    break;
                }
            }
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
    }

    // Helper function to check if array is sorted
    static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] num = {1, 10, 4, 5, 7, 9, 2, 11};
        sortArray(num);
        for (int val : num) {
            System.out.print(val + " ");
        }
    }
}
