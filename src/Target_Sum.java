import java.util.Scanner;

//target sum in array in given number
public class Target_Sum {

    static void printarray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array Size .");
        int n;
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the Array .");
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        printarray(arr);
        int target;
        target=sc.nextInt();
        int count=0;
//        for (int i=0;i<arr.length;i++){
//            for (int j=i;j<arr.length;j++){
//                if(target==arr[i]+arr[j]){
//                    System.out.println("The index is "+i+" "+j);
//                    count++;
//                }
//            }
//        }
//        System.out.println("The total pair to target the values is :"+count);




        //For Triplate sum
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                for (int k=j+1;k<arr.length;k++){
                    if(target==arr[i]+arr[j]+arr[k]){
                        System.out.println("The index is "+i+" "+j+" "+k);
                        count++;
                    }
                }
            }
        }

        System.out.println("The total number of Triplate is ."+count);
    }
}
