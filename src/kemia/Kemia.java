package kemia;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        System.out.println("Elemek száma: " + elemek.size());
        
        
         HashMap<String, Integer> hs = new HashMap<>();
         
        for (Elem elem : elemek) {
           String kulcs = elem.getEv();
            if (!hs.containsKey(kulcs)) {
                hs.put(kulcs, 1);
            } else {
                int szam = hs.get(kulcs);
                hs.put(kulcs, szam + 1);
            }
            
            
        }
           for (Map.Entry<String, Integer> entry : hs.entrySet()) {
                String key = entry.getKey();
                
                Integer value = entry.getValue();
                if (value>=3) {
                     System.out.printf("Év: %s szám: %d \n", key,value);
               }
                 
            }
    }
   
    
}
