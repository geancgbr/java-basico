package academy.maratonajava.javacore.interfaces.dominio;

public class FileLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando dados e um arquivo");

    }

    @Override
    public void remove() {
        System.out.println("Deletando dados de um arquivo");
    }
}
