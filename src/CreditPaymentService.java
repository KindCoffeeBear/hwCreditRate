public class CreditPaymentService {
    public int calculate(int credit, int timeMonth) {
        double creditRateYear = 9.99; // годовая процентная ставка
        double creditRateMonth = 9.99 / 100 / 12; // месячная процентная ставка
        double payment = credit * (creditRateMonth * Math.pow(1 + creditRateMonth, timeMonth) / (Math.pow(1 + creditRateMonth, timeMonth) - 1));
        return (int) payment;
    }
}
