package kemia;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

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
        
        // 5. feladat
        
        Scanner scn = new Scanner(System.in);
        boolean jo = false;
        
        do {
            
            System.out.print("Kérek egy vegyjelet: ");
            String bevitel = scn.nextLine();
            
            if(bevitel.length() <= 2 && !bevitel.isEmpty()){
                for (Elem elem : elemek) {
                    if(elem.getVegyjel().toLowerCase(Locale.ITALY).equals(bevitel.toLowerCase())){
                        System.out.println(elem.toString());
                        jo = true;
                    }
                }
            }
        } while (!jo);
    }
}
