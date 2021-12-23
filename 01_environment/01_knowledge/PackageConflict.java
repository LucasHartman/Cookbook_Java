import java.sql.Date;

/**
 * import statement ===============================================================================
 * tell JAva which packages to look in for classes
 * Example:
 *      import java.util.Random;
 *      import java.package.class;
 * 
 * Package names are hierarchical 
 * If it begins with java or javax, this means it came with the JDK
 * 
 * If it comes from somewhere else, it like a wibsite name in reverse
 * 
 *      com.amazon.java.package.class
 * 
 * This package comes from amazon.com
 * 
 * 
 * Wildcards ======================================================================================
 * Classes in the same package are often imported together. 
 * 
 *      import java.util.*;
 * 
 *  It doesn’t import child packages, fields, or methods; it imports only classes.
 * 
 * 
 * 
 * 
 * 
 * Naming Conflicts (Chaper 01)
 * - One of the reasons for using packages is so that class names don’t have to be unique across all of Java.
 * - When the class is found in multiple packages, Java gives you a compiler error
 * - If You Really Need to Use Two Classes with the Same Name
 * -  you can pick one to use in the import
 *    and use the other’s fully qualified class name [the package name, a
 *    period (.), and the class name] to specify that it’s special. 
 * 
 */

public class PackageConflict {

    public static void main(String[] args) {
        
        //  fully qualified class name
        java.util.Date utilDate=new java.util.Date();  
        System.out.println("util Data        : " + utilDate);

        // Date by import
        long now = System.currentTimeMillis();
        Date sqlDate = new Date(now);
        System.out.println("Sql Date         : " + sqlDate.getTime());

    }
    
}
