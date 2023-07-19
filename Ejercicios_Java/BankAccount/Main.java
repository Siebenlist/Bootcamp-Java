public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(0.0, 0.0);
        BankAccount account2 = new BankAccount(0.0, 0.0);
        System.out.println(account1.getId());
        System.out.println(account2.getId());
        System.out.println(BankAccount.peopleCount());
        account1.deposit(10.0, "corriente");
        account1.deposit(20.0, "ahorros");
        account1.withdrawal(5.0, "corriente");
        account2.deposit(30.0, "corriente");
        account2.deposit(40.0, "ahorros");
        account1.checkBalance();
        account2.checkBalance();
    }
}