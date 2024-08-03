package org.example;

import java.util.ArrayList;

public class BookOperation implements IBookOperation{
    ArrayList<Kitab> kitablar=new ArrayList<Kitab>();

    @Override
    public void kitabElaveEt(Kitab kitab) {
        kitablar.add(kitab);
    }

    @Override
    public void kitabSil(int id) {
        kitablar.remove(id);
    }

    @Override
    public void kitabYenile(int id, Kitab kitab) {
        kitablar.set(id,kitab);
    }

    @Override
    public void butunKitablarGoster() {
        if(kitablar.isEmpty()){
            System.out.println("kitab yoxdur!!!");
        }else {
            for(Kitab book:kitablar){
                book.kitab_melumati();
            }
        }

    }
}
