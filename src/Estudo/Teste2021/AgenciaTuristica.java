package Estudo.Teste2021;

import java.util.*;

public class AgenciaTuristica {
    private String nome;
    private String endereço;
    private Set<Atividade> atividades= new HashSet<>() ;
     

    public AgenciaTuristica(String nome, String endereço) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public Atividade[] atividades() {
        List<Atividade> activities = new ArrayList<>();

        for (Atividade atividade : atividades) {
            activities.add(atividade);
        }

        return activities.toArray(new Atividade[atividades.size()]);
    }



    public void add(Atividade atividade ){
            this.atividades.add(atividade);
    }
    public void setAtividades(Set<Atividade> atividades) {
        this.atividades = atividades;
    }

    public int totalItems(){
        int i = 0;

        for (Atividade ativ : atividades) {
            i += ativ.locais().size();
        }

        return i;
    }

    public String[] getAllItems(){
        List<String> locais = new ArrayList<>();
        for (Atividade at: atividades){
            locais.addAll(at.locais());
        }

        return locais.toArray(new String[locais.size()]);
    }
    
    @Override 
    public String toString(){
        return "Agencia Turistica " + nome + "\n" + "Atividades: " + atividades;
    }
    
    @Override
    public boolean equals(Object obj){
        if (this==obj) return true;
        if (obj==null) return false;
        if (getClass()!=obj.getClass()) return false;

        Atividade atividade=    (Atividade) obj;

        return this.nome.equals(atividade.getNome());
    }
}
