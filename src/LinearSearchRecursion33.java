import java.util.Scanner;

public class LinearSearchRecursion33 {

    static boolean LianearSearch(int[] arr,int target,int idx){
        if (arr.length==idx)return false;
        if (target==arr[idx]) return true;
        return LianearSearch(arr,target,idx+1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size.");
        int size= sc.nextInt();
        System.out.println("Enter array element.");
        int[] arr=new int[size];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter target Value.");
        int target=sc.nextInt();

        if (LianearSearch(arr,target,0)) System.out.println("Yes");
        else System.out.println("False");
        System.out.println("The Target Sum of Index is "+LianearSearch(arr,target,0));
    }
}
