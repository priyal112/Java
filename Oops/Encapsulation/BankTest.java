public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.setAccountNumber(98679876);
        bank.deposit(-10);
        bank.withdraw(10);
        bank.deposit(100);
        bank.withdraw(20);
        System.out.println(bank.getBalance());

    }
}
