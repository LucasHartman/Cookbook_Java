class Mammal {

    // abstact method private
    private void eat() {}
    
    // hidden method
    protected static void drink() {}

    // method
    public Integer dance(String p) {return null; }

}

class Primate extends Mammal {
    // Method Override, with more access
    public void eat(String p) {}
}

class Monkey extends Primate {

    // method
    public static void drink () throws RuntimeException {}

    // method overloaded (differnt argument)
    public Number dance(CharSequence p) {return null; }

    // hidden method
    public int eat(String p ) {}
}