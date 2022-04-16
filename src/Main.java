import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputPrice = new Scanner(System.in);
        Scanner inputAcc = new Scanner(System.in);
        Scanner inputTax = new Scanner(System.in);
        System.out.println("What is your area sales tax in decimal form?");
        double salesTax = Double.valueOf(inputTax.nextLine());
        System.out.println("What is the item's price?");
        double price = Double.valueOf(inputPrice.next());
        double accPrice = 0;
        int upgradeSupportCharge = 30;
        double totalTax = (accPrice + price) * salesTax;
        double total = price + totalTax;
        double monthlyPayments = price / 24;
        double roundTax = Math.round(totalTax * 100.00) / 100.00;
        double roundTotal = Math.round(total * 100.00) / 100.00;
        double roundMonthlyPayments = Math.round(monthlyPayments * 100.00) / 100.00;
        double totalToday = roundTax + upgradeSupportCharge;
        if (price <= 200.00) {
            System.out.println("The price of the accessories is: " + "$" + price);
            System.out.println("The sales tax is: " + "$" + roundTax);
            System.out.println("Your total is: " + "$" + roundTotal);
            System.exit(0);
        }
        System.out.println("Are there accessories?");
        String answer = String.valueOf(inputAcc.nextLine());
        String yes = "Yes";
        String no = "No";
        if (answer.equals(yes)) {
            Scanner inputAccPrice = new Scanner(System.in);
            System.out.println("What is the combined price of the accessories?");
            accPrice = Double.parseDouble(inputAccPrice.nextLine());
            System.out.println("The price of the item is: " + "$" + price);
            System.out.println("The price of the accessories is: " + "$" + accPrice);
            System.out.println("The sales tax is: " + "$" + roundTax);
            System.out.println("Upgrade Support Charge: " + "$" + upgradeSupportCharge);
            System.out.println("Your total today is " + "$" + (totalToday + accPrice));
            System.out.println("Your total is: " + "$" + (roundTotal + upgradeSupportCharge));
            System.out.println("Your monthly payment is " + "$" + roundMonthlyPayments);
        }
        else {
            System.out.println("The price of the item is: " + "$" + price);
            System.out.println("The sales tax is: " + "$" + roundTax);
            System.out.println("Upgrade Support Charge: " + "$" + upgradeSupportCharge);
            System.out.println("Your total today is " + "$" + totalToday);
            System.out.println("Your total is: " + "$" + (roundTotal + upgradeSupportCharge));
            System.out.println("Your monthly payment is " + "$" + roundMonthlyPayments);
        }

    }
}