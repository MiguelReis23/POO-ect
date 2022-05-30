package Aula10.ex2;

public class ex2 {
    public static void main(String[] args) {
        Termos2 a = new Termos2();

        a.add("branco", "cor da neve", "cor das nuvens");
        a.add("verde", "cor da erva", "cor do Sporting");
        a.replace("branco", "cor do leite", "cor do quadro");
        a.add("azul", "cor do mar", "cor do ceu");
        a.add("vermelho", "cor do sangue", "cor da lava");
        a.add("amarelo", "cor do sol");
        a.remove("vermelho");
        a.removeSignificado("vermelho", "cor da lava");
        a.addSignificado("amarelo", "cor do limao");

        System.out.println(a);

        System.out.println(a.randomSignificado("branco"));


    }
}
