package kemia;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
<<<<<<< HEAD
import java.util.Locale;
=======
import java.util.Map;
>>>>>>> e6fe19d1b53184ecc0296173cb470b60cd576d3a
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
<<<<<<< HEAD
        
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
=======
        System.out.println("Elemek száma: " + elemek.size());
      
        System.out.println("5.Feladat");
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérek egy vegyjelet: ");
       String beker = sc.nextLine();
        System.out.println("Bekért vegyjel: " + beker);

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
   
/*
 
        //4.feladat
        
        int mennyi = 0;
        
        for (elemek elem : kemelemek) {
            if(elem.getEv() == 0){
            mennyi++;
            }
        }
         System.out.println("4. feladat Felfedezése kszáma az ókorban: " + mennyi);
         
         
        
         //7.feladat
         
         int maxev = 0;
       
         
         for (int i = 0; i < kemelemek.size()-1; i++) {
             if(kemelemek.get(i).getEv() != 0){
   
            int kulonbseg = kemelemek.get(i+1).getEv() - kemelemek.get(i).getEv();
             if(kulonbseg > maxev){
             maxev = kulonbseg;
             }
            }
        }
            System.out.println("7. feladat: " +maxev + " év volt a leghosszabb időszak két elem felfedezése között.");

*/


    
>>>>>>> e6fe19d1b53184ecc0296173cb470b60cd576d3a
}
