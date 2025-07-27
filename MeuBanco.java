import java.util.Scanner;

public class MeuBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao ;

        double saldo =0;

        SistemaBancario meusistema = new SistemaBancario(saldo);


        do {
            System.out.println("1 - Depositar ");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver saldo");
            System.out.println("4 - Sair");
            System.out.println("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();


            switch (opcao) {
                case 1:
                    System.out.println("Informe seu deposito R$ : ");
                    double deposito = sc.nextDouble();
                    System.out.println("Deposito realizado R$ "+meusistema.deposito(deposito));
                    break;
                case 2:
                    System.out.println("Informe o valor do seu saque R$: ");
                    double saque = sc.nextDouble();
                    System.out.println(meusistema.saque(saque));
                    break;
                case 3:
                    System.out.println("Saldo atual R$ : " + meusistema.versaldo());
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao Invalida!");


            }

        }while(opcao!=4);



        sc.close();
    }
}