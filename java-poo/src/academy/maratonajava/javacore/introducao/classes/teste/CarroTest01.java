package academy.maratonajava.javacore.introducao.classes.teste;

import academy.maratonajava.javacore.introducao.classes.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.modelo = "Sport";
        carro1.nome = "Fusca";
        carro1.ano = 1969;

        carro2.nome = "Mustang";
        carro2.modelo = "GT 500";
        carro2.ano = 1968;

        carro1 = carro2;

        System.out.println("Carro 1");
        System.out.println(carro1.modelo);
        System.out.println(carro1.nome);
        System.out.println(carro1.ano);

        System.out.println("\nCarro 2");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
