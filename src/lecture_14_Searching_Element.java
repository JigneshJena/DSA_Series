import java.util.Scanner;
public class lecture_14_Searching_Element {
    public static void main(String[] args){


        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("Enter array Element.");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int x;
        System.out.println("Enter array Element to find :");
        x=sc.nextInt();
        for (int i=0;i<arr.length;i++){
            //System.out.println(arr[i]);
            if(x==arr[i]){
                System.out.println("The Element is found at index number:"+i);
            }
        }
    }
}
