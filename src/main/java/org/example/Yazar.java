package org.example;

public class Yazar {
    private String yazarinAdi;
    private String milliyeti;
    private int yazarinYashi;

    public Yazar(String yazarinAdi, String milliyeti, int yazarinYashi) {
        this.yazarinAdi = yazarinAdi;
        this.milliyeti = milliyeti;
        this.yazarinYashi = yazarinYashi;
    }

    public String getYazarinAdi() {
        return yazarinAdi;
    }

    public void setYazarinAdi(String yazarinAdi) {
        this.yazarinAdi = yazarinAdi;
    }

    public String getMilliyeti() {
        return milliyeti;
    }

    public void setMilliyeti(String milliyeti) {
        this.milliyeti = milliyeti;
    }

    public int getYazarinYashi() {
        return yazarinYashi;
    }

    public void setYazarinYashi(int yazarinYashi) {
        this.yazarinYashi = yazarinYashi;
    }

    public void yazarMelumatlari(){
        System.out.println("yazarın adı: "+ getYazarinAdi()+"\nyazarın yaşı: "+getYazarinYashi()+"\nyazarın milliyəti: "+getMilliyeti() );

    }
}
