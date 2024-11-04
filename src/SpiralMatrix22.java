import java.util.Scanner;

public class SpiralMatrix22 {
    static void PrintArray(int[][] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void Spiral(int[][] arr,int r,int c){
        int topRow=0,rightCol=c-1,bottomRow=c-1,leftCol=0;
        int total=0;
        while (total<r*c){
            //TopRow  -> leftCol to rightCol
            for (int j=leftCol;j<=rightCol && total<r*c;j++){
                System.out.print(arr[topRow][j]+ " ");
                total++;
            }
            topRow++;

            //RightCol  -> topRow to BottomRow
            for (int i=topRow;i<=bottomRow && total<r*c;i++){
                System.out.print(arr[i][rightCol]+" ");
                total++;
            }
            rightCol--;

            //BottomRow -> rightCol to leftCol
            for (int j=rightCol;j>=leftCol  && total<r*c;j--){
                System.out.print(arr[bottomRow][j]+" ");
                total++;
            }
            bottomRow--;
            //LeftCol -> bottomRow to topRow
            for (int i=bottomRow;i>=topRow && total<r*c;i--){
                System.out.print(arr[i][leftCol]+" ");
                total++;
            }
            leftCol++;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size .");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Original Array.");
        PrintArray(arr);
        System.out.println("The spiral Araay order is.");
        Spiral(arr,row,col);
//        PrintArray(arr);
    }
}