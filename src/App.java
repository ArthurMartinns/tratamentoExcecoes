import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Entre com os dados da conta: ");

        System.out.println("Número: ");
        int number = Integer.parseInt(sc.nextLine());

        System.out.println("Titular: ");
        String holder = sc.nextLine();

        System.out.println("Saldo Inicial: ");
        Double balance = Double.parseDouble(sc.nextLine());

        System.out.println("Limite de retirada: ");
        Double withdrawlimit = Double.parseDouble(sc.nextLine());

        System.out.println("Entre com o valor para retirada: ");
        Double amount = Double.parseDouble(sc.nextLine());

        Account ac = new Account(number, holder, balance, withdrawlimit);

        ac.witdraw(amount);

        System.out.println("Novo saldo: " + ac.getBalance());
    }
}
