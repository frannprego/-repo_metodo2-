import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Billetes de 100: ");
            double billetes100 = scanner.nextDouble();
            System.out.print("Billetes de 20: ");
            double billetes20 = scanner.nextDouble();
            System.out.print("Billetes de 5: ");
            double billetes5 = scanner.nextDouble();
            System.out.print("Monedas de 1 euro: ");
            double monedas1 = scanner.nextDouble();
                double billetes100_en_euros = billetes100 * 100;
                double billetes20_en_euros = billetes20 * 20;
                double billetes5_en_euros = billetes5 * 5;
                double cantidad_en_euros = billetes100_en_euros + billetes20_en_euros + billetes5_en_euros + monedas1;
        System.out.println("Cantidad en euros: " + cantidad_en_euros);
        scanner.close();
    }
}