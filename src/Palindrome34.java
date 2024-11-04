import java.util.Scanner;

public class Palindrome34 {
    static String ReverseWithoutIndex(String st){
        if (st.isEmpty()) return "";
        String smallAns=ReverseWithoutIndex(st.substring(1));
        return smallAns+st.charAt(0);
    }


    static boolean Palindromechek(String st,int start,int end){
        if (start>=end)return true;
        if (st.charAt(start)!=st.charAt(end)){
            return false;
        }
         return true;
    }

    // Correct Way is
    static boolean ispalindrome(String st,int start,int end){
        if (start >= end) return true;
        return (st.charAt(start) == st.charAt(end) && ispalindrome(st,start+1,end-1));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String.");
        String st= sc.nextLine();
        String rev=ReverseWithoutIndex(st);
        if (st.equals(rev)){
            System.out.printf("\n%s is Palindrome ",st);
        }
        else System.out.printf("\n%s is not a palindrome",st);
        System.out.println("\nThe give string is palindrome? not correct code (True/False) -> "+Palindromechek(st,0,st.length()-1));
        System.out.println("\nThe give string is palindrome? Correct Code  (True/False) -> "+ispalindrome(st,0,st.length()-1));
    }
}
