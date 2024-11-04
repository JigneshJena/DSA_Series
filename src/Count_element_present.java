import java.util.Scanner;
//Count the particular element in array
public class Count_element_present {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for (int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the Array.");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("Enter element to count .");
        int x;
        x=sc.nextInt();
        int count=0,li=-1;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==x){
                count++;
                li=i;
            }
        }
        System.out.println("The Element present in the array is ."+count);
        System.out.println("The Element last occurance in position is ."+li);
    }
}
