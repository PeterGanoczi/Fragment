package sk.itsovy.ganoczi.fragment;

public class Bank {

    private String name;

    public Bank(String name) {
        this.name = name;
    }

    public double convert(double amount, String code) {


        switch (code) {
            case "TRY":
                System.out.println(amount * 6.47+ " TRY");
            break;
            case "HUF":
                System.out.println(amount * 330.20+" HUF");
            break;
            case "CHF":
                System.out.println(amount * 1.10+" CHF");
            break;
            case "HRK":
                System.out.println(amount * 7.44+" HRK");
            break;
            case "GBP":
                System.out.println(amount * 0.86 + " GBP");
            break;
            default:
                System.out.println(-1);
        }
        return -1;

    }

    public static double loan(double value, double interest, int months) {
        double totalInterest = (value / 100) * interest;
        double totalPaymentWithInterest = value + totalInterest;

        double paymentForMonth = totalPaymentWithInterest / months;

        int error = -1;
        if (value <= 0 || interest <= 0 || months <= 0 || months > 420) {
            return error;
        } else {
            return paymentForMonth;
        }

    }
}
