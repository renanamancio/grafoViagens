import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Grafo {
        private Map<Cidade,, List<Cidade>> adjVertices;

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

    public void adicionarRota(Cidade cidadeOrigem, Cidade cidadeDestino){

    }

    public void listarCidades() {
    }

    public boolean existeRota(Cidade cidadeOrigem, Cidade cidadeDestino) {
    }
}
