/*
--  Covariant Returns
-   change the return type in the overriding method as long as the new return type is a subtype of the
    declared return type of the overridden (superclass) method.

*/

class Alpha {

    Alpha doStuff(char c) {
        return new Alpha();
    }
}



class Beta extedns Alpha {

    @Override
    Beta doStuff(char c) { // different type, but legel override
        return new Beta();  // different return type
    }
}