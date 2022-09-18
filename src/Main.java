public class Main {
    public static void main(String[] args) {

        int startBalance = 100;
        int bonus = 100;
        int deposit = 1001;

        if (deposit > 1000) {
            int newBalance = startBalance + deposit + deposit / bonus;
            System.out.println("Ваш баланс: " + newBalance + " р, в том числе бонус: " + deposit / bonus + " р");
        } else {
            int newBalance = startBalance + deposit;
            System.out.println("Ваш баланс: " + newBalance + " р, бонусов нет.");
        }

    }
}