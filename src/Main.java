public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println(service.calculate(1_000_000, 12));
        System.out.println(service.calculate(1_000_000, 2 * 12));
        System.out.println(service.calculate(1_000_000, 3 * 12));
    }
}
