package Aula06.ex1;

import java.time.LocalDate;

import Aula05.Ex1.Date;

public class Aluno extends Pessoa {
    private static int nmecinitial = 100;
    private final int nmec;
    private Date dataInsc;

    public Aluno(String iNome, int iCC, Date iDataNasc, Date iDataInsc) {
        super(iNome, iCC, iDataNasc);
        this.nmec = nmecinitial++;
        this.dataInsc = iDataInsc;
    }

    public Aluno(String iNome, int iBI, Date iDataNasc) {
        super(iNome, iBI, iDataNasc);
        this.nmec = nmecinitial++;
        this.dataInsc = getCurrentDate();
    }

    public int getNMec() {
        return nmec;
    }

    public Date getdataInsc() {
        return dataInsc;

    }

    public void setdataInsc(Date dataInsc) {
        this.dataInsc = dataInsc;
    }

    @Override
    public String toString() {
        return  " nMec: " + nmec + "; Data de Inscrição: " + dataInsc+ "}";
    }


    private Date getCurrentDate() {
        LocalDate localDate = LocalDate.now();
        return new Date(localDate.getDayOfMonth(), localDate.getMonthValue(), localDate.getYear());
    }
}
