public class main {
    public static void main(String[] args) {
        int phoneAccount = 125;
        int bonus = 100;
        int accountAdd = 1400;
        int min = 1000;
        int newBonus = accountAdd / bonus;
        int fullBalance = phoneAccount + accountAdd + newBonus;
        int balance = phoneAccount + accountAdd;
        if (accountAdd > min) {
            System.out.println(" Начисленно бонусных баллов " + newBonus);
            System.out.println(" Баланс " + fullBalance);
        } else {
            System.out.println(" Начисленно бонусных баллов " + 0);
            System.out.println(" Баланс " + balance);
        }
    }
}
