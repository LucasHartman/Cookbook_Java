
class ElectricAccount {

    private double kWh;
    private double rate = 0.07;
    private double bill;

    public void addKwh(double kWh) {
        if (kWh > 0) {
            this.kWh += kWh;
            this.bill = this.kWh * this.rate;

            System.out.println("\nKwh: " +kWh +"\nrate: " +rate +"\nbill: " +bill);
        }
    }
}


public class thisEx2 {
    public static void main(String[] args) {
        
        ElectricAccount acct = new ElectricAccount();
        acct.addKwh(99);
    }
}
