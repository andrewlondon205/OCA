package c3;

import java.util.*;

public class JavaArrays {

    public static void main(String[] args) {
        //  creatingArrays();
        //  usingArrays();
        //  sortingArrays();
        binarySearch();
    }

    public static void creatingArrays() {
        int[] numbers1 = new int[3];
        int[] numbers2 = new int[]{42, 55, 99};
        int[] numbers3 = {1, 2, 3, 4};

        System.out.println(numbers1.length);
        System.out.println(numbers2.length);
        System.out.println(Arrays.toString(numbers1));
        System.out.println(Arrays.toString(numbers2));
        System.out.println(Arrays.toString(numbers3));

        int[] animals;
        int[] animals2;
        int animals3[];
        int animals4[];

        int[] ids, types;
        int[] aws, typo;
    }

    public static void usingArrays() {
        String[] bands = {"acdc", "gunsnroses", "nirvana"};
        String[] ref = bands;

        String[] singers = {"acdc", "gunsnroses", "nirvana"};

        /**
         * - Bear in mind that "equals" method when invoked on arrays, does not examine the array content, but
         *   the object reference.
         */
        System.out.println(bands.equals(ref)); // true
        System.out.println(bands.equals(singers)); //false

        String[] strings = {"stringValue"};
        Object[] objects = strings;

        String[] againStrings = (String[]) objects;
        // againStrings[0] = new StringBuilder(); does not compile
        objects[0] = new StringBuilder();

        String[] mammals = {"monkey", "chimp", "donkey"};
        System.out.println(mammals.length);
        System.out.println(mammals[0]);
        System.out.println(mammals[1]);
        System.out.println(mammals[2]);

        int[] numbers = new int[10];
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

        int[] elements = {4, 2, 8, 10, 32, -5, -85};
        Arrays.sort(elements);
        System.out.println(Arrays.toString(elements));

        String s1 = "CRICKET";
        StringBuilder sb = new StringBuilder(s1);


        System.out.println(sb.equals("CRICKET") ? "X" : (sb.equals(new StringBuilder(s1)) ? "Y" : "Z"));

    }

    public static void binarySearch() {
        int[] numbers = {2, 4, 6, 8};
        System.out.println(Arrays.binarySearch(numbers, 2));
        System.out.println(Arrays.binarySearch(numbers, 4));
        System.out.println(Arrays.binarySearch(numbers, 1));
        System.out.println(Arrays.binarySearch(numbers, 3));
        System.out.println(Arrays.binarySearch(numbers, 9));
    }

    public static void multiDimensionalArrays() {

        int[][] vars1;
        int vars2[][];
        int[] vars3[];
        int[] vars4[], space[][];

        String[][] rectangle = new String[3][2];
        rectangle[0][1] = "set";
        int[][] differentSize = {{1, 4}, {3}, {9, 8, 7}};

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
        // addElements();
        //  removeElements();
        //   settingElements();
        //    isEmptyAndSize();
        // clearMethod();
        // containsMethod();
        // equalsMethod();
        // conversion();
        sorting();
    }

    public static void creatingArrayLists() {

        /**
         * import java.util.*  import whole package including ArrayList
         * import java.util.ArrayList;  import just ArrayList
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
        // ArrayList implements toString() method, meaning that it is possible to visualize the contents just by printing it

    }

    public static void addElements() {
        /**
         * add()
         * - there are two overloaded methods that insert a new value in the ArrayList
         * - method signature is as follows:
         *
         * - boolean add (E element) -> NOTE: it returns a boolean value
         * - void add (int index, E element) -> NOTE: does not return a boolean value
         */

        ArrayList list = new ArrayList();

        list.add("hawk");
        list.add(Boolean.TRUE);

        System.out.println(list);

        ArrayList<String> safer = new ArrayList<>();
        safer.add("Jack");
        safer.add("Sparrow");
        // safer.add(Boolean.TRUE); does not compile because only string objects are allowed.
        safer.add(Integer.valueOf(52).toString()); // does compile because the integer was converted to string
        System.out.println(safer);  //  [Jack, Sparrow, 52]

        List<String> rockBands = new ArrayList<>();
        rockBands.add("acdc");
        rockBands.add(1, "guns n roses");
        rockBands.add(0, "linkin park");
        rockBands.add(1, "metallica");
        rockBands.add(2, "rolling stones");
        // rockBands.add(-1,"the beatles"); throws IndexOutOfBoundsException
        rockBands.add(null); // compiles and executes successfully
        //rockBands.add(8,"Katy Perry"); // throws IndexOutOfBoundsException

        System.out.println(rockBands); // [linkin park, metallica, rolling stones, acdc, guns n roses, null]
    }

    public static void removeElements() {

        /**
         * remove()
         *
         * - These methods remove the first matching value in the ArrayList or remove the element at a specified index.
         * - The method signatures are as follows:
         *
         * - boolean remove(Object object) NOTE: it returns a boolean value
         * - E remove(int index) NOTE: it returns the element that got removed.
         */

        List<String> bands = new ArrayList<>();
        bands.add("acdc");
        bands.add(1, "guns n roses");
        bands.add(0, "linkin park");
        bands.add(1, "metallica");
        bands.add(2, "rolling stones");

        System.out.println(bands.remove("guns n roses")); // returns true
        System.out.println(bands.remove("jonas brothers")); // returns false without throwing an exception
        System.out.println(bands.remove(2)); // returns the removed element
        // bands.remove(124); throws exception
        // bands.remove(-1); throws exception

        System.out.println(bands);
    }

    public static void settingElements() {

        /**
         * set()
         *
         * - Method that changes one of the elements of the ArrayList without changing the size.
         * - The method signature is as follows:
         *
         * - E set(int index, E newElement) NOTE: it returns the element that got replaced;
         */

        byte a = 0; // valid
        short b = 1; // valid
        int c = 2; // valid
        long f = 3;

        List<String> countries = new ArrayList<>(Arrays.asList("china", "japan", "united states", "italy"));
        System.out.println(countries.set(0, "india"));
        System.out.println(countries.set(3, "canada"));
        // System.out.println(countries.set(-1,"russia")); throws exception
        // System.out.println(countries.set(254,"Quatar")); throws exception
        System.out.println(countries.set(Integer.valueOf(2), "australia"));
        System.out.println(countries.set(a, "dubai"));
        // System.out.println(countries.set(f,"52")); does not compile if we try to add a data type greater than int
        System.out.println(countries);
    }

    public static void isEmptyAndSize() {

        /**
         * isEmpty() and size() methods look at how many of the slots are in use. The method signatures are as follows:
         *
         * - boolean isEmpty() -> returns a boolean value
         * - int size () -> returns an integral number
         */

        List<Integer> numbers = new ArrayList<>(Arrays.asList(4, 9, 10, 24, 52));
        System.out.println(numbers.isEmpty());
        System.out.println(numbers.size());
    }

    public static void clearMethod() {

        /**
         * - The clear() method provides an easy way to discard all elements of the ArrayList.
         * - The method signature is as follows:
         * - void clear() -- method doesn't return anything
         *
         */
        List<Integer> num = new ArrayList<>(Arrays.asList(5, 9, 20, 12, 59, 9));

        System.out.println(num.size());
        System.out.println(num.isEmpty());
        num.clear();
        System.out.println(num.size());
        System.out.println(num.isEmpty());
        System.out.println(num);
    }

    public static void containsMethod() {

        /**
         * - The contains() method checks whether a certain value is in the ArrayList.
         * - The method signature is as follows:
         * - boolean contains(Object object) -> returns boolean object
         *
         */

        List<String> animals = new ArrayList<>(Arrays.asList("eagle", "lion", "giraffe", "elephant"));
        System.out.println(animals.contains("lion"));
        System.out.println(animals.contains("hyena"));
        System.out.println(animals.contains(new Date())); // note that the method will accept any value or object

        /*
          This method calls equals() on each element of the ArrayList to see whether
          there are any matches. Since String implements equals(), this works out well.
         */
    }

    public static void equalsMethod() {

        /**
         * - equals()
         * - ArrayList has a custom implementation of equals() so you can compare two lists to see if they contain the
         *   same elements in the same order.
         *
         * - boolean equals(Object object) -> NOTE: it returns boolean value
         */

        List<String> one = new ArrayList<>(Arrays.asList("krystal", "soultry"));
        List<String> two = new ArrayList<>(Arrays.asList("krystal", "soultry"));

        System.out.println(one.equals(two));
        one.add("shreya");
        System.out.println(one.equals(two));

        /**
         * - Up to now, we’ve only put String objects in the ArrayList. What happens if we want to put primitives in?
         * - Each primitive type has a wrapper class, which is an object type that corresponds to the primitive.
         *
         * WRAPPER CLASSES
         * Primitive type               Wrapper Class            Example
         * boolean                      Boolean                  new Boolean(true)
         * byte                         Byte                     new Byte((byte) 1)
         * short                        Short                    new Short((short) 1)
         * int                          Integer                  new Integer(1)
         * long                         Long                     new Long(1)
         * float                        Float                    new Float(1.0)
         * double                       Double                   new Double(1.0)
         * char                         Character                new Character('c')
         *
         */

        int primitive = Integer.parseInt("123");
        Integer wrapper = Integer.valueOf("123");
        //int bad1 = Integer.parseInt("a"); // throws exception
        //Integer bad2 = Integer.valueOf("123.45"); // throws exception

        /**
         * Converting from a String
         * Wrapper Class                String to primitive                     String to wrapper class
         *
         * Boolean                      Boolean.parseBoolean("true")            Boolean.valueOf("TRUE");
         * Byte                         Byte.parseByte("1")                     Byte.valueOf("2");
         * Short                        Short.parseShort("1");                  Short.valueOf("2");
         * Integer                      Integer.parseInt("1");                  Integer.valueOf("2");
         * Long                         Long.parseLong("1");                    Long.valueOf("2");
         * Float                        Float.parseFloat("1");                  Float.valueOf("2.2");
         * Double                       Double.parseDouble("1");                Double.valueOf("2.2");
         * Character                    None                -                   None
         */

        List<Double> weights = new ArrayList<>();
        weights.add(50.5);
       // weights.add(new Double(60));
        weights.remove(50.5);
        double first = weights.get(0);

        List<Integer> heights = new ArrayList<>();
        heights.add(null);
        // int h = heights.get(0); // nullpointerexception

        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.remove(1); // removes element at index 1
        values.remove(Integer.valueOf(1)); // removes element of value 1
        System.out.println(values);

    }

    public static void conversion () {

        // ArrayList into array

        List<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");
        Object [] objectArray = list.toArray();
        System.out.println(objectArray.length);

        String[] stringArray = list.toArray(new String[0]);
        System.out.println(stringArray.length);
        System.out.println(Arrays.toString(stringArray));
        stringArray[0] = "542";
        System.out.println(Arrays.toString(stringArray));
        System.out.println(list);

        // array to ArrayList

        String [] girls = {"erica","martina","giorgia","giulia"};
        List<String> women = Arrays.asList(girls); //  returns fixed size list
        System.out.println(women);
        System.out.println(women.size());
        women.set(2,"nicoletta");
        System.out.println(women);
        System.out.println(Arrays.toString(girls));
        women.add("alessia"); // throws exception

    }

    public static void sorting () {

        //Sorts the arraylist

        List<Integer> integers = new ArrayList<>(Arrays.asList(5,20,1,32,52,528,-23,-234,88));

        System.out.println(integers);
        Collections.sort(integers);
        System.out.println(integers);

    }
}
