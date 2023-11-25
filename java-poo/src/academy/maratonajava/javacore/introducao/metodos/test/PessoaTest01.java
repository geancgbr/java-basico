package academy.maratonajava.javacore.introducao.metodos.test;

import academy.maratonajava.javacore.introducao.metodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
//        pessoa.nome = "Gean"
        pessoa.setNome("Ribeiro");
        pessoa.setIdade(70);
//        pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
