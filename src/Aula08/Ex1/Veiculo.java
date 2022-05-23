package Aula08.Ex1;

public abstract class Veiculo implements KmPercorridosInterface {
    private String marca;
    private String modelo;
    private String matricula;
    private int potenciaCV;


    private int ultimoTrajeto=0;
    private int distanciaTotal=0;

    public Veiculo(String marca, String modelo, String matricula, int potenciaCV) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.potenciaCV = potenciaCV;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public int getUltimoTrajeto() {
        return ultimoTrajeto;
    }

    public void trajeto(int quilometros) {
        this.ultimoTrajeto = quilometros;
        this.distanciaTotal += quilometros;
    }

    public int ultimoTrajeto() {
        return this.ultimoTrajeto;
    }

    public int distanciaTotal() {
        return this.distanciaTotal;
    }

    @Override
    public String toString(){
        return "Marca: " + this.marca + "\nModelo: " + this.modelo + "\nMatricula: " + this.matricula + "\nPotencia CV: " + this.potenciaCV;
    }
    
}
