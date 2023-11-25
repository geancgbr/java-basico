package academy.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Comprador {
    String nome;

    @Override
    public String toString() {
        return "Cmprador{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
