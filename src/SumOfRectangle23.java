import java.util.Scanner;

public class SumOfRectangle23 {

    static void PrintArray(int[][] arr){
        for (int i=0;i<arr.length ;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }

    static void findPrfixSumMatrix(int[][] arr){
        int r=arr.length;
        int c=arr[0].length;
        //traverse horizontally to calculate row-wise prefix sum
        for (int i=0;i<r;i++){
            for (int j=1;j<c;j++){
                arr[i][j] += arr[i][j-1];
            }
        }
        PrintArray(arr);
    }

    static void Prefixcolumn(int[][] arr){
        int r=arr.length;
        int c=arr[0].length;
        //traverse horizontally to calculate row-wise prefix sum
        for (int j=0;j<c;j++){
            for (int i=1;i<r;i++){
                arr[i][j] += arr[i-1][j];
            }
        }
        System.out.println("Column prefix");
        PrintArray(arr);
    }

    static int ThirdBetterSolutionSumOfRectangle(int[][] arr,int l1,int r1,int l2,int r2){
        int ans=0,sum=0,up=0,left=0,leftup=0;
        findPrfixSumMatrix(arr);
        Prefixcolumn(arr);
        //arr[][]  += arr[i-1][j]

        sum=arr[l2][r2];
        if(r1>=1) {
            up = arr[l1 - 1][r2];
        }
        if (l1>=1) {
            left = arr[l2][r1 - 1];
        }
        if (l1>=1 && r1 >=1) {
            leftup = arr[l1 - 1][r1 - 1 ];
        }

//        ans=arr[l2][r2]-arr[l1-1][r2]-arr[l2][r1-1]+arr[l1-1][r1-1];

        ans=sum-up-left+leftup;
        return ans;
    }


    static int SumOfRangeOfSquareMatrix2(int[][] arr,int l1,int r1,int l2,int r2){
        int sum=0;
        findPrfixSumMatrix(arr);
        for (int i=l1;i<=l2;i++){
            // r1 to r2 sum for row i
            if (r1>=1) {


                sum += (arr[i][r2] - arr[i][r1 - 1]);
            }
            else {
                sum +=arr[i][r2];
            }
        }
        return sum;
    }

    //Bruet Forece
    static int SumOfRangeOfSquareMatrix(int[][] arr,int l1,int r1,int l2,int r2){
        int sum=0;
        for (int i=l1;i<=l2;i++){
            for (int j=r1;j<=r2;j++){
                sum +=arr[i][j];
            }
        }
        return sum;
    }


    public  static void main(String [] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array row and column.");
        int row= sc.nextInt();
        int col= sc.nextInt();
        int[][] arr=new int[row][col];
        System.out.println("Enter element.");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the range  L1 and R1");
        int l1= sc.nextInt();
        int r1= sc.nextInt();
        System.out.println("Enter the range L2 and R2");
        int l2= sc.nextInt();
        int r2=sc.nextInt();
//  System.out.println("The Sum of given Range is ."+SumOfRangeOfSquareMatrix(arr,l1,r1,l2,r2));
//  System.out.println("The Sum of given Range is ."+SumOfRangeOfSquareMatrix2(arr,l1,r1,l2,r2));
        System.out.println("the sum of given Range  is ."+ThirdBetterSolutionSumOfRectangle(arr,l1,r1,l2,r2));
    }
}