public class Stalas {
    private String pavadinimas;
    private double svoris;
    private String pagaminimoMedziaga;
    private int kojuSkaicius;
    private double kaina;

    public Stalas() {}

    public Stalas(String pavadinimas, double svoris, String pagaminimoMedziaga, int kojuSkaicius, double kaina) {
        this.pavadinimas = pavadinimas;
        this.svoris = svoris;
        this.pagaminimoMedziaga = pagaminimoMedziaga;
        this.kojuSkaicius = kojuSkaicius;
        this.kaina = kaina;
    }
    public void gautiInformacijaApieStala(){
        System.out.println("" +
                "Pavadinimas: "      + this.pavadinimas        + "    \n"+
                "Svoris: "           + this.svoris             + " KG \n"+
                "Medziagos: "        + this.pagaminimoMedziaga + "    \n"+
                "Koju skaicius: "    + this.kojuSkaicius       + "    \n"+
                "Kaina: "            + this.kaina              + " EUR\n");
    }


    public void setPavadinimas(String newPavadinimas) {
        this.pavadinimas = newPavadinimas;
    }

    public void setSvoris(double newSvoris) {
        this.svoris = newSvoris;
    }

    public void setPagaminimoMedziaga(String newMedziaga) {
        this.pagaminimoMedziaga = newMedziaga;

    }

    public void setKojuSkaicius(int newKojuSkaicius) {
        this.kojuSkaicius = newKojuSkaicius;

    }

    public void setKaina(double newKaina) {
        this.kaina = newKaina;

    }

    public String getPavadinimas() {
        return this.pavadinimas;

    }

    public double getSvoris() {
        return this.svoris;

    }

    public String getPagaminimoMedziaga() {
        return this.pagaminimoMedziaga;

    }

    public int getKojuSkaicius() {
        return this.kojuSkaicius;

    }

    public double getKaina() {
        return this.kaina;

    }
}

/*
    1. Sukurti klasę Stalas su kintamaisiais:
        pavadinimas;
        svoris;
        pagaminimoMedziaga;
        kojuSkaicius;
        kaina.

    Sukurti konstruktorius, get'erius ir set'erius.
 */