public class Main {
    public static void main(String[] args) {

        int initialAccount = 46;
        int depositAmount = 1500;
        int replenishmentVariable = 100;
        int grandTotal;

        if (depositAmount > 1000) {
            grandTotal = (depositAmount / replenishmentVariable) + depositAmount + initialAccount;
            System.out.println("Итоговая сумма на счету клиента " + grandTotal);
            System.out.println("Итоговая сумма бонусов " + (depositAmount / 100));

        } else {
            grandTotal = depositAmount + 0 + initialAccount;
            System.out.println("Итоговая сумма на счету клиента " + grandTotal);
            System.out.println("Итоговая сумма бонусов " + 0);
        }
    }
}


