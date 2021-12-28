class SimpleCalc {

    public int value;
    
    public void calculate() { 
        value += 6; 
    }
}



public class extendsEx2 extends SimpleCalc {

    // overload
    public void calculate() { 
        value -= 4; 
    }

    // overload
    public void calculate(int multiplier) {
        calculate();            //         -4   (childs method)
        super.calculate();      // -4+6=    2   (parent method)
        value *=multiplier;     // 2*2=     4
    }



    public static void main(String[] args) {
        extendsEx2 calculator = new extendsEx2();
        calculator.calculate(2);
        System.out.println("Value is: " +calculator.value); // 8
    }
}