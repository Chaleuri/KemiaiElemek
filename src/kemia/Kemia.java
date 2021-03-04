package kemia;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Kemia {

    public static void main(String[] args) throws IOException {
        
        List<String> beolvasott = Files.readAllLines(Paths.get("felfedezesek.csv"));
        
    }
    
}
