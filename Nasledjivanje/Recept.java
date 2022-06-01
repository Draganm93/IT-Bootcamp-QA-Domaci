package Nasledjivanje;

import java.util.ArrayList;

public class Recept {

    private String nazivRecepta;
    private int tezinaRecepta;
    private ArrayList<SastojakRecepta> sastojak;

    public Recept(String nazivRecepta, int tezinaRecepta, ArrayList<SastojakRecepta> sastojak) {
        this.nazivRecepta = nazivRecepta;
        this.tezinaRecepta = tezinaRecepta;
        this.sastojak = sastojak;
    }

    public Recept() {

        this.sastojak = new ArrayList<>();
    }

    public String getNazivRecepta() {
        return nazivRecepta;
    }

    public void setNazivRecepta(String nazivRecepta) {
        this.nazivRecepta = nazivRecepta;
    }

    public int getTezinaRecepta() {
        return tezinaRecepta;
    }

    public void setTezinaRecepta(int tezinaRecepta) {
        this.tezinaRecepta = tezinaRecepta;
    }

    public ArrayList<SastojakRecepta> getSastojak() {
        return sastojak;
    }

    public void setSastojak(ArrayList<SastojakRecepta> sastojak) {
        this.sastojak = sastojak;
    }


    public void dodajSastojak(SastojakRecepta s) {
        sastojak.add(s);


    }

    public void ukloniSastojak(SastojakRecepta s) {


        for (int i = 0; i < sastojak.size(); i++) {
            SastojakRecepta trenutni = sastojak.get(i);
            if (trenutni.getNazivSastojka().equals(s.getNazivSastojka())) {
                sastojak.remove(i);
                return;
            }
        }

    }

    public String kojaJeTezina(int tezinaRecepta) {
        String s = switch (tezinaRecepta) {
            case (1) -> "Pocetni nivo";
            case (2) -> "Lak nivo";
            case (3) -> "Srednji nivo";
            case (4) -> "Tezak nivo";
            case (5) -> "Majstorski nivo";
            default -> "Niste uneli adekvatan broj za tezinu recepta";
        };

        return s;

    }





    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Naziv Recepta: ").append(nazivRecepta).append("\n");
        sb.append("Tezina Recepta: ").append(kojaJeTezina(tezinaRecepta)).append("\n");
        sb.append("Sastojci: ").append(sastojak);
        return sb.toString();
    }
}



