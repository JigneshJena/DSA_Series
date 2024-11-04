import java.util.ArrayList;
import java.util.Scanner;

public class ReturnSubStringRecursion35 {




    static void printSSQ(String s,String Current){
        if (s.length()==0){
            System.out.println(Current);
            return;
        }
        char curr=s.charAt(0);
        String remcurr=s.substring(1);
        printSSQ(remcurr,Current+curr);
        printSSQ(remcurr,Current);
    }



    static ArrayList<String> getssq(String s){
        ArrayList<String> ans=new ArrayList<>();
        if (s.length()==0){
            ans.add("");
            return ans;
        }
        ArrayList<String> smallAns=getssq(s.substring(1));
        char current=s.charAt(0);
        for (String ss:smallAns){
             ans.add(ss);
             ans.add(current+ss);
        }
return ans;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your String for subString.");
        String string= sc.nextLine();
        ArrayList<String > ans=getssq(string);
        for (String ss:ans){
            System.out.print(ss+" ");
        }

        System.out.println("Printing without using extra space.");
        printSSQ("ABC","");
    }
}
