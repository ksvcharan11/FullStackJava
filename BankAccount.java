public class BankAccount {
    public static void main(String[] args) {
        String account_Holder_Name = "chandra";

        long mobileNUmber = 8333905791l;

        String accountType = "Savings";

        String bankName = "HDFC";

        double accountBalance = 30000;

        double depositAmount = 20000;

        double withdrawlAmount = 10000;

        byte number_of_transactions = 0;

        double afterDeposit = depositAmount + accountBalance;
        number_of_transactions++;

        double afterWithdrawl = afterDeposit - withdrawlAmount;
        number_of_transactions++;

        int minimumBalance = 1000;

        boolean isMinimumTheshold = afterWithdrawl < minimumBalance;

        boolean isPersonValid = afterWithdrawl > minimumBalance;

        number_of_transactions++;

        System.out.println("Account holder name " +account_Holder_Name);

        System.out.println("Mobile number " +mobileNUmber);

        System.out.println("The account type " +accountType);

        System.out.println("Bank name " +bankName);
        
        System.out.println("Final Balane " +afterWithdrawl);

        System.out.println("Number of transactions " +number_of_transactions);

        System.out.println(isMinimumTheshold);

        System.out.println(isPersonValid);
    }
}
