package Nasledjivanje;

import java.util.ArrayList;

public class main {


    public static void main(String[] args) {

        Sastojak prvi = new Sastojak("Brasno", 4);
        Sastojak drugi = new Sastojak("Mleko",2);
        Sastojak treci = new Sastojak("Jaje", 11.5 );
        SastojakRecepta prviSastojak = new SastojakRecepta(prvi.getNazivSastojka(),prvi.getCenaSastojka(), 400);
        SastojakRecepta drugiSastojak = new SastojakRecepta(drugi.getNazivSastojka(),drugi.getCenaSastojka(), 150);
        SastojakRecepta treciSastojak = new SastojakRecepta(treci.getNazivSastojka(),treci.getCenaSastojka(), 3);

        ArrayList<SastojakRecepta> recept1 = new ArrayList<>();
        recept1.add(prviSastojak);
        recept1.add(drugiSastojak);
        recept1.add(treciSastojak);


       Recept prviRecept = new Recept("Hleb", 2,recept1);
        System.out.println(prviRecept.toString());

        prviRecept.ukloniSastojak(prviSastojak);

        System.out.println("------------");

        System.out.println(prviRecept.toString());

        System.out.println(prviSastojak.ukupnaCena());
        System.out.println(drugiSastojak.ukupnaCena());
        System.out.println(treciSastojak.ukupnaCena());





    }
}
