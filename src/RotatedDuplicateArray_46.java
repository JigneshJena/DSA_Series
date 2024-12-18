public class RotatedDuplicateArray_46 {

        static int search(int[]ar,int target){
            int st=0,end=ar.length-1;
            while (st<=end){
                int mid=st+(end-st)/2;
                if (ar[mid]==target){
                    return mid;

                }else if (ar[st]==ar[mid] && ar[end]==mid){
                    st++;
                    end--;
                }
                else if (ar[mid]<=ar[end]){
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
            int[] ar={
                    1,1,1,2,2,3,1};
            int target=2;
            System.out.println(search(ar,target));
        }
    }


