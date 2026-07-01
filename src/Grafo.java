import java.util.*;

public class Grafo {
    private List<Cidade> vertices;

    public Grafo() {
        this.vertices = new ArrayList<>();
    }

    public void adicionarCidade(Cidade cidade) {
        vertices.add(cidade);
    }

    //adicionar rota para os dois lados.
    public void adicionarRota(String cidadeOrigem, String cidadeDestino){
        Cidade origem = null;
        Cidade destino = null;

        for (Cidade cidade : vertices) {
            if (cidade.getCidade().equalsIgnoreCase(cidadeOrigem)) {
                origem = cidade;
            }
            if (cidade.getCidade().equalsIgnoreCase(cidadeDestino)) {
                destino = cidade;
            }
        }

        if (origem != null && destino != null) {
            origem.adicionarRota(destino);
            destino.adicionarRota(origem);
            
            System.out.println("Rota Adicionada");


        }else{
            System.out.println("Erro");
        }
    }

    public void listarCidades() {
        System.out.println("Lista de Cidades:");
        System.out.println();
        adjVertices.forEach((key, value) -> {
            String msg = key + ": " + value;
            System.out.println(msg);
        });
    }

    public boolean existeRota(String cidadeOrigem, String cidadeDestino) {

        Cidade origem = null;
        Cidade destino = null;

        for (Cidade cidade : adjVertices.keySet()) {
            if (cidade.getCidade().equalsIgnoreCase(cidadeOrigem)) {
                origem = cidade;
            }
            if (cidade.getCidade().equalsIgnoreCase(cidadeDestino)) {
                destino = cidade;
            }
        }
        Stack<Cidade> stack = new Stack<Cidade>();

        stack.push(origem);

        while (!stack.isEmpty()) {
            String vertex = stack.pop();
            if (!visited.contains(vertex)) {
                visited.add(vertex);
                for (Vertex v : graph.getAdjVertices(vertex)) {
                    stack.push(v.label);
                }
            }
        }

        return true;
    }
}
