public class Main {
    public static void main(String[] args) {

        int initialAccount = 35;
        int depositAmount = 1000;
        int y = 100;
        int x;

        if (depositAmount > 1000) {
            x = (depositAmount / y) + depositAmount + initialAccount;
            System.out.println("Итоговая сумма на счету клиента " + x);
            System.out.println("Итоговая сумма бонусов " + (depositAmount / 100));

        } else {
            x = depositAmount + 0 + initialAccount;
            System.out.println("Итоговая сумма на счету клиента " + x);
            System.out.println("Итоговая сумма бонусов " + 0);
        }
    }
}


