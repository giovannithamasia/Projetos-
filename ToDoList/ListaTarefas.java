import java.util.ArrayList;

public class ListaTarefas {
    static ArrayList<String> lista = new ArrayList<>();

    ListaTarefas() {
    }

    public static String adicionarTarefas(String tarefa) {
        lista.add(tarefa);
        return tarefa + " adicionada com sucesso.";
    }

    public static void listar() {
        if (lista.isEmpty()) {
            System.out.println("Nenhum item adicionado na lista.");
        } else {
            System.out.println("Tarefas cadastradas:");
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(i + " - " + lista.get(i));
            }
        }
    }

    public static String removerTarefa(String tarefa) {
        int indice = lista.indexOf(tarefa);
        if (indice != -1) {
            lista.remove(indice);
            return tarefa + " tarefa removida com sucesso";
        } else {
            return "Tarefa não encontrada.";
        }
    }
}

