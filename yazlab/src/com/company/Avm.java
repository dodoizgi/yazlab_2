package com.company;

import java.util.ArrayList;

public class Avm {


    private ArrayList<Asansor> asansorler = new ArrayList<>();
    private ArrayList<Kat> katlar = new ArrayList<>();
    private ArrayList<AsansorBilgi> asansorBilgileri;
    private ArrayList<Kisi> kisiler = new ArrayList<>();
    private int cikacakKisi;

    public int getCikacakKisi() {
        return cikacakKisi;
    }

    public void setCikacakKisi(int cikacakKisi) {
        this.cikacakKisi = cikacakKisi;
    }

    public ArrayList<AsansorBilgi> getAsansorBilgileri() {
        return asansorBilgileri;
    }

    public void setAsansorBilgileri(ArrayList<AsansorBilgi> asansorBilgileri) {
        this.asansorBilgileri = asansorBilgileri;
    }

    public ArrayList<Kisi> getKisiler() {
        return kisiler;
    }

    public void setKisiler(Kisi kisi) {

        setKisiler(kisi);
    }

    public Avm() {

        Kat kat0 = new Kat();
        Kat kat1 = new Kat();
        Kat kat2 = new Kat();
        Kat kat3 = new Kat();
        Kat kat4 = new Kat();
        katlar.add(kat0);
        katlar.add(kat1);
        katlar.add(kat2);
        katlar.add(kat3);
        katlar.add(kat4);
    }

    public ArrayList<Kat> getKatlar() {
        return katlar;

    }

    public void setKatlar(ArrayList<Kat> katlar) {
        this.katlar = katlar;
    }

    public ArrayList<Asansor> getAsansorler() {
        return asansorler;
    }

    public void setAsansorler(ArrayList<Asansor> asansorler) {
        this.asansorler = asansorler;
    }

}
