public class Roupas {
    String tamanho;
    String tipo;

    boolean Novo;
    boolean importada;

    public Roupas(String tamanho, String tipo, boolean Novo, boolean importada) {
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.Novo = Novo;
        this.importada = importada;
    }

    @Override
    public String toString() {
        return "Roupas{" +
                "tamanho='" + tamanho + '\'' +
                ", tipo='" + tipo + '\'' +
                ", Novo=" + Novo +
                ", importada=" + importada +
                '}';
    }
}
