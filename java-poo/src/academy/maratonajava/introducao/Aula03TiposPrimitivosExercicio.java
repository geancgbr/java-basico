package academy.maratonajava.introducao;
/*
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>
confirmo que recebi o salário de <salario>, na data <data>
 */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Gean";
        String endereco = "Estrada do pau ferro";
        double salario = 5431.12;
        String dataRecebimentoSalario = "10/11/2023";
        String relatorio = "Eu " +nome+" morando no endereço "+endereco+" confirmo que recebi o salário de "+salario+", na data "+dataRecebimentoSalario;
        System.out.println(relatorio);

    }
}
