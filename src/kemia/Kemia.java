package kemia;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Kemia {

    public static void main(String[] args) throws IOException {
        
        List<String> sorok = Files.readAllLines(Paths.get("felfedezesek.csv"));
        ArrayList<Elem> elemek = new ArrayList<>();
        int i = 0;
        for (String sor : sorok) {
            
            String[] adatok = sor.split(";");
            if (i>0){
                elemek.add(new Elem(adatok[0], adatok[1], adatok[2], adatok[3], adatok[4]));
            }
            i++;
        }
    }
    
}
