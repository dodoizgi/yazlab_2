package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Login extends Thread {

    private Avm avm;
    private ArrayList<Kisi> kisiler = new ArrayList<>();
    public int kat=0;


    public Login(Avm avm) {
        this.avm = avm;


    }

    @Override
    public void run() {

        System.out.println("giris");


        //random sınıfı

        try {

            for (; ; ) {
                Random random = new Random();
                int randomKisiSayisi = random.nextInt(10) + 1;
                //gelen kisileri 0.katın kuyruğuna ekle
                ArrayList<Kat> katlar = this.avm.getKatlar();
                Kat kat0 = katlar.get(0);
                kat0.setKisiSayisi(randomKisiSayisi);
                Kuyruk kuyruk = kat0.getKuyruk();

                //kisilere gidecekleri  rastgele bir kat belirleme ve kuyruğa ekleme
                int randomKat = random.nextInt(4) + 1;
                kuyruk.ekle(randomKisiSayisi, randomKat);

                kat=randomKat;

               /* for (int k = 0; k < randomKisiSayisi; k++) {


                    Kisi kisi = new Kisi();
                    kuyruk.setKisiler(kisi);
                    kisi.setGidilecekKat(randomKat);
                    //avm.setAsansorBilgi(asansorBilgi);
                }*/
                AsansorBilgi asansorBilgi = new AsansorBilgi(randomKisiSayisi, randomKat);


                //sleep threadin 500 milisaniyede bir çalışmasını sağlar
                sleep(500);
            }


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
