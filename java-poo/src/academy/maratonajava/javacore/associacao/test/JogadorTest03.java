package academy.maratonajava.javacore.associacao.test;

import academy.maratonajava.javacore.associacao.dominio.Jogador;
import academy.maratonajava.javacore.associacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafe");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador};

        jogador.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");

        jogador.imprime();

        System.out.println("--- Time ---");
        time.imprime();
    }
}
