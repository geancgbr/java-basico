package academy.maratonajava.javacore.introducao.metodos.test;

import academy.maratonajava.javacore.introducao.metodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando CalculadoraTest01");
        calculadora.subtraiDousNumeros();
    }
}
