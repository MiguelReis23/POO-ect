package Aula08.Ex1;

public class PesadoPassageirosEletrico extends PesadoPassageiros implements VeiculoEletrico{

    private int autonomia;
    private int carga;

    public PesadoPassageirosEletrico(String marca, String modelo, String matricula, int potenciaCV, int NQuadro, int peso, int maxpassageiros, int autonomia, int carga) {
        super(marca, modelo, matricula, potenciaCV, NQuadro, peso, maxpassageiros);
        this.autonomia = autonomia;
        this.carga = carga;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public int getCarga() {
        return carga;
    }

    public void carregar(int percentagem) {
        this.carga += percentagem;
        if (this.carga > 100) {
            this.carga = 100;
        }
    }
    
    public int autonomia() {
        return this.autonomia * carga/100;
    }

    @Override
    public String toString() {
        return "PesadoPassageirosEletrico{" +
                "marca='" + getMarca() + '\n' +
                "modelo='" + getModelo() + '\n' +
                "matricula='" + getMatricula() + '\n' +
                "potenciaCV=" + getPotenciaCV() + '\n' +
                "NQuadro=" + getNQuadro() + '\n' +
                "peso=" + getPeso() + '\n' +
                "maxpassageiros=" + getMaxpassageiros() + '\n' +
                "autonomia=" + autonomia() + '\n' +
                "carga=" + getCarga() +
                '}';
    }

}