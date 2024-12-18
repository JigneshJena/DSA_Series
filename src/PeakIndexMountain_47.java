public class PeakIndexMountain_47 {
    static int peakIndexMountain(int[]a){
        int st=0,end=a.length-1;
        int ans=-1;
        while (st<=end){
            int mid=st+(end-st)/2;
            if (a[mid]<a[mid+1]){
                ans=mid+1;
                st=mid+1;
            }else {
                end=mid-1;
            }
        }
        return ans;
    }

    static int peakElementMountain(int[]a){
        int st=0,end=a.length-1;
        int ans=-1;
        while (st<=end){
            int mid=st+(end-st)/2;
            if (a[mid]<a[mid+1]){
                ans=a[mid+1];
                st=mid+1;
            }else {
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a={1,3,5,6,7,8,1,4};
//        int[] a={0,1,3,5,7,5,3,1};
        System.out.println("Peak Element is : "+peakElementMountain(a));
        System.out.println("Peak Index  is : "+peakIndexMountain(a));
    }

}
