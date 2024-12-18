public class BinaryQ_findMinElement_46 {
    static int findmin(int[] ar){
        int n=ar.length;
        int st=0,end=n-1,ans=-1;
        while (st<=end){
            int mid=st+(end-st)/2;
            if (ar[mid]<ar[n-1]){
                ans=mid;
                end=mid-1;
            }else {
                st=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] ar={3,4,5,1,2};
        System.out.println(findmin(ar));
    }
}
