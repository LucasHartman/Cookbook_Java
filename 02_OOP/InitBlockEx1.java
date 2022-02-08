/*
--  Initialization Block
-   They don’t have names, they
    can’t take arguments, and they don’t return anything. 
-   You can have many initialization blocks in a class
-   init blocks execute in the order in which they appear


--  Static initialization blocks
-   run ONES when the class is first loaded

--  instance initialization block
-   run EVERYTIME whenever an instance is created (a bit similar to a constructor).
-   Instance init blocks run after the constructor’s call to super().
-   

*/

public class InitBlockEx1 {

    static int x;
    int y;

    static { x=7; }
    { y=8; }

}