public class Main {
    public static void main(String[] args) {


        double monthlyBalance = 5000.00;
        double monthlyInterestRate = .17;
        double month1Interest = monthlyBalance * monthlyInterestRate;
        double newBalance = monthlyBalance + month1Interest;
        double month2Interest = newBalance * monthlyInterestRate;

        System.out.println("Month 1 Interest: " + month1Interest);
        System.out.println("Month 2 Interest: " + month2Interest);
    }
}
