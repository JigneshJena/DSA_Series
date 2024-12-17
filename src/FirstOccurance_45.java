public class FirstOccurance_45 {
    static int firstOccurance(int[] num,int target){
        int n=num.length;
        int st=0,end=n-1,occ=-1;
        while (st<=end){
            int mid=st+(end-st)/2;
            if (num[mid]==target){
                occ=mid;
                end=mid-1;
            } else if (target<num[mid]) {
                end=mid-1;
            }
            else {
                st=mid+1;
            }
        }
        return occ;
    }

    static int lastOccurrence(int[] num,int target){
        int n=num.length;
        int st=0,end=n-1,occ=-1;
        while (st<=end){
            int mid=st+(end-st)/2;
            if (num[mid]==target){
                occ=mid;
                st=mid+1;
            } else if (target<num[mid]) {
                end=mid-1;
            }
            else {
                st=mid+1;
            }
        }
        return occ;
    }

    public static void main(String[] args) {
        int[] num={1,3,3,3,6,7,8,9,9,9};

        System.out.println("The First Occurrence of Given Number is:"+firstOccurance(num,9));
        System.out.println("The First Occurrence of Given Number is:"+lastOccurrence(num,9));
    }
}
