import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;
        do{
            System.out.println(" 1 - Soma ");
            System.out.println(" 2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println(" 5  - Sair");
            System.out.println("informe a opcao:");
            opcao = sc.nextInt();
            sc.nextLine();
            if (opcao >= 1 && opcao <= 4){
                System.out.println("informe um numero: ");
                double n1 = sc.nextDouble();

                System.out.println("Informe outro numero: ");
                double n2 = sc.nextDouble();

                switch (opcao) {
                    case 1:
                        System.out.println("Soma igual: "+Calc.somarNumeros(n1,n2));
                        break;
                    case 2:
                        System.out.println("Subtracao igual "+Calc.subtrairNumeros(n1,n2));
                        break;
                    case 3:
                        System.out.println("Multiplicacao igual: "+Calc.multiplicarNumeros(n1,n2));
                        break;
                    case 4:
                        System.out.println("Divisao igual: "+Calc.dividirNumeros(n1,n2));
                        break;
                    case 5:
                        System.out.println("Saindo");
                        break;
                    default:
                        System.out.println("Opção Invalida!");

                }


            }
        }while (opcao!=5);




         sc.close();
        }
    }
