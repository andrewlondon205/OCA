package c3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaArrays {
    public static void main(String[] args) {
      //  creatingArrays();
      //  usingArrays();
      //  sortingArrays();
        binarySearch();
    }

    public static void creatingArrays () {
        int [] numbers1 = new int [3];
        int [] numbers2 = new int [] {42,55,99};
        int [] numbers3 = {1,2,3,4};

        System.out.println(numbers1.length);
        System.out.println(numbers2.length);
        System.out.println(Arrays.toString(numbers1));
        System.out.println(Arrays.toString(numbers2));
        System.out.println(Arrays.toString(numbers3));

        int [] animals;
        int[] animals2;
        int animals3 [];
        int animals4[];

        int [] ids, types;
        int []aws, typo;
    }

    public static void usingArrays () {
        String [] bands = {"acdc", "gunsnroses","nirvana"};
        String [] ref = bands;

        String [] singers = {"acdc", "gunsnroses","nirvana"};

        /**
         * - Bear in mind that "equals" method when invoked on arrays, does not examine the array content, but
         *   the object reference.
         */
        System.out.println(bands.equals(ref)); // true
        System.out.println(bands.equals(singers)); //false

        String [] strings = {"stringValue"};
        Object [] objects = strings;

        String [] againStrings = (String[]) objects;
        // againStrings[0] = new StringBuilder(); does not compile
        objects[0] = new StringBuilder();

        String[] mammals = {"monkey", "chimp", "donkey"};
        System.out.println(mammals.length);
        System.out.println(mammals[0]);
        System.out.println(mammals[1]);
        System.out.println(mammals[2]);

        int [] numbers = new int [10];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = i + 5; //throws ArrayIndexOutOfBoundsException

        System.out.println(Arrays.toString(numbers));

    }

    public static void sortingArrays() {
        /**
         * import java.util.Arrays
         * import java.util.*;
         *
         * Arrays.sort([] array)
         * Numbers sort before letters and uppercase sorts before lowercase
         */

        int [] elements = {4,2,8,10,32,-5,-85};
        Arrays.sort(elements);
        System.out.println(Arrays.toString(elements));
    }

    public static void binarySearch() {
        int [] numbers = {2,4,6,8};
        System.out.println(Arrays.binarySearch(numbers, 2));
        System.out.println(Arrays.binarySearch(numbers, 4));
        System.out.println(Arrays.binarySearch(numbers, 1));
        System.out.println(Arrays.binarySearch(numbers, 3));
        System.out.println(Arrays.binarySearch(numbers, 9));
    }

    public static void multiDimensionalArrays () {

        int [][] vars1;
        int vars2 [][];
        int [] vars3 [];
        int [] vars4 [], space [][];

        String [][] rectangle = new String[3][2];
        rectangle[0][1] = "set";
        int[][] differentSize = {{1, 4}, {3}, {9,8,7}};

        int[][] twoD = new int[3][2];
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++)
                System.out.print(twoD[i][j] + " "); // print element
            System.out.println(); // time for a new row
        }

    }
}

class ArrayListClass {
    public static void main(String[] args) {

    }

    public static void usingArrayList () {

        /**
         * import java.util.*  import whole package including ArrayList
         * import java.util.ArrayList;  import just ArrayList
         *
         */

        // Three ways of creating arraylists

        ArrayList list1 = new ArrayList(); // creates an ArrayList containing space for the default number of elements but doesn't fill any slots yet
        ArrayList list2 = new ArrayList(10); // creates an ArrayList containing specific number of slots, but again doesn't assign any
        ArrayList list3 = new ArrayList(list2);// tells Java that we want to make a copy of another ArrayList.

        //ArrayList with Generics
        // To specify the type of data we want for our arraylist
        ArrayList<String> list4 = new ArrayList<String>();
        ArrayList<String> list5 = new ArrayList<>();

        List<String> list6 = new ArrayList<>();
        // ArrayList<String> list7 = new List<>(); does not compile because List is an interface and interfaces cannot be instantiated directly





    }
}
