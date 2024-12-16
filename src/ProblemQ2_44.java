public class ProblemQ2_44 {

    static void partition(int[] arr){
        int l=0,r=arr.length-1;
        while (l<r){
            while (arr[l]<0)l++;
            while (arr[r]>=0)r--;
            if (l<r){
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={-13,20,7,0,-4,-13,11,-5,-13};
        partition(arr);
        for (int val:arr){
            System.out.print(val+" ");
        }
    }
}
