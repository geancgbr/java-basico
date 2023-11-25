package academy.maratonajava.javacore.heranca.test;

import academy.maratonajava.javacore.heranca.dominio.Endereco;
import academy.maratonajava.javacore.heranca.dominio.Funcionario;
import academy.maratonajava.javacore.heranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");
        Pessoa pessoa = new Pessoa("Gean");
        pessoa.setCpf("12345678");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Carlos");
        funcionario.setCpf("1234567890");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2000);
        System.out.println("--------------");
        funcionario.imprime();

    }
}
