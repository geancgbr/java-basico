package academy.maratonajava.javacore.classes.abstratas.test;

import academy.maratonajava.javacore.classes.abstratas.dominio.Desenvolvedor;
import academy.maratonajava.javacore.classes.abstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Gean", 10000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
    }
}
