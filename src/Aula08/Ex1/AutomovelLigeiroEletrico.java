package Aula08.Ex1;

public class AutomovelLigeiroEletrico extends AutomovelLigeiro implements VeiculoEletrico{
    private int carga= 100;
    private int autonomia;    
    
    public AutomovelLigeiroEletrico(String marca, String modelo, String matricula, int potenciaCV, int NQuadro, int capacidade, int autonomia, int carga) {
        super(marca, modelo, matricula, potenciaCV, NQuadro, capacidade);
        this.autonomia = autonomia;
        this.carga = carga;
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
    public String toString(){
        return "AutomovelLigeiroEletrico{" +
                "marca='" + getMarca() + '\n' +
                "modelo='" + getModelo() + '\n' +
                "matricula='" + getMatricula() + '\n' +
                "potenciaCV=" + getPotenciaCV() + '\n' +
                "NQuadro=" + getNQuadro() + '\n' +
                "capacidade=" + getCapacidade() + '\n' +
                "autonomia=" + autonomia() + '\n' +
                "carga=" + getCarga() +
                '}';
    }

}
