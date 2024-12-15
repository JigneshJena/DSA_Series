public class ShortProbQ2_L_40 {
    static void lexicographical(String[] fruitss){
        for (int i=0;i<fruitss.length-1;i++){
            int min_index=i;
            for (int j=i+1;j<fruitss.length;j++){
                if (fruitss[j].compareTo(fruitss[min_index])<0){
                    min_index=j;
                }
            }
            String temp=fruitss[i];
            fruitss[i]=fruitss[min_index];
            fruitss[min_index]=temp;
        }
    }

    public static void main(String[] args) {
        String[] fruits={"kiwi","apple","papaya","mango"};
      lexicographical(fruits);
        for (String val:fruits){
            System.out.print(val+" ");
        }

    }
}
