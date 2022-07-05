public class Main {
    public static void main(String[] args) {
        int deposit = 500;
        int put = 2000;
        int bonus;
        if (put > 1000) {
            bonus = put / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Итоговый счет:" + (deposit + put));
        System.out.println("Бонусные рубли:" + bonus);
    }
}
