import javax.swing.text.NumberFormatter;
import java.util.Scanner;
import java.text.NumberFormat;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Get user input for Principal (p)
        System.out.print("Principal: ");

        //Store Principal (p)
        int principal = scanner.nextInt();

        //Get user input for Annual Interest Rate (r)
        System.out.print("Annual Interest Rate: ");

        //Store Annual Interest Rate (r)
        float interest = scanner.nextFloat();
        float interestPct = interest / 100;
        float interestMonth = interestPct / 12;

        //Get user input for Principal (p)
        System.out.print("Period (Years): ");

        //Store Principal (p)
        byte period = scanner.nextByte();

        // r(1+r) power n
        double lineOne = interestMonth * (Math.pow(1 + interestMonth, period * 12));

        // (l+r) power n - 1
        double lineTwo = Math.pow((1 + interestMonth), period * 12) - 1;

        // Full Calculation
        double mortgage = principal * (lineOne / lineTwo);

        // Initiate Number Formatter
        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        //Print Mortgage
        System.out.println("Mortgage: " + formatter.format(mortgage));

    }
}