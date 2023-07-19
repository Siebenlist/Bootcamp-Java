import java.util.Random;

public class BankAccount {
    private String accId;
    private double accSaldo;
    private double ahorrosSaldo;
    private static int accCount = 0;

    public BankAccount(double saldo, double ahorros) {
        this.accId = generateId();
        this.accSaldo = saldo;
        this.ahorrosSaldo = ahorros;
        accCount++;
    }

    public BankAccount() {
        this.accId = generateId();
    }

    public void setId(String accId) {
        this.accId = accId;
    }

    public String getId() {
        return accId;
    }

    public void setSaldo(double accSaldo) {
        this.accSaldo = accSaldo;
    }

    public double getSaldo() {
        return accSaldo;
    }

    public void setAhorros(double ahorrosSaldo) {
        this.ahorrosSaldo = ahorrosSaldo;
    }

    public double getAhorros() {
        return ahorrosSaldo;
    }

    public static int peopleCount() {
        return accCount;
    }

    private static String generateId() {
        Random random = new Random();
        StringBuilder accId = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            accId.append(random.nextInt(10));
        }

        return accId.toString();
    }

    public void deposit(double amount, String accountType) {
        if (accountType.equalsIgnoreCase("corriente")) {
            accSaldo += amount;
            System.out.println("Se ha depositado $" + amount + " en la cuenta corriente. Tu saldo actual es de " + accSaldo);
        } else if (accountType.equalsIgnoreCase("ahorros")) {
            ahorrosSaldo += amount;
            System.out.println("Se ha depositado $" + amount + " en la cuenta de ahorros. Tu saldo actual es de " + ahorrosSaldo);
        } else {
            System.out.println("Tipo de cuenta inválido. Por favor, elija 'corriente' o 'ahorros'.");
        }
    }

    public void withdrawal(double amount, String accountType) {
        if (accountType.equalsIgnoreCase("corriente") && amount <= accSaldo) {
            accSaldo -= amount;
            System.out.println("Has retirado $" + amount + " de la cuenta corriente. Tu saldo actual es de " + accSaldo);
        } else if (accountType.equalsIgnoreCase("ahorros") && amount <= ahorrosSaldo) {
            ahorrosSaldo -= amount;
            System.out.println("Has retirado $" + amount + " de la cuenta de ahorros. Tu saldo actual es de " + ahorrosSaldo);
        } else {
            System.out.println("Tipo de cuenta inválido o fondos insuficientes. Por favor, elija 'corriente' o 'ahorros' y corrobore tener fondos suficientes.");
        }
    }

    public void checkBalance() {
        System.out.println("Tu saldo actual en la cuenta corriente es de $" + accSaldo);
        System.out.println("Tu saldo actual en la cuenta de ahorros es de $" + ahorrosSaldo);
    }
}