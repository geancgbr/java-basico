package academy.maratonajava.javacore.polimorfismo.servico;

import academy.maratonajava.javacore.polimorfismo.repositorios.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memória");
    }

}
