public class Main {
    public static void main(String[] args) {
        int bonus = 1;
        int score = 100;
        int put = 1100;

        int limit = 1000;
        if (put > limit) {
            bonus = put/100;
        } else {
            bonus = 0;
        }
        int sum = score + put;
        System.out.println(sum);
        System.out.println(bonus);
    }
}
