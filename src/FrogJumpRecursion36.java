public class FrogJumpRecursion36 {

    static int Best(int[] h,int n,int idx){
        if (n-1==idx)return 0;
        int opt1=Math.abs(h[idx]-h[idx+1])+Best(h,n,idx+1);
        if (n-2==idx) return opt1;
        int opt2=Math.abs(h[idx]-h[idx+2])+Best(h,n,idx+2);

        return Math.min(opt1,opt2);
    }

    public static void main(String[] args) {
        int [] height={10,34,405,26};
        System.out.println("The minimum Cost is ."+Best(height, height.length, 0));
    }
}
