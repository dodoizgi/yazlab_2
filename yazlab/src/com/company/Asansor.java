package com.company;
//https://ufukuzun.wordpress.com/2015/02/14/javada-multithreading-bolum-1-merhaba-thread/

import java.util.ArrayList;

public class Asansor extends Thread {


    private Avm avm;
    private ArrayList<AsansorBilgi> asansorBilgileri = new ArrayList<>();
    private int kapasite = 10;
    private ArrayList<Kisi> kisiler = new ArrayList<>();
    private boolean calismaDurumu = false;
    private int olduguKat;
    private int gidecegiKat;
    private boolean yon;

    public int getGidecegiKat() {
        return gidecegiKat;
    }

    public void setGidecegiKat(int gidecegiKat) {
        this.gidecegiKat = gidecegiKat;
    }

    public boolean isYon() {
        return yon;
    }

    public void setYon(boolean yon) {
        this.yon = yon;
    }

    public int getOlduguKat() {
        return olduguKat;
    }

    public void setOlduguKat(int olduguKat) {
        this.olduguKat = olduguKat;
    }

    public boolean isCalismaDurumu() {
        return calismaDurumu;
    }

    public void setCalismaDurumu(boolean calismaDurumu) {
        this.calismaDurumu = calismaDurumu;
    }

    public ArrayList<Kisi> getAsansordekiKisiler() {
        return asansordekiKisiler;
    }

    public void setAsansordekiKisiler(ArrayList<Kisi> asansordekiKisiler) {
        this.asansordekiKisiler = asansordekiKisiler;
    }

    private ArrayList<Kisi> asansordekiKisiler = new ArrayList<>();

    public Asansor(Avm avm) {
        this.avm = avm;
    }

    public int getKapasite() {
        return kapasite;
    }

    public void setKapasite(int kapasite) {
        this.kapasite = kapasite;
    }


    public ArrayList<Kisi> getKisiler() {
        return kisiler;
    }

    public void setKisiler(Kisi kisi) {
        this.kisiler.add(kisi);

    }


    public ArrayList<AsansorBilgi> getAsansorBilgileri() {
        return asansorBilgileri;
    }

    public void setAsansorBilgileri(ArrayList<AsansorBilgi> asansorBilgileri) {
        this.asansorBilgileri = asansorBilgileri;
    }


    @Override
    public void run() {
        // Thread çalıştığında yapılması istenen işlemler buraya yazılır


        try {

            while (true) {

                System.out.println();
                if (this.isCalismaDurumu() == true) {

                    AsansorBilgi asansorBilgi0 = new AsansorBilgi();
                    AsansorBilgi asansorBilgi1 = new AsansorBilgi();
                    AsansorBilgi asansorBilgi2 = new AsansorBilgi();
                    AsansorBilgi asansorBilgi3 = new AsansorBilgi();


                    asansorBilgileri.add(asansorBilgi0);
                    asansorBilgileri.add(asansorBilgi1);
                    asansorBilgileri.add(asansorBilgi2);
                    asansorBilgileri.add(asansorBilgi3);

                    // System.out.println("asansör thread ");

                    ArrayList<Kat> katlar = this.avm.getKatlar();
                    for (int k = 0; k < katlar.size(); k++) {

                        this.setOlduguKat(k);
                        if (k <= 3) {
                            this.setGidecegiKat(k + 1);
                        } else {
                            this.setGidecegiKat(k - 1);
                        }
                        this.setYon(true);
                        Kat kat = katlar.get(k);
                        Kuyruk kuyruk = kat.getKuyruk();
                        ArrayList<Kisi> kuyrukKisiler = kuyruk.getKisiler();

                        //inecek kişileri kontrol edeceğim
                        ArrayList<Integer> silinecekIndeksler = new ArrayList<Integer>();
                        for (int i = 0; i < this.kisiler.size(); i++) {

                            if (this.kisiler.get(i).getGidilecekKat() == k) {

                                silinecekIndeksler.add(i);
                            }
                        }
                        int m = 0;
                        int n = 0;

                        for (int i = silinecekIndeksler.size() - 1; i >= 0; i--) {

                            this.kisiler.remove(i);
                            m++;

                            if (kuyruk.getKisi(i).getGidilecekKat() != kuyruk.getKisi(i + 1).getGidilecekKat()) {

                                asansorBilgileri.remove(n);
                                n++;
                            }

                        }

                        kat.setKisiSayisi(silinecekIndeksler.size());


                        //asansöre binme
                        if (kapasite == this.kisiler.size()) {

                        } else {

                            if (this.kisiler.size() <= kapasite && kuyruk.getToplamElamanSayisi() != 0) {

                                ArrayList<Integer> kuyruktanSilinecekler = new ArrayList<Integer>();

                                int h = 0;
                                int c = 0;

                                for (int i = 0; i <= this.kisiler.size() && kuyruk.getKisiler().size() > i && this.kisiler.size() < kapasite; i++) {


                                    if (kuyruk.getKisi(i) != null) {
                                        this.kisiler.add(kuyruk.getKisi(i));
                                        kuyruktanSilinecekler.add(i);
                                        //kuyruk.getKisi().getGidilecekKat()
                                        h++;

                                        if (kuyruk.getKisi(i).getGidilecekKat() != kuyruk.getKisi(i - 1).getGidilecekKat()) {
                                            asansorBilgileri.get(c).setKisiSayisi(h);
                                            asansorBilgileri.get(c).setKat(kuyruk.getKisi(i).getGidilecekKat());
                                            c++;
                                        }
                                    }


                                }
                                kuyruktanSilinecekler.forEach(index -> kuyrukKisiler.remove(index));


                                kat.kisiSayisiAzaltma(kuyruktanSilinecekler.size());

                            }


                        }

                        sleep(200);
                    }

                    for (int k = katlar.size() - 2; k > 0; k--) {

                        this.setOlduguKat(k);
                        if (k > 0) {
                            this.setGidecegiKat(k - 1);
                        } else {
                            this.setGidecegiKat(k + 1);
                        }
                        this.setYon(false);
                        Kat kat = katlar.get(k);
                        Kuyruk kuyruk = kat.getKuyruk();
                        ArrayList<Kisi> kuyrukKisiler = kuyruk.getKisiler();

                        //inecek kişileri kontrol edeceğim
                        ArrayList<Integer> silinecekIndeksler = new ArrayList<Integer>();
                        for (int i = 0; i < this.kisiler.size(); i++) {

                            if (this.kisiler.get(i).getGidilecekKat() == k) {

                                silinecekIndeksler.add(i);

                            }
                        }
                        int m = 0;
                        int n = 0;

                        for (int i = silinecekIndeksler.size() - 1; i >= 0; i--) {

                            this.kisiler.remove(i);
                            m++;

                            if (kuyruk.getKisi(i).getGidilecekKat() != kuyruk.getKisi(i + 1).getGidilecekKat()) {

                                asansorBilgileri.remove(n);
                                n++;
                            }
                        }

                        kat.setKisiSayisi(silinecekIndeksler.size());


                        //asansöre binme
                        if (kapasite == this.kisiler.size()) {

                        } else {

                            if (this.kisiler.size() <= kapasite && kuyruk.getToplamElamanSayisi() != 0) {

                                ArrayList<Integer> kuyruktanSilinecekler = new ArrayList<Integer>();
                                int h = 0;
                                int c = 0;

                                for (int i = 0; i <= this.kisiler.size() && kuyruk.getKisiler().size() > i && this.kisiler.size() < kapasite; i++) {

                                    if (kuyruk.getKisi(i) != null) {
                                        this.kisiler.add(kuyruk.getKisi(i));
                                        kuyruktanSilinecekler.add(i);
                                        h++;

                                        if (kuyruk.getKisi(i).getGidilecekKat() != kuyruk.getKisi(i - 1).getGidilecekKat()) {
                                            asansorBilgileri.get(c).setKisiSayisi(h);
                                            asansorBilgileri.get(c).setKat(kuyruk.getKisi(i).getGidilecekKat());
                                            c++;
                                        }
                                    }
                                }

                                kuyruktanSilinecekler.forEach(index -> kuyrukKisiler.remove(index));
                                kat.kisiSayisiAzaltma(kuyruktanSilinecekler.size());

                            }


                        }

                        sleep(200);
                    }
                } else {
                    //System.out.println("asansör thread çalışmıyor");
                }

            }


        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }
}
