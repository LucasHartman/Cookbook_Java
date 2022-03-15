public class StaticVSInstanceEx1 {

    int instanceVar;
    static int classVar;
    static final int finalStaticVar;

    static {finalStaticVar=3;}

    StaticVSInstanceEx1(int instanceVar) {
        this.instanceVar = instanceVar; 
    }

    void instanceMethod() { 
        System.out.println("instanceMethod prints class variable:        " +classVar);
        System.out.println("instanceMethod prints final static variable: " +finalStaticVar); }

    public static void main(String[] args) {

        StaticVSInstanceEx1 ref = new StaticVSInstanceEx1(1);
        classVar = 2;

        System.out.println("instance variable:      " +ref.instanceVar);
        System.out.println("class variable:         " +classVar);
        System.out.println("static final variable:  " +finalStaticVar);

        ref.instanceMethod();



        
        
    }
    
}