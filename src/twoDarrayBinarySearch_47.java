public class twoDarrayBinarySearch_47 {
    static boolean twoArrayElementSearch(int[][] arr,int target){
        int n=arr.length,m=arr[0].length;
        int st=0,end=n*m-1;
        while (st<=end){
            int mid=st+(end-st)/2;
            int midElt=arr[mid/m][mid%m];
            if (midElt==target)return true;
            if (target<midElt){
                end=mid-1;
            }else {
                st=mid+1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println("The target element is present?: "+twoArrayElementSearch(arr,3));
    }
}
