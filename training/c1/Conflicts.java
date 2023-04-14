package c1;

import java.util.Date;
import java.util.*; // an alternative way to import the Date class from util package
import java.sql.*;// an alternative way to import the Date class from sql package

/**
 * Note1: If we try to import the date class in the following manner:
 * import java.util.Date
 * import java.sql.Date
 *
 * - Compiler will output the following: The import java.sql.Date collides with another import statement
 *
 * Note2: If we try to import the date class in the following manner:
 * import java.util.*;
 * import java.sql.*;
 *
 * - Compiler will output the following: the type Date is ambiguous
 */

public class Conflicts {
    Date date;
}

/**
 * Sometimes it's necessary to use Date from two different packages. When this happens, it's possible to pick one
 * to use in the import and use the other's fully qualified class names (the package name, and dot, and the class name)
 * to specify that it's special.
 *
 * Or simply use the fully qualified class name for both.
 */

class Conflicts2 {

    java.util.Date utilDate;
    java.sql.Date sqlDate;
}
