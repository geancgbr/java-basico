package academy.maratonajava.javacore.enumeracao.test;

import academy.maratonajava.javacore.enumeracao.dominio.Cliente;
import academy.maratonajava.javacore.enumeracao.dominio.TipoCliente;

public class ClienteTest02 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Gean", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Ribeiro", TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente1);
        System.out.println(cliente2);

    }
}
