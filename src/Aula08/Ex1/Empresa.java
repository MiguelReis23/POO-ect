package Aula08.Ex1;

import java.util.ArrayList;

public class Empresa {
    private String nome;
    private String postal;
    private String mail;
    private ArrayList<Veiculo> veiculos;

    public Empresa(String nome, String postal, String mail) {
        this.nome = nome;
        this.postal = postal;
        Validarmail(mail);
        this.mail = mail;
        this.veiculos = new ArrayList<>();
    }

    private void Validarmail(String mail) {
        if (!mail.contains("@")) {
            throw new IllegalArgumentException("Email inválido");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        Validarmail(mail);
        this.mail = mail;
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void addVeiculo(Veiculo veiculo) {
        this.veiculos.add(veiculo);
    }

    public void AddVeiculos(Veiculo... veiculos) {
        for (Veiculo veiculo : veiculos) {
            this.addVeiculo(veiculo);
        }
    }

    public void RemoveVeiculo(Veiculo veiculo) {
        this.veiculos.remove(veiculo);
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nome='" + nome + '\n' +
                "postal='" + postal + '\n' +
                "mail='" + mail + '\n' +
                "veiculos=" + veiculos +
                '}';
    }
}
