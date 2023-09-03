public class Main {
    public static void main(String[] args) {
        int ticket = 23570; // стоимость билета
        int bonus = 20; // стоимость мили
        System.out.println("При покупке авиабилета начисляются мили. При покупке одного билета начисляется:");
        System.out.println((ticket / bonus) + " милей");
    }
}