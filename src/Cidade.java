import java.util.ArrayList;
import java.util.List;

public class Cidade {
    private String Cidade;
    private String Estado;
    private List<Cidade> adj;//cidades vizinhas

    public Cidade(String cidade, String estado) {
        Cidade = cidade;
        Estado = estado;
        this.adj = new ArrayList<>();
    }


    public void adicionarRota(Cidade cidade){
        this.adj.add(cidade);//adicionar uma rota para cidade vizinha a partir da cidade origem
    }


    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public List<Cidade> getAdj() {
        return adj;
    }

    public void setAdj(List<Cidade> adj) {
        this.adj = adj;
    }
}
