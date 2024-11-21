public class gitryhma8 {
    public static void main(String[] args) {
        // Olion luominen
        Henkilo henkilo1 = new Henkilo("Mika", 30);
        Henkilo henkilo2 = new Henkilo();
        Henkilo henkilo3 = new Henkilo();
        Henkilo henkilo4 = new Henkilo();

        henkilo1.tervetuloa();
        henkilo2.tervetuloa();
        henkilo3.tervetuloa();
        henkilo4.tervetuloa();
    }
}


class Henkilo {
private String nimi;
private int ika;

public Henkilo(String nimi, int ika) {
    this.nimi = nimi;
    this.ika = ika;
}

public String getNimi() {
    return nimi;
}

public void setNimi(String nimi) {
    this.nimi = nimi;
}

public int getIka() {
    return ika;
}

public void setIka(int ika) {
    this.ika = ika;
}

public void tervetuloa() {
    System.out.println("Hei, olen " + nimi + " ja olen " + ika + " vuotta vanha.");
}
}
