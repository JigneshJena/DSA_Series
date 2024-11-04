import  java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_Wrapper_Class_24 {

    static void swapArrayList(ArrayList<Integer> l2){
        int i=0,j=l2.size()-1;
        while (i<j){

            Integer temp=Integer.valueOf(l2.get(i));
            l2.set(i,l2.get(j));
            l2.set(j,temp);
            i++;
            j--;
        }

    }
    public static void main(String [] args){

//
//        //Wrapper Classes
//
//
//        //Integer i= new Integer( 6); // Old method
////        Integer in=Integer.valueOf(6); //New method
//    //     System.out.println(i);
//
//        Float f=Float.valueOf(5.2f);
//        System.out.println(f);
//
//
//        ArrayList<Integer> l1=new ArrayList<>();
//
//        //add new elements
//
//        l1.add(5);
//        l1.add(6);
//        l1.add(7);
//        l1.add(8);
//
//
//
//        //get an elements at index i
//
//        System.out.println(l1.get(0));
//
//        // print with for loop
////        for (int i=0;i<l1.size();i++){
////            System.out.println(l1.get(i));
////        }
//
//
//        //printing the array ist directly
//
//        System.out.println(l1);
//
//        //adding element at some index i
//
//        l1.add(2,200);
//        System.out.println(l1);
//
//
//        //modifying element at index i
//
//        l1.set(2,20);
//        System.out.println(l1);
//        // removing an element at index i
//
//        l1.remove(2);
//        System.out.println(l1);
//
//        // removing an element e
//
//        l1.remove(Integer.valueOf(5));
//        System.out.println(l1);
//
//        // Cheking if an element is exits
//
//        boolean ans=l1.contains(Integer.valueOf(60));
//        System.out.println(ans);
//
//        // if you don't specify class, you can put anything inside l
//        ArrayList l=new ArrayList();
//        l.add("Jignesh");
//        l.add(100);
//        l.add(true);
//        System.out.println(l);
//
//
//        l1.add(6);
//        System.out.println(l1);
//        System.out.println("Checking list is empty."+l1.isEmpty());
//        System.out.println("index of particular element -> "+l1.indexOf(Integer.valueOf(6)));
//        System.out.println("last index "+l1.lastIndexOf(6));

        // Write a program to Reverse the given ArrayList.

       ArrayList<Integer> l2=new ArrayList<>();
         l2.add(0);
        l2.add(1000);
        l2.add(23);
        l2.add(240);
        l2.add(52);
        l2.add(520) ;
        System.out.println("original list"+l2);
//        swapArrayList(l2);
        Collections.reverse(l2);
        System.out.println("the reverse array is."+l2);
        Collections.sort(l2);
        System.out.println("Ascending order "+l2);
        Collections.sort(l2,Collections.reverseOrder());
        System.out.println("Ascending order "+l2);


        ArrayList<String> ls=new ArrayList<>();
        ls.add("HII");
        ls.add("Jignesh");
        ls.add("Jena");
        System.out.println("OG"+ls);
        Collections.sort(ls);
        System.out.println("The Name is short "+ls);


    }

}
