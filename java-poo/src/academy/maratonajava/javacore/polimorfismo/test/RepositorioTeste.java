package academy.maratonajava.javacore.polimorfismo.test;

import academy.maratonajava.javacore.polimorfismo.repositorios.Repositorio;
import academy.maratonajava.javacore.polimorfismo.servico.RepositorioMemoria;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTeste {
    public static void main(String[] args) {
     Repositorio repositorio = new RepositorioMemoria();
     repositorio.salvar();
        List<String> list = new ArrayList<>();
        list.add("Goku");
        list.add("Vegeta");
        list.add("Kuririn");
        System.out.println(list);
    }
}
