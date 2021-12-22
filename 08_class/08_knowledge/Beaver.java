
 class Rodent {
    public Rodent(var x) {} // cant have var in parameter and not return type
    protected static Integer chew() throws Exception {
        System.out.println("Rodent is chewing");
        return 1;
    }
}

class Beaver extends Rodent { 

    public Number chew() throws RuntimeException { // can't override static, cant have rutnimeException
        
        System.out.println("Beaver is chewing on wood");
        return 2;
    }
}