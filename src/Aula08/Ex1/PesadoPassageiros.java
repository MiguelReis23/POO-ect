package Aula08.Ex1;

public class PesadoPassageiros extends Automovel {
    private int peso;
    private int maxpassageiros;

    public PesadoPassageiros(String marca, String modelo, String matricula, int potenciaCV, int NQuadro, int peso, int maxpassageiros) {
        super(marca, modelo, matricula, potenciaCV, NQuadro);
        this.peso = peso;
        this.maxpassageiros = maxpassageiros;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getMaxpassageiros() {
        return maxpassageiros;
    }

    public void setMaxpassageiros(int maxpassageiros) {
        this.maxpassageiros = maxpassageiros;
    }

    @Override
    public String toString() {
        return "PesadoPassageiros{" +
                "marca='" + getMarca() + '\n' +
                "modelo='" + getModelo() + '\n' +
                "matricula='" + getMatricula() + '\n' +
                "potenciaCV=" + getPotenciaCV() + '\n' +
                "NQuadro=" + getNQuadro() + '\n' +
                "peso=" + getPeso() + '\n' +
                "maxpassageiros=" + getMaxpassageiros() +
                '}';
    }
    
}
