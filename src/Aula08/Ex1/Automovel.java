package Aula08.Ex1;

public abstract class Automovel extends Veiculo{
    private int NQuadro;

    public Automovel(String marca, String modelo, String matricula, int potenciaCV, int NQuadro) {
        super(marca, modelo, matricula, potenciaCV);
        this.NQuadro = NQuadro;
    }

    public int getNQuadro() {
        return NQuadro;
    }

    public void setNQuadro(int NQuadro) {
        this.NQuadro = NQuadro;
    }

    @Override
    public String toString() {
        return "Automóvel{" +
                "marca='" + getMarca() + '\n' +
                "modelo='" + getModelo() + '\n' +
                "matricula='" + getMatricula() + '\n' +
                "potenciaCV=" + getPotenciaCV() + '\n' +
                "NQuadro=" + getNQuadro() +
                '}';	
    }
}