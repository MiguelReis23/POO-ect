package Aula13.Ex1;



public class Taxi extends AutomovelLigeiro {
    private int NLicenca;

    public Taxi(String marca, String modelo, String matricula, int potenciaCV, int NQuadro, int capacidade, int NLicenca) {
        super(marca, modelo, matricula, potenciaCV, NQuadro, capacidade);
        this.NLicenca = NLicenca;
    }

    public int getNLicenca() {
        return NLicenca;
    }

    public void setLicenca(int NLicenca){
        this.NLicenca = NLicenca;
    }
}
