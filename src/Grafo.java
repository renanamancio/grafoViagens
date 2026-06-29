import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Grafo {
        private Map<Cidade, List<Cidade>> adjVertices;

    public Grafo(Map<Cidade, List<Cidade>> adjVertices) {
        this.adjVertices = adjVertices;
    }

    public Map<Cidade, List<Cidade>> getAdjVertices() {
        return adjVertices;
    }

    public void setAdjVertices(Map<Cidade, List<Cidade>> adjVertices) {
        this.adjVertices = adjVertices;
    }

    public void adicionarCidade(Cidade cidade) {
    }

    public void adicionarRota(String cidadeOrigem, String cidadeDestino){
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

        if (origem != null && destino != null) {
            adjVertices.get(origem).add(destino);
            adjVertices.get(destino).add(origem);
            System.out.println("Rota Adicionada");
        }else{
            System.out.println("Erro");
        }
    }

    public void listarCidades() {
    }

    public boolean existeRota(String cidadeOrigem, String cidadeDestino) {
        return true;
    }
}
