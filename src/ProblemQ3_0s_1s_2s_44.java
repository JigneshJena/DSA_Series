public class ProblemQ3_0s_1s_2s_44 {

    static void display(int[] arr){
        for (int val:arr){
            System.out.print(val+" ");
        }
    }

    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    static void sort012(int[] a){

        int lo=0,mid=0,hi=a.length-1;
        while (mid<=hi){
            if (a[mid]==0){
                swap(a,mid,lo);
                mid++;
                lo++;
            }else if(a[mid]==1){
                mid++;
            }else {
                swap(a,mid,hi);
                hi--;
            }
        }
    }

    public static void main(String[] args) {
        int[] num={2,2,0,0,1,1,2,0,1,0};
        sort012(num);
        display(num);
    }
}
