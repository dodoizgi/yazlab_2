package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Exit extends Thread {

    private Avm avm;

    public Exit(Avm avm) {

        this.avm = avm;

    }


    @Override
    public void run() {
        System.out.println("cikis");

        try {

            for (; ; ) {
                Random random = new Random();
                int randomKisiSayisi = random.nextInt(5) + 1;
                int kuyrugaAlinacakKat = random.nextInt(4) + 1;
                int cikacakKisi = random.nextInt(5) + 1;
                avm.setCikacakKisi(cikacakKisi);

                ArrayList<Kat> katlar = this.avm.getKatlar();
                Kat kat0 = katlar.get(0);
                kat0.kisiSayisiAzaltma(cikacakKisi);


                //Kuyruk kuyruk = kat0.getKuyruk();
                //kuyruk.cikar(randomKisiSayisi);


                //Kisileri çıkmak için zemin kata gönderme
                Kat randomKat = katlar.get(kuyrugaAlinacakKat);
                Kuyruk kuyruk = randomKat.getKuyruk();
                if (cikacakKisi < randomKat.getKisiSayisi() && randomKat.getKuyruk().getToplamElamanSayisi() + cikacakKisi < randomKat.getKisiSayisi()) {

                    kuyruk.ekle(cikacakKisi, 0);

                }


                sleep(1000);
            }


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

