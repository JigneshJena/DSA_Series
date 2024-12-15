public class CountSort_43 {
    static void display(int[] a){
        for (int val:a){
            System.out.print(val+" ");
        }
    }
    static int maxfind(int[] arr){
        int max= Integer.MIN_VALUE  ;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    static void basicCount(int[]arr){
       int max=maxfind(arr);
        System.out.println("The max value is."+max);
    }

    public static void main(String[] args) {
        int[]  arr={6,3,652,2334,233,35,2};
        basicCount(arr);
    }
}
