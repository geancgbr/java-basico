package academy.maratonajava.javacore.polimorfismo.test;

import academy.maratonajava.javacore.polimorfismo.dominio.Computador;
import academy.maratonajava.javacore.polimorfismo.dominio.Televisao;
import academy.maratonajava.javacore.polimorfismo.dominio.Tomate;
import academy.maratonajava.javacore.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10I7", 11000);
        Tomate tomate = new Tomate("Tomate siciliano", 10);
        Televisao tv = new Televisao("Samsung", 5000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("---------------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("---------------------------------------");
        CalculadoraImposto.calcularImposto(tv);
    }
}
