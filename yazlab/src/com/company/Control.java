package com.company;
//https://ufukuzun.wordpress.com/2015/02/14/javada-multithreading-bolum-1-merhaba-thread/

import java.util.ArrayList;

public class Control extends Thread {

    private Avm avm;
    private Asansor asansor2 = new Asansor(avm);
    private Asansor asansor3 = new Asansor(avm);
    private Asansor asansor4 = new Asansor(avm);
    private Asansor asansor5 = new Asansor(avm);

    public Avm getAvm() {
        return avm;
    }

    public void setAvm(Avm avm) {
        this.avm = avm;
    }

    public Asansor getAsansor2() {
        return asansor2;
    }

    public void setAsansor2(Asansor asansor2) {
        this.asansor2 = asansor2;
    }

    public Asansor getAsansor3() {
        return asansor3;
    }

    public void setAsansor3(Asansor asansor3) {
        this.asansor3 = asansor3;
    }

    public Asansor getAsansor4() {
        return asansor4;
    }

    public void setAsansor4(Asansor asansor4) {
        this.asansor4 = asansor4;
    }

    public Asansor getAsansor5() {
        return asansor5;
    }

    public void setAsansor5(Asansor asansor5) {
        this.asansor5 = asansor5;
    }


    public Control(Avm avm, Asansor asansor2, Asansor asansor3, Asansor asansor4, Asansor asansor5) {

        this.avm = avm;
        this.asansor2 = asansor2;
        this.asansor3 = asansor3;
        this.asansor4 = asansor4;
        this.asansor5 = asansor5;

    }


    @Override
    public void run() {
        // Thread çalıştığında yapılması istenen işlemler buraya yazılır

        for (; ; ) {

            ArrayList<Kat> katlar = this.avm.getKatlar();
            Kat kat0 = katlar.get(0);
            Kat kat1 = katlar.get(1);
            Kat kat2 = katlar.get(2);
            Kat kat3 = katlar.get(3);
            Kat kat4 = katlar.get(4);
            Kuyruk kuyruk0 = kat0.getKuyruk();
            Kuyruk kuyruk1 = kat1.getKuyruk();
            Kuyruk kuyruk2 = kat2.getKuyruk();
            Kuyruk kuyruk3 = kat3.getKuyruk();
            Kuyruk kuyruk4 = kat4.getKuyruk();

            if (kuyruk0.getToplamElamanSayisi() > 20 || kuyruk1.getToplamElamanSayisi() > 20 || kuyruk2.getToplamElamanSayisi() > 20 || kuyruk3.getToplamElamanSayisi() > 20 || kuyruk4.getToplamElamanSayisi() > 20) {

                if (asansor2.isCalismaDurumu() == false) {

                    asansor2.setCalismaDurumu(true);
                    asansor2.start();
                }

                if (kuyruk0.getToplamElamanSayisi() > 40 || kuyruk1.getToplamElamanSayisi() > 40 || kuyruk2.getToplamElamanSayisi() > 40 || kuyruk3.getToplamElamanSayisi() > 40 || kuyruk4.getToplamElamanSayisi() > 40) {


                    if (asansor3.isCalismaDurumu() == false) {

                        asansor3.setCalismaDurumu(true);
                        asansor3.start();
                    }

                    if (kuyruk0.getToplamElamanSayisi() > 60 || kuyruk1.getToplamElamanSayisi() > 60 || kuyruk2.getToplamElamanSayisi() > 60 || kuyruk3.getToplamElamanSayisi() > 60 || kuyruk4.getToplamElamanSayisi() > 60) {


                        if (asansor4.isCalismaDurumu() == false) {

                            asansor4.setCalismaDurumu(true);
                            asansor4.start();
                        }

                        if (kuyruk0.getToplamElamanSayisi() > 80 || kuyruk1.getToplamElamanSayisi() > 80 || kuyruk2.getToplamElamanSayisi() > 80 || kuyruk3.getToplamElamanSayisi() > 80 || kuyruk4.getToplamElamanSayisi() > 80) {


                            if (asansor5.isCalismaDurumu() == false) {

                                asansor5.setCalismaDurumu(true);
                                asansor5.start();
                            }
                        }
                    }
                }
            }

            if (kuyruk0.getToplamElamanSayisi() < 80 && kuyruk1.getToplamElamanSayisi() < 80 && kuyruk2.getToplamElamanSayisi() < 80 && kuyruk3.getToplamElamanSayisi() < 80 && kuyruk4.getToplamElamanSayisi() < 80) {

                if (asansor5.isAlive() == true) {

                    asansor5.setCalismaDurumu(false);
                }


                if (kuyruk0.getToplamElamanSayisi() < 60 && kuyruk1.getToplamElamanSayisi() < 60 && kuyruk2.getToplamElamanSayisi() < 60 && kuyruk3.getToplamElamanSayisi() < 60 && kuyruk4.getToplamElamanSayisi() < 60) {


                    if (asansor4.isAlive() == true) {

                        asansor4.setCalismaDurumu(false);
                    }

                    if (kuyruk0.getToplamElamanSayisi() < 40 && kuyruk1.getToplamElamanSayisi() < 40 && kuyruk2.getToplamElamanSayisi() < 40 && kuyruk3.getToplamElamanSayisi() < 40 && kuyruk4.getToplamElamanSayisi() < 40) {

                        if (asansor3.isAlive() == true) {

                            asansor3.setCalismaDurumu(false);
                        }

                        if (kuyruk0.getToplamElamanSayisi() < 20 && kuyruk1.getToplamElamanSayisi() < 20 && kuyruk2.getToplamElamanSayisi() < 20 && kuyruk3.getToplamElamanSayisi() < 20 && kuyruk4.getToplamElamanSayisi() < 20) {

                            if (asansor2.isCalismaDurumu() == true) {

                                asansor2.setCalismaDurumu(false);
                            }
                        }
                    }
                }
            }


        }

    }

}
