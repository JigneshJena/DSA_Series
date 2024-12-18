public class RotatedSortedArray_findElement_46 {
    static int search(int[]ar,int target){
        int st=0,end=ar.length-1,ans=-1;
        while (st<=end){
            int mid=st+(end-st)/2;
            if (ar[mid]==target){
                return mid;
            }else if (ar[mid]<ar[end]){
                if (target>ar[mid] && target<=ar[end]){
                    st=mid+1;
                }
                else {
                    end=mid-1;
                }
            }
            else {
                if (target>=ar[st] && target<ar[mid]){
                    end=mid-1;
                }
                else {
                    st=mid+1;
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] ar={3,4,5,1,2};
        int target=1;
        System.out.println(search(ar,target));
    }
}
