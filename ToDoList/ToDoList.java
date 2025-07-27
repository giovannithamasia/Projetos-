import java.util.Scanner;

public class ToDoList{
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int opcao ;


        do {
            System.out.println("1 - Adicionar tarefas");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Remover tarefas");
            System.out.println("0 - Sair");
            System.out.print("Informe a opcao: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Informe a tarefa para adicionar: ");
                    String tarefa = sc.nextLine();
                    System.out.println(ListaTarefas.adicionarTarefas(tarefa));
                    break;

                case 2:
                    ListaTarefas.listar();
                    break;

                case 3:
                    System.out.print("Informe a tarefa a remover: ");
                    String tarefaremover = sc.nextLine();
                    System.out.println(ListaTarefas.removerTarefa(tarefaremover));
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);



            sc.close();
        }
    }
