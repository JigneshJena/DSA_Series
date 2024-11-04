import java.util.Scanner;



public class Array_2D_Basics20 {

    static int[][] Multiplication(int[][] arr,int[][] brr){
//        System.out.println("The row is "+arr[0].length);
//        System.out.println("The column is "+brr.length);

        int[][] multiplication = new int[arr.length][brr[0].length];
        if(arr[0].length==brr.length) {
            for (int i=0;i<arr.length;i++){
                for (int j=0;j<brr[0].length;j++){
                    //multiplication[i][j]=0;
                    for (int k=0;k<brr.length;k++){
                        multiplication[i][j] +=(arr[i][k]*brr[k][j]);
                    }
                }
            }
        }
        else {
            System.out.println("The column and row Does't Match.");
        }
        return multiplication;
    }


    static int[][] AddingMatrix(int[][] arr,int[][] brr){
        int [][]  addMatirx=new int[arr.length][arr[0].length];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                addMatirx[i][j]=arr[i][j]+brr[i][j];
            }
        }
             return addMatirx;
    }


    //Printing 2-D Array
    static int[][] Printing2Darray(int[][] arr){
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        return arr;
    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array Rows and columns.");
        int row=sc.nextInt();
        int col=sc.nextInt();
//        int firstrow=row,firstcol=col;
        int[][] arr=new int[row][col];

        // Taking input 2-D Array
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter Second Array Row and Column");
        int r=sc.nextInt();
        int c=sc.nextInt();
//        int secondrow=r,second=col;
        int[][] brr=new int[r][c];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                brr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The First Matrix.");
        Printing2Darray(arr);
        System.out.println("The Second Matrix.");
        Printing2Darray(brr);

        System.out.println("The multiplication of matrix is ."+ Printing2Darray(Multiplication(arr,brr)));


    }
}
