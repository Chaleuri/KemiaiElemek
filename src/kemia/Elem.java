package kemia;

public class Elem {
    
    private String ev, elem, vegyjel,felfedezo;
    private int rendszam;

    public Elem(String ev, String elem, String vegyjel, String rendszam, String felfedezo) {
        this.ev = ev;
        this.elem = elem;
        this.vegyjel = vegyjel;
        this.felfedezo = felfedezo;
        this.rendszam = Integer.parseInt(rendszam);
    }

    public String getEv() {
        return ev;
    }

    public String getElem() {
        return elem;
    }

    public String getVegyjel() {
        return vegyjel;
    }

    public String getFelfedezo() {
        return felfedezo;
    }

    public int getRendszam() {
        return rendszam;
    }

    @Override
    public String toString() {
        return "Az elem vegyjele: " + vegyjel + "\nAz elem neve: " + elem + "\nRendszáma: " + rendszam + "\nFelfedezés éve: " + ev + "\nFelfedező: " + felfedezo;
    }
    
    
    
}
