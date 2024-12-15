public class RadixSort_43 {
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
    static void CountSort(int[]arr,int place){
        int n=arr.length;
        int[] output=new int[n];
        int[] count=new int[10];
        for (int i=0;i<arr.length;i++){//make frequency array
            count[(arr[i]/place)%10]++;
        }
        // Make prefix sum array of count array
        for (int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }

        for (int i=n-1;i>=0;i--){
            int idx=count[(arr[i]/place)%10]-1;
            output[idx]=arr[i];
            count[(arr[i]/place)%10]--;
        }
        // copy all element of output to arr
        for (int i=0;i<n;i++){
            arr[i]=output[i];
        }
    }

    static void Radix(int [] arr){
        int max=maxfind(arr);
        for (int place=1;max/place>0;place *=10){
            CountSort(arr,place);
        }
    }
    public static void main(String[] args) {
        int[]  arr={6,3,652,2334,233,35,2,0,0};
        Radix(arr);
        display(arr);
    }
}
