package academy.maratonajava.javacore.introducao.metodos.test;

import academy.maratonajava.javacore.introducao.metodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int a = 1;
        int b = 2;
        calculadora.alteraDoisNumeros(a, b);
        System.out.println("Dentro CalculadoraTest04");
        System.out.println("num1 "+a);
        System.out.println("num2 "+b);

    }
}
