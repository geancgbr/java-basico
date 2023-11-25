package academy.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float, double 0
        // char '\000' ' '
        // boolean false
        // String null

        String [] nomes = new String[3];
        nomes[0] = "Gean";
        nomes[1] = "Carlos";
        nomes[2] = "Silva";

        for (int i = 0; i < 3; i++) {
            System.out.println(nomes[i]);
        }

    }
}
