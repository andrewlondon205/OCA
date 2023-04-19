package c3;

import java.util.Arrays;

public class StringClass {
    public static void main(String[] args) {
        /**
         * IMMUTABLE OBJECT
         */
        generalRules();

    }

    public static void generalRules () {
        String name = "Krystal";
        String lastName = new String("Soultry");

        // STRING CONCATENATION RULES

        /**
         * - If both operands are numeric, + means numeric addition.
         * - If either operand is a String, + means concatenation.
         * - The expression is evaluated left to right.
         */
        System.out.println(1 + 2 ); //3
        System.out.println("a" + "b"); // ab
        System.out.println("a" + "b" + 3); // ab3
        System.out.println(1 + 2 + "c"); // 3c

        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four); // 64

        // String bool = false; does not compile
        // String var2 = 214; does not compile

        System.out.println("hi there " + true);
        System.out.println("hi there " + false);
        System.out.println("hi there " + 51);
        System.out.println("hi there " + 58.4);
        System.out.println("hi there " + 52.9d );
        System.out.println("hi there " + Arrays.toString(new String [] {"Andrew", "Visti", "Sanjay"}));

        String s = "1";
        s += "2";
        s += 3;
        System.out.println(s);

        String x = "1";
        String y = x.concat("2");
        y.concat("3");
        System.out.println(y);

        String a = "Fluffy";
        String b = new String("Fluffy"); // does not go into the String Pool


        /**
         * a  n  i  m  a  l  s
         * 0  1  2  3  4  5  6
         *
         */

        //int length() = returns the amount of characters present in the string

        String word = "animals";
        String alp = "";
        System.out.println(word.length());
        System.out.println(alp.length());

        // char charAt(int index) =  lets you query the string to find out what character is at a specific index.
        System.out.println(word.charAt(2)); // i
        System.out.println(word.charAt(0)); // a
       // System.out.println(word.charAt(210)); // throws StringIndexOutOfBounds exception

        /**
         *
         *   indexOf()
         * - The method indexOf()looks at the characters in the string and finds the first index that matches the desired value.
         * - indexOf can work with an individual character or a whole String as input.
         * - It can also start from a requested position. The method signatures are as follows:
         *
         * int indexOf(char ch)
         * int indexOf(char ch, index fromIndex) int indexOf(String str)
         * int indexOf(String str, index fromIndex)
         *
         */

        String term = "KatyPerry";
        System.out.println(term.indexOf('a')); // 1
        System.out.println(term.indexOf("al")); // -1
        System.out.println(term.indexOf('a', 4)); // -1
        System.out.println(term.indexOf("al", 5));// -1
        System.out.println(term.indexOf('y')); // 3
        System.out.println(term.indexOf("y",4)); // 8

        /**
         *  substring()
         *
         *  - It returns parts of the string. The first parameter is the index to start with for the returned string.
         *  -  As usual, this is a zero-based index. There is an optional second parameter, which is the end index you
         *     want to stop at.
         *  - second parameter is exclusive (gets ignored)
         *
         */
        // KatyPerry
        System.out.println(term.substring(3)); //yPerry
        System.out.println(term.substring(term.indexOf('P'))); // Perry
        System.out.println(term.substring(3,4)); // y
        System.out.println(term.substring(3,7)); // yPer
        System.out.println(term.substring(3,3)); //empty string
    //  System.out.println(term.substring(3,2)); // throws exception
    //  System.out.println(term.substring(3,8)); // throws exception

        /** toLowerCase() and toUppercase()
         * String toLowerCase()
         * String toUpperCase()
        **/

        String sample = "KatyPerry";
        System.out.println(sample.toLowerCase()); //katyperry
        System.out.println(sample.toUpperCase()); // KATYPERRY

        /**
         * equals() and equalsIgnoreCase()
         *
         * - boolean equals(String str)
         * - boolean equalsIgnoreCase(String str)
         *
         */

        String t1 = "Lady Gaga";
        String t2 = new String("Lady Gaga");
        String t3 = "lADy GaGA";
        System.out.println(t1.equals(t2)); // true
        System.out.println(t1.equals(t3)); // false
        System.out.println(t1.equalsIgnoreCase(t3)); // true

        /**
         *  startsWith() and endsWith()
         *  - boolean startsWith(String prefix)
         *  - boolean endsWith(String suffix)
         */

        System.out.println(t1.startsWith("L")); // true
        System.out.println(t1.endsWith("a")); // true
        System.out.println(t2.endsWith("j")); // false
        // System.out.println(t2.startswith(2.5)) does not compile

        /**
         * contains ()
         * - boolean contains(String str)
         */

        System.out.println(t2.contains("p")); // false
        System.out.println(t2.contains("a")); // true
        //System.out.println(t2.contains(421.2)) does not compile

        /**
         * replace()
         * - does a simple search and replace on the string.
         *
         * - String replace(char oldChar, char newChar)
         * - String replace(CharSequence oldChar, CharSequence newChar)
         */
        String string = "Oncologist";
        System.out.println(string.replace("o","a")); //Oncalagist
        System.out.println(string.replace('o','i')); // Onciligist
        System.out.println(string.replace("o","Architect")); // OncArchitectlArchitectgist
        // System.out.println(string.replace(new Boolean("true"))); does not compile

        /**
         *  trim()
         *  - method removes whitespace from the beginning and end of a String In terms of the exam, whitespace consists
         *    of spaces along with the \t (tab) and \n (newline) characters. Other characters, such as \r (carriage return),
         *    are also included in what gets trimmed. The method signature is as follows:
         *
         *  - public String trim()
         *
         */

        String trimmedString = " \t a b c\n".trim();
        System.out.println(trimmedString);

        /**
         * METHOD CHAINING
         * - It is common to call multiple methods on the same String
         */

        String beginning = "Katy Perry is an outstanding singer and performer";
        String result = beginning.trim().toLowerCase().replace("y","ii").replace("s","$$");
        System.out.println(result);


    }
}

class Mutable {
    private String s;
    public void setS(String newS){
        s = newS;
    }  // Setter makes it mutable public String getS() { return s; }

}

final class Immutable {
    private String s = "name";
    public String getS() {
        return s;
    }
}

class StringBuilderClass {

    public static void main(String[] args) {


    }
}
