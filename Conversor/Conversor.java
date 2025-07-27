import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        Conver meuConversor = new Conver();

        do {
            System.out.println("1 - Converter Reais para Dólares");
            System.out.println("2 - Converter Reais para Euro");
            System.out.println("3 - Converter Metros para Quilômetros");
            System.out.println("4 - Converter Metros para Centímetros");
            System.out.println("5 - Converter Metros para Milímetros");
            System.out.println("6 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            double reais, metros;

            switch (opcao) {
                case 1:
                    System.out.print("Reais R$ : ");
                    reais = sc.nextDouble();
                    System.out.printf("Convertendo Reais para Dólares: U$ %.2f%n", meuConversor.convertendoParaDolares(reais));
                    break;
                case 2:
                    System.out.print("Reais R$ : ");
                    reais = sc.nextDouble();
                    System.out.printf("Convertendo Reais para Euro: € %.2f%n", meuConversor.convertendoParaEuro(reais));
                    break;
                case 3:
                    System.out.print("Metros: ");
                    metros = sc.nextDouble();
                    System.out.printf("Convertendo Metros para Quilômetros: %.3f km%n", meuConversor.convertendoMetrosParaKm(metros));
                    break;
                case 4:
                    System.out.print("Metros: ");
                    metros = sc.nextDouble();
                    System.out.printf("Convertendo Metros para Centímetros: %.2f cm%n", meuConversor.convertendoMetrosParaCm(metros));
                    break;
                case 5:
                    System.out.print("Metros: ");
                    metros = sc.nextDouble();
                    System.out.printf("Convertendo Metros para Milímetros: %.2f mm%n", meuConversor.convertendoMetrosParaMilimetros(metros));
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 6);

        sc.close();
    }
}
