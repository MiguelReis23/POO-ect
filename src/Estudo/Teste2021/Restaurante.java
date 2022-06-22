package Estudo.Teste2021;

public class Restaurante {
    private String nome;
    private TipoComida comida;

    public Restaurante(String nome, TipoComida comida) {
        this.nome = nome;
        this.comida = comida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoComida getComida() {
        return comida;
    }

    public void setComida(TipoComida comida) {
        this.comida = comida;
    }

    @Override
    public String toString() {
        return "Restaurante [nome=" + this.getNome() + ", tipo=" + this.getComida() + "]";
    }
}
