package com.company;
//http://www.oguzozkeroglu.com/kuyruk-veri-yapisi-java/

import java.util.ArrayList;

public class Kuyruk {

    private int toplamElamanSayisi = 0;
    private ArrayList<Kisi> kisiler = new ArrayList<>();


    public ArrayList<Kisi> getKisiler() {
        return kisiler;
    }

    public Kisi getKisi(int i) {

        return kisiler.get(i);
    }

    public void setKisiler(Kisi kisi) {
        this.kisiler.add(kisi);
    }

    public int getToplamElamanSayisi() {
        return kisiler.size();
    }

    void ekle(int kisiSayisi, int gidilecekKat) {

      //  this.toplamElamanSayisi += kisiSayisi;
        for (int k = 0; k < kisiSayisi; k++) {


            Kisi kisi = new Kisi();
            this.setKisiler(kisi);
            kisi.setGidilecekKat(gidilecekKat);
            //avm.setAsansorBilgi(asansorBilgi);
        }

    }

    void cikar(int kisiSayisi) {
        //eleman sayısı sıfır olunca aynı kalacak bir şey olmayacak


    }

}

