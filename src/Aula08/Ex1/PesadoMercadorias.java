package Aula08.Ex1;

public  class PesadoMercadorias extends Automovel{
    private int peso;
    private int maxcarga;

    public PesadoMercadorias(String marca, String modelo, String matricula, int potenciaCV, int NQuadro, int peso, int maxcarga) {
        super(marca, modelo, matricula, potenciaCV, NQuadro);
        this.peso = peso;
        this.maxcarga = maxcarga;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getMaxcarga() {
        return maxcarga;
    }

    public void setMaxcarga(int maxcarga) {
        this.maxcarga = maxcarga;
    }

    @Override
    public String toString() {
        return "PesadoMercadorias{" +
                "marca='" + getMarca() + '\n' +
                "modelo='" + getModelo() + '\n' +
                "matricula='" + getMatricula() + '\n' +
                "potenciaCV=" + getPotenciaCV() + '\n' +
                "NQuadro=" + getNQuadro() + '\n' +
                "peso=" + getPeso() + '\n' +
                "maxcarga=" + getMaxcarga() +
                '}';
    }
    
}
