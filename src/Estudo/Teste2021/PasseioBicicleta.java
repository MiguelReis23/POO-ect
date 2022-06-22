package Estudo.Teste2021;


import java.util.*;

public class PasseioBicicleta extends Atividade {
    private Set<String> locais= new TreeSet<>();

    public PasseioBicicleta(int numero, String nome) {
        super(numero, nome);
    }

    public PasseioBicicleta(int numero, String nome, String[] locais){
        super(numero, nome);
        for (String local : locais) {
            this.locais.add(local);
        }
    }
    
    public Collection<String> locais() {

        return locais;
    }

    public void addLocal(String local){
        locais.add(local);
    }

    

    

}
