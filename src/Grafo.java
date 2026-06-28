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

    public void addVertex(String label) {
        adjVertices.putIfAbsent(new Vertex(label), new ArrayList<>());
    }

    public void removeVertex(String label) {
        Vertex v = new Vertex(label);
        adjVertices.values().stream().forEach(e -> e.remove(v));
        adjVertices.remove(new Vertex(label));
    }
}
