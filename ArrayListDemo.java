import java.util.ArrayList;
// this pakage is always to be if using ArrayList 
import java.util.Collections;
// imports a package for collections 
// if you dont want to put too many packages at different tinmes just put in one thing : import.java.util.* but 
// it brings a lot of other packages too that are not really needed 
public class ArrayListDemo {
    public static void main(String args[]) {
        ArrayList<Integer> array = new ArrayList(); // (1,45,65,78,95,35)
        array.add(35); // a[0]
        array.add(20);
        array.add(3);
        array.add(26);
        array.add(82); // a[n]
        System.out.println(array);
        for (int i = 0; i < array.size(); i++) {
            //get 
            System.out.println(array.get(i));
        }
        // one more way to indexed element 
       int b= array.get(0);
       System.out.println(b);

       // if we want to add at a particular index
       array.add(5, 1);
       System.out.println(array);

       //set element 
       array.set(0,5);
        System.out.println(array);

        //delete element 
        array.remove(3);
        System.out.println(array);

        //size
        int size = array.size();
        System.out.println(size);

        //loops 
        for(int i=0; i<array.size();i++){
            System.out.print(array.get(i));
        }
        System.out.println();

        ArrayList<String> array2 = new ArrayList();
        int numWordsOfLength = array2.size();
        array2.add("Oh");
        array2.add("me");
        array2.add("and");
        array2.add("cs");
        array2.add("sshh");

        System.out.println(numWordsOfLength);

        for(int i=0; i<array2.size();i++){
            System.out.print(array2.get(i));
        }
        System.out.println();


        //sorting 
        Collections.sort(array);
        System.out.println(array);

    }
}
