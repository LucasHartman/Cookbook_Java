class public MethodChainEx1 {

    /*
    --  Method Chain
    -   chain of methods being called one after another.
    -   Each method in chaining returns an object.
    -   It violates the need of intermediate variables.

        obj.method1().method2().method3();  
    */

    private int id;      
    private String name;  
    private int age;  
    private int std;
    


    public MethodChainEx1 setId(int id) {  
        this.id = id;  
        return this;  
    }

    public MethodChainEx1 setName(String name) {  
        this.name = name;  
        return this;  
    }

    public MethodChainEx1 setAge(int age) {  
        this.age = age;  
        return this;  
    }

    public MethodChainEx1 setStd(int std) {  
        this.std = std;  
        return this;  
    }

    public void detail() {  
        System.out.println("Student Detail is:\n");  
        System.out.println("Id: "+id+ "\nName: "+name+"\nAge: "+age+ "\nStandard: "+std);  
    }  



    public static void main(String[] args) {

        MethodChainEx1 student = new MethodChainEx1();  

        //method chaining  
        student.setId(1183).setName("Herry Tangri").setAge(17).setStd(9).detail();  
    }
}