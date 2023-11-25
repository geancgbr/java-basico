package academy.maratonajava.javacore.interfaces.test;

import academy.maratonajava.javacore.interfaces.dominio.DatabaseLoader;
import academy.maratonajava.javacore.interfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        
    }
}
