package Aula10.ex1;

public class ex1 {
    public static void main(String[] args) {
        Termos a = new Termos();

        a.add("branco", "cor da neve");
        a.add("verde", "cor da erva");
        a.replace("branco", "cor das nuvens");
        a.add("azul", "cor do mar");
        a.add("vermelho", "cor do sangue");
        a.add("amarelo", "cor do sol");
        a.remove("vermelho");
        System.out.println(a);
    }
}
