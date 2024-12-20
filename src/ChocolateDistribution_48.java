public class ChocolateDistribution_48 {


    static  boolean isDivisionPossible(int[] a,int m,int mxChocolateAllowed){
        int numOfStudents=1;
        int choc=0;// number of choc current student has
        for (int i=0;i<a.length;i++){
            if (a[i]>mxChocolateAllowed)return false;
            if (choc+a[i]<=mxChocolateAllowed){
                choc+=a[i];
            }else {
                numOfStudents++;
                choc=a[i];
            }
        }
        return numOfStudents<=m;
    }

    static int distributeChocolate(int[] a,int m){
        if (a.length<m)return -1;
        int ans=0,st=1,end=(int) 1e9;
        while (st<=end){
            int mid=st+(end-st)/2;
            if (isDivisionPossible(a,m,mid)){
                ans=mid;
                end=mid-1;
            }else {
                st=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
//        int [] a={5,3,1,4,2};
        int [] a={12,34,67,90};
        int m=2;
        System.out.println(distributeChocolate(a,m));
    }
}
