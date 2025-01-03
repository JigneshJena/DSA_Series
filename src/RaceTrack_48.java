public class RaceTrack_48 {

    static  boolean isPossible(int[] a,int k,int dis){
        int kidsPlace=1;
        int lastkid=a[0];
        for (int i=1;i<a.length;i++){
            if (a[i]-lastkid>=dis){
                kidsPlace++;
                lastkid=a[i];
            }
        }
return kidsPlace>=k;
    }

    static int raceTrack(int[]a,int k){
        if (k>a.length)return -1;
        int st=0,end=(int) 1e9;
        int ans=-1;
        while (st<=end){
            int mid=st+(end-st)/2;
            if (isPossible(a,k,mid)){// Can k kids be placed such that no 2 kis have distance lesser than mid
                ans=mid;
                st=mid+1;
            }else {
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a={1,2,4,8,9};
        int k=3;
        System.out.println(raceTrack(a,k));
    }
}
