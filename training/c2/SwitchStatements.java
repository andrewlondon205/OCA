package c2;

public class SwitchStatements {

    public static void main(String[] args) {

        /**
         * SWITCH STATEMENT STRUCTURE
         *
         *  switch (value) {
         *
         *  case 1: break;
         *  case 2: break;
         *  default: break;
         *
         *  }
         *
         * SUPPORTED DATA TYPES
         * - int and INTEGER
         * - byte and BYTE
         * - short and SHORT
         * - char and CHARACTER
         * - String
         * - Enum
         *
         * - float, FLOAT, double, DOUBLE, long, LONG, boolean, BOOLEAN aren't support.
         *
         * - The values in each case statement must be compile-time constant values of the same data type as the switch
         *   value. We can only use literals, enum constants and final constant variables.
         *
         * - By final constant, we mean that the variable must be marked with the final modifier and INITIALIZED with a
         *   literal value IN THE SAME expression in which it is declared.
         */

        int grahaNumber = 5;
        final int k = 20;

        switch (grahaNumber) {

            case k:
                break;

            case 1:
                System.out.println("The chosen graha is : " + NavaGraha.SURYA);
                System.out.println("Graha Number : " + NavaGraha.SURYA.getValue());
                break;
            case 2:
                System.out.println("The chosen graha is : " + NavaGraha.CHANDRA);
                System.out.println("Graha Number : " + NavaGraha.CHANDRA.getValue());
                break;
            case 3:
                System.out.println("The chosen graha is : " + NavaGraha.MANGALA);
                System.out.println("Graha Number : " + NavaGraha.MANGALA.getValue());
                break;
            case 4:
                System.out.println("The chosen graha is : " + NavaGraha.BUDHA);
                System.out.println("Graha Number : " + NavaGraha.BUDHA.getValue());
                break;
            case 5:
                System.out.println("The chosen graha is : " + NavaGraha.BRHASPATI);
                System.out.println("Graha Number : " + NavaGraha.BRHASPATI.getValue());
                break;
            case 6:
                System.out.println("The chosen graha is : " + NavaGraha.SHUKRA);
                System.out.println("Graha Number : " + NavaGraha.SHUKRA.getValue());
                break;
            case 7:
                System.out.println("The chosen graha is : " + NavaGraha.SHANI);
                System.out.println("Graha Number : " + NavaGraha.SHANI.getValue());
                break;
            case 8:
                System.out.println("The chosen graha is : " + NavaGraha.RAHU);
                System.out.println("Graha Number : " + NavaGraha.RAHU.getValue());
                break;
            case 9:
                System.out.println("The chosen graha is : " + NavaGraha.KETU);
                System.out.println("Graha Number : " + NavaGraha.KETU.getValue());
                break;
            default:
                System.out.println("Invalid Graha Number");
                break;

        }

        System.out.println("\n**************************************************** \n");

        int numb2 = 10;
        switch (numb2) {
            case 1:
                System.out.println("The chosen graha is : " + NavaGraha.SURYA);
                System.out.println("Graha Number : " + NavaGraha.SURYA.getValue());
            case 2:
                System.out.println("The chosen graha is : " + NavaGraha.CHANDRA);
                System.out.println("Graha Number : " + NavaGraha.CHANDRA.getValue());
            case 3:
                System.out.println("The chosen graha is : " + NavaGraha.MANGALA);
                System.out.println("Graha Number : " + NavaGraha.MANGALA.getValue());
            case 4:
                System.out.println("The chosen graha is : " + NavaGraha.BUDHA);
                System.out.println("Graha Number : " + NavaGraha.BUDHA.getValue());
            case 5:
                System.out.println("The chosen graha is : " + NavaGraha.BRHASPATI);
                System.out.println("Graha Number : " + NavaGraha.BRHASPATI.getValue());
            case 6:
                System.out.println("The chosen graha is : " + NavaGraha.SHUKRA);
                System.out.println("Graha Number : " + NavaGraha.SHUKRA.getValue());
            default:
                System.out.println("Invalid Graha Number");
            case 7:
                System.out.println("The chosen graha is : " + NavaGraha.SHANI);
                System.out.println("Graha Number : " + NavaGraha.SHANI.getValue());
            case 8:
                System.out.println("The chosen graha is : " + NavaGraha.RAHU);
                System.out.println("Graha Number : " + NavaGraha.RAHU.getValue());
            case 9:
                System.out.println("The chosen graha is : " + NavaGraha.KETU);
                System.out.println("Graha Number : " + NavaGraha.KETU.getValue());
        }

        System.out.println("\n**************************************************** \n");

        int numb3 = 3;
        switch (numb3) {

            case 1:
                System.out.println("The chosen graha is : " + NavaGraha.SURYA);
                System.out.println("Graha Number : " + NavaGraha.SURYA.getValue());
            case 2:
                System.out.println("The chosen graha is : " + NavaGraha.CHANDRA);
                System.out.println("Graha Number : " + NavaGraha.CHANDRA.getValue());
            case 3:
                System.out.println("The chosen graha is : " + NavaGraha.MANGALA);
                System.out.println("Graha Number : " + NavaGraha.MANGALA.getValue());
            case 4:
                System.out.println("The chosen graha is : " + NavaGraha.BUDHA);
                System.out.println("Graha Number : " + NavaGraha.BUDHA.getValue());
            case 5:
                System.out.println("The chosen graha is : " + NavaGraha.BRHASPATI);
                System.out.println("Graha Number : " + NavaGraha.BRHASPATI.getValue());
            default:
                System.out.println("Invalid Graha Number");
            case 6:
                System.out.println("The chosen graha is : " + NavaGraha.SHUKRA);
                System.out.println("Graha Number : " + NavaGraha.SHUKRA.getValue());

            case 7:
                System.out.println("The chosen graha is : " + NavaGraha.SHANI);
                System.out.println("Graha Number : " + NavaGraha.SHANI.getValue());
            case 8:
                System.out.println("The chosen graha is : " + NavaGraha.RAHU);
                System.out.println("Graha Number : " + NavaGraha.RAHU.getValue());
            case 9:
                System.out.println("The chosen graha is : " + NavaGraha.KETU);
                System.out.println("Graha Number : " + NavaGraha.KETU.getValue());

        }

        System.out.println("\n**************************************************** \n");

    }

    private int getSortOrder(String firstName, final String lastName) {
        String middleName = "Patricia";
        final String suffix = "JR";
        int id = 0;
        switch (firstName) {
            case "Test":
                return 52;

/*            case middleName: // DOES NOT COMPILE
                id = 5;
                break;*/

            case suffix:
                id = 0;
                break;

/*            case lastName: // DOES NOT COMPILE
                id = 8;
                break;

            case 5: // DOES NOT COMPILE
                id = 7;
                break;

            case 'J': // DOES NOT COMPILE
                id = 10;
                break;
            case java.time.DayOfWeek.SUNDAY: // DOES NOT COMPILE
                id = 15;
                break;*/
        }
        return id;
    }
}

enum NavaGraha {

    SURYA(1, "SURYA"),
    CHANDRA(2, "CHANDRA"),
    MANGALA(3, "MANGALA"),
    BUDHA(4, "BUDHA"),
    BRHASPATI(5, "BRHASPATI"),
    SHUKRA(6, "SHUKRA"),
    SHANI(7, "SHANI"),
    RAHU(8, "RAHU"),
    KETU(9, "KETU");

    private int value;
    private String name;

    NavaGraha(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
