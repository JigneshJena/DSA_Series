package Strings;

public class charChount {
    public static void main(String[] args) {
        String str="aaabbbbcdddee";
        String  ans=""+str.charAt(0);
        int count=1;
        for (int i=1;i<str.length();i++){
            char cur=str.charAt(i);
            char prev=str.charAt(i-1);
            if (cur==prev){
                count++;
            }
            else {
                if (count>1)ans+=count;
                count =1;
                ans +=cur;
            }
        }
        if (count>1)ans+=count;
        System.out.println(ans);
    }
}
