public class Main {
    public static void main(String[] args) {

        Stalas FRIDNAS = new Stalas("FRIDNÄS", 16.71, "Plaušų plokštė", 4, 99);
        FRIDNAS.setKaina(122.2);
        FRIDNAS.gautiInformacijaApieStala();

        // Objekto sukurimas
        // Moksleivio klases objekto sukurimas
        System.out.println("Pirmoji pazintis su Objektiniu programavimu");
        Moksleivis moksleivis = new Moksleivis();
        // Kadangi sukureme objekta pagal konstruktoriu be parametru reikia
        // atskirai priskirti pozymius
        moksleivis.setId(1);
        moksleivis.setVardas("Jonas");
        moksleivis.setPavarde("Petrauksas");
        moksleivis.setGrupe("Linux");

        // Objekto sukurimas naudojant konstruktoriu su parametrais
        Moksleivis moksleivis1 = new Moksleivis("Lina", "Petronele", "Linux");
        moksleivis1.gautiInformacijaApieMokini();
        System.out.println(moksleivis.getVardas() + " istojo i " + moksleivis.getGrupe() + " grupe, taciau pasimokes suprato, kad nori mokytis .NET");
        System.out.println("Dabar " + moksleivis.getVardas() + " mokinasi .NET grupeje.");

        //Zmogaus objektas
        //String lytis, long asmensKodas, String vardas, String pavarde, int amzius,double svoris, double ugis,String plaukuSpalva)
        Zmogus zmogus = new Zmogus();
        zmogus.setVardas("Arnas");
        zmogus.setPavarde("Baravykas");
        zmogus.setAmzius(22);
        zmogus.setLytis("Vyras");
        zmogus.setSvoris(88.2);
        zmogus.setUgis(1.90);
        zmogus.setPlaukuSpalva("Juodi");

        Zmogus zmogus2 = new Zmogus("Vyras",39206111432L,"Petras","Slidzius",30,86.3,190.0,"Rudi");
        Zmogus zmogus3 = new Zmogus("Moteris",61206121466L,"Ona","Butke",53,70.1,175,"Raudoni" );
        Zmogus zmogus4 = new Zmogus("Delfinas",4562061231466L,"Rodis","Radzis",70,95,190,"Ryzi");
        Zmogus zmogus5 = new Zmogus("Bahuras",61206121466L,"Tomas","Nesvarbu",18,60,150,"Juodi" );

        Istorija istorijaApieZmogus2 = new Istorija();
        istorijaApieZmogus2.istorija(zmogus2.getAsmensKodas(),zmogus2.getVardas(),zmogus2.getPavarde(),zmogus2.getAmzius(),zmogus2.getLytis(),zmogus2.getSvoris(),zmogus2.getUgis(),zmogus2.getPlaukuSpalva());

    }
}
