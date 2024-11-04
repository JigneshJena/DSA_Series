import java.util.Scanner;
public class TransposeMatrix21 {
    static void PrintArray(int[][] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void reverse(int[] arr){
        int n=arr.length;
        int start=0;
        int end=n-1;
        while (start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    static void InPlaceTransposeRotation(int[][] arr){

        for (int i=0;i<arr[0].length;i++){
            for (int j=i;j<arr.length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
            reverse(arr[i]);
        }
    }

    static void InPlaceTranspose(int[][] arr){

        for (int i=0;i<arr[0].length;i++){
            for (int j=i;j<arr.length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }

    static int[][] Transpose(int[][] arr){
       int[][] Transposee=new int[arr[0].length][arr.length];
        for (int i=0;i<arr[0].length;i++){
            for (int j=0;j<arr.length;j++){
            Transposee[i][j]=arr[j][i];
            }
            System.out.println();
        }
        return Transposee;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size .");
        int row= sc.nextInt();
        int col=sc.nextInt();
        int[][] arr=new int[row][col];
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Original Array.");
        PrintArray(arr);
        System.out.println("The Transpose and 90Degree rotaion array is .");
//        int[][] ans=Transpose(arr);
//        PrintArray(ans)
      InPlaceTransposeRotation(arr);
      PrintArray(arr);
    }
}
