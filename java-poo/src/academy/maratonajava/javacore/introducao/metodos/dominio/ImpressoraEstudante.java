package academy.maratonajava.javacore.introducao.metodos.dominio;

public class ImpressoraEstudante {

    public void imprime(Estudante estudante){
        System.out.println("--------------");


        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);
        estudante.nome = "Gohan";

    }
}
