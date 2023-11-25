package academy.maratonajava.javacore.heranca.test;

import academy.maratonajava.javacore.heranca.dominio.Funcionario;

public class HerancaTest02 {
    // 0 - Bloco de inicialização da super classe é executado quando a JVM carregar a classe pai.
    // 1 - Bloco de inicialização da subclasse é executado quando a JVM carregar a classe filha.
    // 2 - Alocado espaço em memória pro objeto da super classe.
    // 3 - Cada atributo de super classe pai é criado e inicializado com valores default ou que for passado.
    // 4 - Bloco de inicialização da super classe é executado na ordem em que aparece.
    // 5 - Construtor é executado da super classe.

    // 6 - Alocado espaço em memória pro objeto da sub classe.
    // 7 - Cada atributo da sub classe pai é criado e inicializado com valores default ou que for passado.
    // 8 - Bloco de inicialização da subclasse é executado na ordem em que aparece.
    // 9 - Construtor é executado da subclasse.
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Gean");
    }
}
