package c2;

import java.util.List;

public class FlowControl {

    public static void main(String[] args) {
        /**
         * WHILE
         * DO-WHILE
         * FOR
         * ENHANCED-FOR
         */
    }
}

class WhileLoop {

    public static void main(String[] args) {
        eatCheese(10);
        eatCheeseVar(10);
        executeOnce();
    }

    public static void eatCheese(int bitesOfCheese) {
        int roomInBelly = 5;

        while (bitesOfCheese > 0 && roomInBelly > 0) {
            bitesOfCheese--;
            roomInBelly--;
        }
        System.out.println(bitesOfCheese + " pieces of cheese left");
    }

    public static void eatCheeseVar(int bitesOfCheese) {
        int roomInBelly = 5;

        do {
            bitesOfCheese--;
            roomInBelly--;

        } while (bitesOfCheese > 0 && roomInBelly > 0);
        System.out.println(bitesOfCheese + " pieces of cheese left");
    }

    public static void executeOnce() {
        int x = 10;
        do {
            x++;
            System.out.println(x);
        } while (false);
    }
}

class TraditionalFor {
    public static void main(String[] args) {

        /**
         * FOR-LOOP STRUCTURE
         *
         * for(initialization; booleanExpression; updateStatement) {
         *      // Body
         * }
         *
         * 1. Initialization statement executes
         * 2. If booleanExpression is true continue, else exit loop
         * 3. Body executes
         * 4. Execute updateStatements
         * 5. Return to Step 2
         *
         */

        //infiniteForLoop();
        executeForOne();
        System.out.println();
        multipleTermsLoop();

    }

    public static void executeForOne() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
    }

    public static void infiniteForLoop() {
        for (; ; ) {
            System.out.println("Hello World");
        }
    }

    public static void multipleTermsLoop() {
        int x = 0;
        for (long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
            System.out.print(y + " ");
        }
        System.out.println();
        System.out.print(x);

        /* int x = 0;
        for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) { does not compile
            System.out.print(x + " ");
        }*/

        // code compiles without issue
        int a = 0;
        long b = 10;
        for (b = 0, a = 4; a < 5 && b < 10; a++, b++) {
            System.out.print(a + " ");
        }


        /*  for(long j = 0, int i = 4; i < 5 && j <10; i++, j++) { // DOES NOT COMPILE
                System.out.print(i + " ");
            }
        }*/

        //compiles without issue
        for (long j = 0, i = 4; i < 5 && j < 10; i++, j++) {
            System.out.print(i + " ");
        }

        // System.out.println(i); does not compile because i goes out of scope after line 117
    }
}

class EnhancedFor {

    public static void main(String[] args) {

        /**
         * ENHANCED-FOR STRUCTURE
         *
         * for (datatype instance: collection) {
         *  // body
         * }
         *
         * - Can iterate over array objects or any other object that implements iterable interface.
         *
         */
        List<String> people = List.of("Erica Vaccari", "Giulia Cipriani", "Martina Caradonna", "Giorgia Moretti");

        for (String woman : people) {
            System.out.print(woman + ", ");
        }

        // prints: Erica Vaccari, Giulia Cipriani, Martina Caradonna, Giorgia Moretti,
        String names = "Lisa";
        /*
        for (String name: names) {
            System.out.print(name + " "); does not compile because names is neither an built-in array nor a iterable object
        }*/
        String[] elements = new String[3];
/*
        for (int name : elements) {
            System.out.println(name + ","); does not compile because name is not an instance of String.
        }
*/
    }
}

class NestedLoops {
    public static void main(String[] args) {
        //nestedFor();
        nestedWhile();
    }

    public static void nestedFor() {
        int[][] matrix = {{5, 2, 1, 3}, {3, 9, 8, 9}, {5, 7, 12, 7}};

        for (int[] row : matrix) {
            for (int column = 0; column < row.length; column++) {
                System.out.print(row[column] + "\t");
            }
            System.out.println();
        }
    }

    public static void nestedWhile() {
        int x = 20;
        while (x > 0) {
            do {
                x -= 2;
            } while (x > 5);
            x--;
            System.out.print(x + "\t ");
        }
    }

}

class Labels {
    public static void main(String[] args) {

        breakLabel();
        System.out.println();
        searchSample();
        System.out.println();
        switchSample();
    }

    public static void breakLabel () {
        int [][] m = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};

        OUTER:
        for (int [] r : m) {
            INNER:
            for (int i = 0; i < r.length; i++) {
                System.out.print(r[i] + "\t");
            }
            System.out.println();
        }
    }

    public static void searchSample() {
        int [][] list = {{1,13,5},{1,2,5},{2,7,2}};
        int searchValue = 2;
        int positionX = -1;
        int positionY = -1;

        PARENT_LOOP: for(int i=0; i<list.length; i++) {
            for(int j=0; j<list[i].length; j++) {
            if(list[i][j]==searchValue) {
                positionX = i;
                positionY = j;
                break PARENT_LOOP;
            } }
        }
        if(positionX==-1 || positionY==-1) {
            System.out.println("Value "+searchValue+" not found"); }
        else {
            System.out.println("Value "+searchValue+" found at: " + "("+positionX+","+positionY+")");
        }
    }

    public static void switchSample () {

        FIRST_CHAR_LOOP:
        for (int a = 1; a <= 4; a++) {
            for (char x = 'a'; x <= 'c'; x++) {
            if (a == 2 || x == 'b') continue FIRST_CHAR_LOOP;
            System.out.print(" " + a + x);
            }
        }
    }
}


