public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int topUp = 1100;
        int bonus;

        if (topUp>1000){
            bonus = topUp / 100;
        } else {
            bonus = 0;
        }

        System.out.println("Бонусные рубли: " + bonus);
        System.out.println("Итоговый счет: " + (balance + topUp + bonus));

    }
}