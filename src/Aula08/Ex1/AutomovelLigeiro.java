package Aula08.Ex1;

public class AutomovelLigeiro extends Automovel {
    private int capacidade;

    public AutomovelLigeiro(String marca, String modelo, String matricula, int potenciaCV, int NQuadro, int capacidade) {
        super(marca, modelo, matricula, potenciaCV, NQuadro);
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "AutomóvelLigeiro{" +
                "marca='" + getMarca() + '\n' +
                "modelo='" + getModelo() + '\n' +
                "matricula='" + getMatricula() + '\n' +
                "potenciaCV=" + getPotenciaCV() + '\n' +
                "NQuadro=" + getNQuadro() + '\n' +
                "capacidade=" + getCapacidade() +
                '}';
    }
}
