package academy.maratonajava.javacore.associacao.test;

import academy.maratonajava.javacore.associacao.dominio.Escola;
import academy.maratonajava.javacore.associacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 =  new Professor("Jiraya Sensei");
        Professor professor2 =  new Professor("Kakashi Sensei");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Konoha", professores);

        escola.imprime();
    }
}
