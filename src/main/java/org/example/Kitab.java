package org.example;

public class Kitab {
    private String kitabAdi;
    private int reyting;
    private String description;
    private Yazar yazar;
    private YayinEvi yayinEvi;


    public Kitab(String kitabAdi, int reyting, String description, Yazar yazar, YayinEvi yayinEvi) {
        this.kitabAdi = kitabAdi;
        this.reyting = reyting;
        this.description = description;
        this.yazar = yazar;
        this.yayinEvi = yayinEvi;

    }

    public String getKitabAdi() {
        return kitabAdi;
    }

    public void setKitabAdi(String kitabAdi) {
        this.kitabAdi = kitabAdi;
    }

    public float getReyting() {
        return reyting;
    }

    public void setReyting(int reyting) {
        this.reyting = reyting;
    }

    public Yazar getYazar() {
        return yazar;
    }

    public void setYazar(Yazar yazar) {
        this.yazar = yazar;
    }

    public YayinEvi getYayinEvi() {
        return yayinEvi;
    }

    public void setYayinEvi(YayinEvi yayinEvi) {
        this.yayinEvi = yayinEvi;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void kitab_melumati(){
        System.out.println("kitabın adı: "+getKitabAdi()+"\nkitabın reytinqi: "+getReyting()+"\nkitabın descriptionu: "+getDescription()+"\nkitabın yazarı: "+getYazar()+"\nyayın evi: "+getYayinEvi());
    }
}
