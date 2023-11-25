package academy.maratonajava.javacore.polimorfismo.test;

import academy.maratonajava.javacore.polimorfismo.dominio.Computador;
import academy.maratonajava.javacore.polimorfismo.dominio.Produto;
import academy.maratonajava.javacore.polimorfismo.dominio.Tomate;
import academy.maratonajava.javacore.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);

        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("11/12/2021");

        CalculadoraImposto.calcularImposto(tomate);

    }
}
