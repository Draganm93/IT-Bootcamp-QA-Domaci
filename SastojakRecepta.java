package Nasledjivanje;

public class SastojakRecepta extends Sastojak {

    private double kolicinaSastojka;

    public SastojakRecepta(String nazivSastojka, double cenaSastojka, double kolicinaSastojka) {
        super(nazivSastojka, cenaSastojka);
        this.kolicinaSastojka = kolicinaSastojka;
    }
    public SastojakRecepta(){

    }


    public SastojakRecepta(double kolicinaSastojka) {
        this.kolicinaSastojka = kolicinaSastojka;
    }


    public double getKolicinaSastojka() {
        return kolicinaSastojka;
    }

    public void setKolicinaSastojka(double kolicinaSastojka) {
        this.kolicinaSastojka = kolicinaSastojka;
    }


    public double ukupnaCena() {
        return super.getCenaSastojka() * kolicinaSastojka;


    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getNazivSastojka());
        return sb.toString();
    }
}
