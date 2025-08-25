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

        try {
            Account ac = new Account(number, holder, balance, withdrawlimit);

            if (ac.getWithDrawLimit() > amount) {
                if (ac.getBalance() > amount) {
                    ac.witdraw(amount);
                } else {
                    System.out.println("Erro: Valor de retirada maior do que o saldo! ");
                }
            } else {
                System.out.println("Erro: Valor deve ser menor do que o limite de retirada! ");
                sc.close();
                return;
            }

            System.out.println("Saldo: " + ac.getBalance());

        } catch (java.lang.NumberFormatException e) {
            System.out.println("Entrada inválida. ");
        }

        sc.close();
    }
}
