package academy.maratonajava.javacore.introducao.classes.teste;

import academy.maratonajava.javacore.introducao.classes.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Ribeiro";
        professor.idade = 24;
        professor.sexo = 'M';

        System.out.println("Nome "+professor.nome + " Idade: "+professor.idade + " Sexo: "+professor.sexo);
    }
}
