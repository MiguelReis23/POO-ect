package Aula06.ex1;

import Aula05.Ex1.Date;


public class Pessoa {
    
private String nome;
private int cc;
private Date dataNasc;


public Pessoa(String nome, int cc, Date dataNasc) {
    this.nome = nome;
    this.cc = cc;
    this.dataNasc = dataNasc;
}

public String getName() {
    return nome;
}

public void SetName(String nome) {
    this.nome = nome;
}

public int getCC(){
    return cc;

}
public void setCC(int cc){
    this.cc = cc;
}

public Date getDataNasc(){
    return dataNasc;    
}

public void setDataNasc(Date dataNasc){
    this.dataNasc = dataNasc;

}

@Override
public String toString(){
    return nome + "; CC: " + cc + "; Data de Nascimento: " + dataNasc;
}




}







