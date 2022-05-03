package Aula06.ex1;

import Aula05.Ex1.Date;

public class Bolseiro extends Aluno {

    private float valorBolsa;

    public Bolseiro(String iNome, int cc, Date iDataNasc, float iValorBolsa) {
        super(iNome,cc,iDataNasc);
        this.valorBolsa = iValorBolsa;
    }

    public float getBolsa() {
        return valorBolsa;
    }

    public void setBolsa(float valorBolsa) {
        this.valorBolsa = valorBolsa;
    }

    @Override
    public String toString() {
        return  " Valor da Bolsa: " + valorBolsa+ "}";
    }
    
}
