public class CalculateEmi_ScorpioVehicle {

    public static void main(String args[])
    {
        String carCompany = "Mahindra Scorpio";

        float rating = 4.7f;

        short reviews = 1000;

        String description = "The Scorpio is one of Mahindra's oldest nameplates in India";

        double onRoadPrice = 2190887;

        double downPayment = 380000;

        float bankInterestRate = 9.50f;

        byte loanPeriod = 4;

        double p_loanAmount = onRoadPrice - downPayment;

        double r_monthlyInterestRate = bankInterestRate / (12*100);

        int n_monthlyInstallments = loanPeriod * 12;

        double base = 1 + r_monthlyInterestRate;

        int exponent = n_monthlyInstallments;

        double result = Math.pow(base, exponent);

        double Emi = (p_loanAmount )* (r_monthlyInterestRate) * result/ (result-1);

        double totalLoanAmount = p_loanAmount;

        double totalPayable = Emi * n_monthlyInstallments;

        System.out.println(carCompany);
        System.out.println(rating);
        System.out.println(reviews);
        System.out.println(description);
        System.out.println("Calculate EMI of Mahindra Scorpio");
        System.out.println("On-road price: " +(int)onRoadPrice);
        System.out.println("Down payment: " +(int)downPayment);
        System.out.println(("Bank Interest rate: " +bankInterestRate ));
        System.out.println("Loan period: " +loanPeriod);
        System.out.println("Total loan amount: " +(int)totalLoanAmount);
        System.out.println("Payable amount:  " +(int)totalPayable);
        System.out.println("EMI per month: " +(int)Emi);
    }
}