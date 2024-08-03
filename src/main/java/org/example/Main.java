package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookOperation bookOperation=new BookOperation();
        while (true){
        System.out.println("əməliyyat seçin\n1.kitab elave et\n2.kitab sil\n3.kitab yenile\n4.butun kitablar goster\n5.sonlandir.");

        int secim=scanner.nextInt();
        if(secim==1){

            System.out.println("kitab adi daxil edin ");
            String kitabAdi=scanner.nextLine();
//            scanner.nextFloat();
            scanner.nextLine();

            System.out.println("kitab reytingi daxil edin ");
            int reyting=scanner.nextInt();
            scanner.nextLine();

            System.out.println("kitaba aciqlama daxil edin ");
            String kitabAchiqlama=scanner.nextLine();
            scanner.nextLine();

            System.out.print("yazar adi daxil edin ");
            String yazarAdi=scanner.nextLine();
            scanner.nextLine();

            System.out.print("yazarin yasini daxil edin ");
            int yazarYashi=scanner.nextInt();
            scanner.nextLine();

            System.out.println("yazarin milliyetini daxil edin ");
            String milliyet=scanner.nextLine();
            scanner.nextLine();

            System.out.print("yayin evi adini daxil edin ");
            String yayineviAdi=scanner.nextLine();
            scanner.nextLine();

            System.out.println("yayin evi adresi daxil edin");
            String adress=scanner.nextLine();
            scanner.nextLine();

            Yazar yazar=new Yazar(yazarAdi,milliyet,yazarYashi);
            YayinEvi yayinEvi=new YayinEvi(yayineviAdi,adress);

            Kitab kitab=new Kitab(kitabAdi,reyting,kitabAchiqlama,yazar,yayinEvi);

            bookOperation.kitabElaveEt(kitab);
        }else if(secim==2){
            System.out.println("silmek istediyiniz kitabi secin");
            int id=scanner.nextInt();
            scanner.nextLine();
            bookOperation.kitabSil(id);

        }else if(secim==3){
            System.out.println("silmek istediyiniz kitabi secin");
            int id=scanner.nextInt();
            scanner.nextLine();
            System.out.println("kitab adi daxil edin ");
            String kitabAdi=scanner.nextLine();
//            scanner.nextFloat();
            scanner.nextLine();

            System.out.println("kitab reytingi daxil edin ");
            int reyting=scanner.nextInt();
            scanner.nextLine();

            System.out.println("kitaba aciqlama daxil edin ");
            String kitabAchiqlama=scanner.nextLine();
            scanner.nextLine();

            System.out.print("yazar adi daxil edin ");
            String yazarAdi=scanner.nextLine();
            scanner.nextLine();

            System.out.print("yazarin yasini daxil edin ");
            int yazarYashi=scanner.nextInt();
            scanner.nextLine();

            System.out.println("yazarin milliyetini daxil edin ");
            String milliyet=scanner.nextLine();
            scanner.nextLine();

            System.out.print("yayin evi adini daxil edin ");
            String yayineviAdi=scanner.nextLine();
            scanner.nextLine();

            System.out.println("yayin evi adresi daxil edin");
            String adress=scanner.nextLine();
            scanner.nextLine();

            Yazar yazar=new Yazar(yazarAdi,milliyet,yazarYashi);
            YayinEvi yayinEvi=new YayinEvi(yayineviAdi,adress);

            Kitab kitab=new Kitab(kitabAdi,reyting,kitabAchiqlama,yazar,yayinEvi);

            bookOperation.kitabYenile(id,kitab);

        } else if (secim==4) {
bookOperation.butunKitablarGoster();

        }else if(secim==5) {
            break;
        }}

    }
}