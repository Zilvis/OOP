import java.util.Random;
public class Moksleivis {

    //1. klases kintamieji (pozymiai, argumentai, laukeliai);
    private int    id;
    private  String vardas;
    private  String pavarde;
    private String grupe;

    //2. Konstruktorius(-iai)

    //Konstruktorius be parametru (Jeigu nesukuriam nei vieno konstruktoriaus sis sukuriamas pagal nutylejima).
    public Moksleivis() {}

    //Konstruktorius su visais parametrais (Visi parametrai nurdomi isskyrus ID kuris yra sugeneruojamas)
    public Moksleivis(String vardas, String pavarde, String grupe) {
        this.id      =  randomId();
        this.vardas  =  vardas;
        this.pavarde =  pavarde;
        this.grupe   =  grupe;
    }
    /**
     * Metodas kuris grazina be parametru
     * @return id
     */
    public int getId() {
        return this.id;
    }

    /**
     * Metodas kuris nieko negrazina ir yra su parametru (Nes norime tik pakeisti informacija)
     * @param newId perduodam id reiksme
     */
    public void setId (int newId){
        this.id = newId;
    }

    public String getVardas () {
        return vardas;
    }

    public void setVardas (String newVardas) {
        this.vardas = newVardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde (String newPavarde) {
        this.pavarde = newPavarde;
    }

    public void setGrupe(String newGrupe) {
        this.grupe = newGrupe;
    }

    public String getGrupe(){
        return grupe;
    }


    public void gautiInformacijaApieMokini(){
        System.out.println("" +
                "Mokinio ID: "      + id     + "\n"+
                "Mokinio vardas: "  + vardas + "\n"+
                "Mokinio pavarde: " + pavarde+ "\n"+
                "Mokinio grupe: "   + grupe  + "\n");
    }

    private int randomId(){
        Random random = new Random();
        int randomId = random.nextInt(1000);
        return randomId;
    }

}
/*
    1. Sukurti klasę Moksleivis su kintamaisiais:
    id,vardas,pavarde,grupe.
    Sukurti get'erius, set'erius, konstruktorių ir 5 objektus.
    Pabandyti pakeisti kiekvieno objekto požymius (pvz. grupę, vardą, pavardę).
 */