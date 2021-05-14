public class Main {
    public static void main(String[] args) {
        int amount = 100;                       // расчеты в рублях
        int transfer = 20000;
        int totalAmount;

        if (transfer >= 1000) {
            totalAmount = (transfer / 100) + amount + transfer;
            System.out.println("Сумма Вашего счета: " + totalAmount);
            System.out.println("Сумма Ваших бонусов: " + (transfer / 100));
        } else {
            totalAmount = amount + transfer;
            System.out.println("Сумма Вашего счета: " + totalAmount);
            System.out.println("Сумма Ваших бонусов: 0 ");
        }

    }
    /*

    public static void main(String[] args) {
        int amount = 100_00;                   // расчеты в копейках
        int transfer = 1100_00;
        int totalAmount;

        if (transfer >= 1000_00) {
            totalAmount = (transfer / 100) + amount + transfer;
            System.out.println("Сумма Вашего счета: " + totalAmount);
            System.out.println("Сумма Ваших бонусов: " + (transfer / 100));
        } else {
            totalAmount = amount + transfer;
            System.out.println("Сумма Вашего счета: " + totalAmount);
            System.out.println("Сумма Ваших бонусов: 0 ");
        }

    }

    */

}
