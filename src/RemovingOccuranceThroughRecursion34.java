import java.util.Scanner;

public class RemovingOccuranceThroughRecursion34 {

    static String RemoveElement(String st,String strem,int idx){
        if (idx==st.length()) return "";
        String SmallAns=RemoveElement(st,strem,idx+1);
        char current =st.charAt(idx);
        if (current != strem.charAt(0)){
            return current+SmallAns;
        }
        return SmallAns;
    }
    static String Remove(String st,String remove){
        if (st.length()==0) return "";
        String smallAns=Remove(st.substring(1),remove);
        char curr=st.charAt(0);
        if (curr != remove.charAt(0)){
            return curr+smallAns;
        }
        return smallAns;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String.");
        String st= sc.nextLine();
        System.out.println("Enter Character Which you want to Remove.");
        String  srem=sc.nextLine();
        System.out.println("The Final String After Removing Element is "+RemoveElement(st,srem,0));
        System.out.println("The Final String After Removing Element in Without using index is "+Remove(st,srem));
    }
}
