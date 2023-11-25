package academy.maratonajava.javacore.blocos.inicializacao.test;

import academy.maratonajava.javacore.blocos.inicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece");

        for (int episodio : anime.getEpisodios()){
            System.out.print(episodio + " ");
        }

    }
}
