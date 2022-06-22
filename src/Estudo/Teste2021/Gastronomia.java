package Estudo.Teste2021;

import java.util.ArrayList;
import java.util.Collection;

import java.util.List;

public class Gastronomia extends Atividade {
    private List<Restaurante> locais= new ArrayList<>();

    public Gastronomia(int numero, String nome) {
        super(numero, nome);
    }

    public Gastronomia(int numero, String nome,List<Restaurante> restaurantes) {
        super(numero, nome);
        for(Restaurante restaurante: restaurantes){
            locais.add(restaurante);
        }
    }

    public Collection<String> locais() {
        List<String> list = new ArrayList<>();

        for (Restaurante local : locais) {
            list.add(local.toString());
        }

        return list;
    }

    public List<Restaurante> getLista(){
        return locais;
    }

    public int totalRestaurantes(){
        return locais.size();
    }

    public void add(Restaurante restaurante){
        locais.add(restaurante);
    }
}