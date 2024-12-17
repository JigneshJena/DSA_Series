public class BinarySearch_45 {
    static boolean BinarySearch(int[] arr,int Target){
        int n=arr.length;
        int st=0,end=n-1;
        while (st<=end){
            int mid=st+(end-st)/2;
            if (arr[mid]==Target)return true;
            else if (Target<arr[mid]) {
                end=mid-1;
            }else {
                st=mid+1;
            }
        }

        return false;
    }


    static boolean recBinarySearch(int[] a,int st,int end,int Target){
        if (st<=end){
            int mid=st+(end-st)/2;
            if (a[mid]==Target)return true;
            else if(a[mid]<Target){
                return recBinarySearch(a,st,mid-1,Target);
            }
            else {
                return recBinarySearch(a,mid+1,end,Target);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] num={1,3,5,7,8,9,10};
        System.out.println("The Target Element is Present (True/False):"+BinarySearch(num,9));
        System.out.println("The Target Element is Present (True/False):"+recBinarySearch(num,0,num.length-1,7));
    }
}
