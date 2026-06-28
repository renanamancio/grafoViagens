public class Cidade {
    private String Cidade;
    private String Estado;

    public Cidade(String cidade, String estado) {
        Cidade = cidade;
        Estado = estado;
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
}
