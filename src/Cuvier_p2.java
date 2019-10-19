public class Cuvier_p2 {
    public static float annualInterestRate;

    private double savingsBalance;

    public Cuvier_p2() {
        this.savingsBalance = 0d;
    }

    public Cuvier_p2(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public void calculateMonthlyInterest() {
        double monthlyInterest = this.savingsBalance * annualInterestRate / 100 / 12d;
        System.out.printf("Calculated Monthly Interest: $%.2f%n", monthlyInterest);
        this.savingsBalance += monthlyInterest;
    }

    //updates static annualInterestRate field;
    public static void modifyInterestRate(float newInterestRatePercent) {
        annualInterestRate = newInterestRatePercent;
        System.out.printf("Annual Interest Rate set to: %.2f%%%n", newInterestRatePercent);
    }

    /**
     * @return the savingsBalance
     */
    public double getSavingsBalance() {
        return savingsBalance;
    }

    /**
     * @param savingsBalance the savingsBalance to set
     */
    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public static void main(String[] args) {
        //initial values
        double saver1StartBal = 2000.00d;
        double saver2StartBal = 3000.00d;

        System.out.println("\nMonth 1:\n========");
        Cuvier_p2.modifyInterestRate(4.00f);
        System.out.printf("Starting Balance >> Saver1: $%.2f%n", saver1StartBal);
        Cuvier_p2 saver1 = new Cuvier_p2(saver1StartBal);
        saver1.calculateMonthlyInterest();
        System.out.printf("Ending Balance after 1 Month >> Saver1: $%.2f%n%n", saver1.getSavingsBalance());
        System.out.printf("Starting Balance >> Saver2: %.2f%n", saver2StartBal);
        Cuvier_p2 saver2 = new Cuvier_p2(saver2StartBal);
        saver2.calculateMonthlyInterest();
        System.out.printf("Ending Balance after 1 Month >> Saver2: $%.2f%n%n", saver2.getSavingsBalance());

        System.out.println("\nMonth 2:\n========");
        Cuvier_p2.modifyInterestRate(5.00f);
        System.out.printf("Starting Balance >> Saver1: $%.2f%n", saver1.getSavingsBalance());
        saver1.calculateMonthlyInterest();
        System.out.printf("Ending Balance after 1 Month >> Saver1: $%.2f%n%n", saver1.getSavingsBalance());
        System.out.printf("Starting Balance >> Saver2: $%.2f%n", saver2.getSavingsBalance());
        saver2.calculateMonthlyInterest();
        System.out.printf("Ending Balance after 1 Month >> Saver2: $%.2f%n%n", saver2.getSavingsBalance());
    }
}