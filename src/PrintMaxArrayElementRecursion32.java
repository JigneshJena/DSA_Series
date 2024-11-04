import java.util.Scanner;

public class PrintMaxArrayElementRecursion32 {

//    static int printMaxElement(int[] arr,int ind){
//        int max=-1;
//        if(arr.length==ind) return max;
//        if(max<arr[ind]) max=arr[ind];
//       max= printMaxElement(arr,ind+1);
//        return max;
//    }

    static int printmax(int[] arr,int idx){
        if (idx==arr.length-1) return arr[idx];
        int smallElemetn=printmax(arr,idx+1);
        return Math.max(arr[idx],smallElemetn);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size.");
        int sz=sc.nextInt();
        int[] arr=new int[sz];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int ind=0;
        System.out.println("The Max Element is. "+printmax(arr,ind));
    }
}
