package academy.maratonajava.javacore.polimorfismo.servico;

import academy.maratonajava.javacore.polimorfismo.repositorios.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados");
    }
}
