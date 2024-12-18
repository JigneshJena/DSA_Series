public class CountSort_43 {
    static void display(int[] a){
        for (int val:a){
            System.out.print(val+" ");
        }
    }
    static int maxfind(int[] arr){
        int max= Integer.MIN_VALUE  ;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    static void basicCount(int[]arr){
       int max=maxfind(arr);
       int[] count=new int[max+1];
       for (int i=0;i<arr.length;i++){
           count[arr[i]]++;
       }
       int k=0;
       for (int i=0;i< count.length;i++){
           for (int j=0;j<count[i];j++){
               arr[k++]=i;
           }
       }
    }

    static void CountSort(int[]arr){
        int n=arr.length;
        int[] output=new int[n];
        int max=maxfind(arr);//find largest element of the arr
        int[] count=new int[max+1];
        for (int i=0;i<arr.length;i++){//make frequency array
            count[arr[i]]++;
        }
        for (int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }

        for (int i=n-1;i>=0;i--){
            int idx=count[arr[i]]-1;
            output[idx]=arr[i];
            count[arr[i]]--;
        }
        // copy all element of output to arr
        for (int i=0;i<n;i++){
            arr[i]=output[i];
        }

    }

    public static void main(String[] args) {
        int[]  arr={6,3,652,2334,233,35,2,0,0};
//        basicCount(arr);
        CountSort(arr);
        display(arr);
    }
}
