import java.util.Scanner;

public class ReverseStringReccursion34 {

    static String ReverseWithoutIndex(String st){
        if (st.isEmpty()) return "";
        String smallAns=ReverseWithoutIndex(st.substring(1));
        return smallAns+st.charAt(0);
    }

    static String Reverse(String st,int idx){
        if (st.length()==idx) return "";
        String smallAns=Reverse(st,idx+1);
        return smallAns+st.charAt(idx);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String.");
        String st= sc.nextLine();
        System.out.println("The Final String After Reversing Element is "+Reverse(st,0));
        System.out.println("The Final String After Reversing Element Without index is "+ReverseWithoutIndex(st));
    }
}
