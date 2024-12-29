package Strings;

import java.util.Scanner;

public class togelCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder(sc.nextLine());
        System.out.println(sb);
        for (int i=0;i<sb.length();i++){
            boolean flag=true;
            char ch=sb.charAt(i);
            if (ch==' ')continue;
            int asci=(int) ch;
            if (asci>=97)flag=false;
                if (flag==true) {
                    asci += 32;
                    char dh = (char) asci;
                    sb.setCharAt(i, dh);
                }
            else {
                asci-=32;
                char dh=(char)asci;
                sb.setCharAt(i,dh);
            }
        }
        System.out.println(sb);
    }
}
