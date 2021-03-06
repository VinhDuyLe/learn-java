import java.util.Scanner;

public class operations {
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip = tip_percent * meal_cost / 100;
        double tax = tax_percent * meal_cost / 100;
        double total_cost = meal_cost + tip + tax;
        System.out.println(Math.round(total_cost));
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Scanner scanner = new Scanner(System.in);

        double meal_cost = scanner.nextDouble();
        scanner.skip("(\\r\\n|[\\n\\r\\u2028\\u2029\\u0085])?");
        int tip_percent = scanner.nextInt();
        scanner.skip("(\\r\\n|[\\n\\r\\u2028\\u2029\\u0085])?");
        int tax_percent = scanner.nextInt();
        scanner.skip("(\\r\\n|[\\n\\r\\u2028\\u2029\\u0085])?");
        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }

}