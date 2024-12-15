public class KeyPadCombination36 {

    static void Combinatio(String dig,String[] kp,String res){
        if (dig.length()==0){
            System.out.print(res+" ");
            return;
        }
        int curNum=dig.charAt(0)-'0';
        String curChoices = kp[curNum];
        for (int i=0;i<curChoices.length();i++){

            Combinatio(dig.substring(1),kp,res+curChoices.charAt(i));
        }

    }

    public static void main(String[] args) {
        String s="23";
        String[] keyPad={"","","abc","def","ghi","jkl","mno","pqrs","tuv","WXYZ"};
        Combinatio(s,keyPad,"");
    }
}
