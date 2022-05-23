package Aula08.Ex1;

public class Motociclo extends Veiculo {

    private String tipo;

    public Motociclo(String marca, String modelo, String matricula, int potenciaCV, String tipo) {
        super(marca, modelo, matricula, potenciaCV);
        validarTipo(tipo);
        this.tipo = tipo;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
        }
        
    private void validarTipo(String tipo){
        if(!tipo.toLowerCase().equals("desportivo") || tipo.toLowerCase().equals("estrada")){
            throw new IllegalArgumentException("Tipo deve ser \"desportivo\" ou \"estrada\"");
        }
        
    }

    @Override
    public String toString() {
        return "Motociclo{" +
                "marca=" + getMarca() + '\n' +
                "modelo='" + getModelo() + '\n' +
                "matricula='" + getMatricula() + '\n' +
                "potenciaCV=" + getPotenciaCV() + '\n' +
                "tipo='" + getTipo() + '\n' +
                '}';
    }

}

