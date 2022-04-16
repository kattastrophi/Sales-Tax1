import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputPrice = new Scanner(System.in);
        Scanner inputAcc = new Scanner(System.in);
        System.out.println("What is the item's price?");
        double price = Double.valueOf(inputPrice.next());
        double accPrice = 0;
        int upgradeSupportCharge = 30;
        double salesTax = 0.06;
        double totalTax = (accPrice + price) * salesTax;
        double total = price + totalTax;
        double monthlyPayments = price / 24;
        double round1 = Math.round(totalTax * 100.00) / 100.00;
        double round2 = Math.round(total * 100.00) / 100.00;
        double round3 = Math.round(monthlyPayments * 100.00) / 100.00;
        double totalToday = round1 + upgradeSupportCharge;
        if (price <= 200.00) {
            System.out.println("The price of the accessories is: " + "$" + price);
            System.out.println("The sales tax is: " + "$" + round1);
            System.out.println("Your total is: " + "$" + round2);
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
            System.out.println("The sales tax is: " + "$" + round1);
            System.out.println("Upgrade Support Charge: " + "$" + upgradeSupportCharge);
            System.out.println("Your total today is " + "$" + (totalToday + accPrice));
            System.out.println("Your total is: " + "$" + (round2 + upgradeSupportCharge));
            System.out.println("Your monthly payment is " + "$" + round3);
        }
        else {
            System.out.println("The price of the item is: " + "$" + price);
            System.out.println("The sales tax is: " + "$" + round1);
            System.out.println("Upgrade Support Charge: " + "$" + upgradeSupportCharge);
            System.out.println("Your total today is " + "$" + totalToday);
            System.out.println("Your total is: " + "$" + (round2 + upgradeSupportCharge));
            System.out.println("Your monthly payment is " + "$" + round3);
        }

    }
}