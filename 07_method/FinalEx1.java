/*
--  final class (immutable class)
-   Final Class in Java can not be inherited & can not be extended by other classes.
-   A final class can extend other classes; It can be a subclass but not a superclass.


--  final method
-   it cannot be overridden
-   The main intention of making a method final would be that the content 
    of the method should not be changed by any outsider


-- final variable
-    final variable cannot be reassigned.
-   A final variable can be explicitly initialized only once.


-- static final variable initialization
    private static final String monday;
-   The declaration of monday does not compile, because the value of a static final vari-
    able must be set when it is declared or in a static initialization block.
*/


public final class FinalEx1 {

    public final static int finish(int score) {
        final int win = 3;
        
        int result = score++ < 5 ? 2 : win;
        
        return result+=win;
    }

    public static void main(final String[] v) {
        System.out.print(finish(Integer.parseInt(v[0])));
    }
}