package com.company;

public class Kat {

    private int KisiSayisi;
    private int KuyruktakiKisi;


    private Kuyruk kuyruk = new Kuyruk();

    public int getKisiSayisi() {
        return KisiSayisi;
    }

    public void setKisiSayisi(int kisiSayisi) {
        KisiSayisi += kisiSayisi;
    }

    public void kisiSayisiAzaltma(int kisiSayisi) {

        if (kisiSayisi == 0) {
            KisiSayisi -= kisiSayisi;

        }
    }

    public Kuyruk getKuyruk() {
        return kuyruk;
    }

    public void setKuyruk(Kuyruk kuyruk) {
        this.kuyruk = kuyruk;
    }

    public int getKuyruktakiKisi() {
        return KuyruktakiKisi;
    }

    public void setKuyruktakiKisi(int kuyruktakiKisi) {
        KuyruktakiKisi = kuyruktakiKisi;
    }
}
