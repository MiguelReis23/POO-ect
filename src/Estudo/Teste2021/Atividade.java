package Estudo.Teste2021;

public abstract class Atividade implements PontosdeInteresse {
    private int identificador;
    private String nome;

    public Atividade(int identificador, String nome){
        this.identificador= identificador;
        this.nome = nome;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString(){
        return "Atividade " + "[num= " + identificador + " nome= " + nome + "]" ;
    }
    

    
}


