package academy.maratonajava.javacore.polimorfismo.servico;

import academy.maratonajava.javacore.polimorfismo.repositorios.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo");
    }
}
