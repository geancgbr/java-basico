package academy.maratonajava.javacore.Jmodificadorfinal.test;

import academy.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import academy.maratonajava.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Carlos");
        System.out.println(carro.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Gean");
        ferrari.imprime();
    }
}
