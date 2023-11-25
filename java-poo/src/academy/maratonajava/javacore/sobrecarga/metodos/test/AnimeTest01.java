package academy.maratonajava.javacore.sobrecarga.metodos.test;

import academy.maratonajava.javacore.sobrecarga.metodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akudama Drive" ,"TV", 12, "Ação");
        anime.imprime();
    }
}
