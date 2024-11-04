public class SumofSubsetRecursion35 {

    static void subSetSum(int[] a,int n,int idx,int sum){
        if (idx>=n){
            System.out.print(sum+" ");
            return;
        }
        subSetSum(a,n,idx+1,sum+a[idx]);
        subSetSum(a,n,idx+1,sum);
    }

    public static void main(String[] args) {
        int [] arr={2,4,5};
        subSetSum(arr,arr.length,0,0);
    }
}
