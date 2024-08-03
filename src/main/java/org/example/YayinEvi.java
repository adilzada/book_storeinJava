package org.example;

public class YayinEvi {
    private String yayineviAdi;
    private String adresi;

    public YayinEvi(String adresi, String yayineviAdi) {
        this.adresi = adresi;
        this.yayineviAdi = yayineviAdi;
    }

    public String getYayineviAdi() {
        return yayineviAdi;
    }

    public void setYayineviAdi(String yayineviAdi) {
        this.yayineviAdi = yayineviAdi;
    }

    public String getAdresi() {
        return adresi;
    }

    public void setAdresi(String adresi) {
        this.adresi = adresi;
    }

    public void yayineviMelumatlari(){
        System.out.println("yayın evinin adı: "+getYayineviAdi()+"\nyayın evinin adresi: "+getAdresi());
    }
}
