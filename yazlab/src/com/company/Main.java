package com.company;


import java.io.IOException;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) throws IOException, InterruptedException {


        ArrayList<Asansor> asansorler = new ArrayList<>();

        Avm avm = new Avm();

        Login login = new Login(avm);
        login.start();

        Exit exit = new Exit(avm);
        exit.start();

        Asansor asansor1 = new Asansor(avm);
        Asansor asansor2 = new Asansor(avm);
        Asansor asansor3 = new Asansor(avm);
        Asansor asansor4 = new Asansor(avm);
        Asansor asansor5 = new Asansor(avm);

        asansorler.add(asansor1);
        asansorler.add(asansor2);
        asansorler.add(asansor3);
        asansorler.add(asansor4);
        asansorler.add(asansor5);

        asansor1.setCalismaDurumu(true);
        asansor1.start();

        Control control = new Control(avm, asansor2, asansor3, asansor4, asansor5);
        control.start();

        for (; ; ) {
            System.out.println("0.floor : queue : " + avm.getKatlar().get(0).getKuyruk().getKisiler().size());
            System.out.println("1.floor : all : " + avm.getKatlar().get(1).getKisiSayisi() + " queue : " + avm.getKatlar().get(1).getKuyruk().getKisiler().size());
            System.out.println("2.floor : all : " + avm.getKatlar().get(2).getKisiSayisi() + " queue : " + avm.getKatlar().get(2).getKuyruk().getKisiler().size());
            System.out.println("3.floor : all : " + avm.getKatlar().get(3).getKisiSayisi() + " queue : " + avm.getKatlar().get(3).getKuyruk().getKisiler().size());
            System.out.println("4.floor : all : " + avm.getKatlar().get(4).getKisiSayisi() + " queue : " + avm.getKatlar().get(4).getKuyruk().getKisiler().size());
            System.out.println("exit count : " + avm.getCikacakKisi());
            System.out.println("active : " + asansor1.isCalismaDurumu());
            if (asansor1.isCalismaDurumu() == true) {
                System.out.println("\t\t\t\tmode : working");
            } else {
                System.out.println("\t\t\t\tmode : idle");
            }
            System.out.println("\t\t\t\tfloor : " + asansor1.getOlduguKat());
            System.out.println("\t\t\t\tdestination : " + asansor1.getGidecegiKat());
            if (asansor1.isYon() == true) {
                System.out.println("\t\t\t\tdirection : up");
            } else {
                System.out.println("\t\t\t\tdirection : down");
            }
            System.out.println("\t\t\t\tcapacity : " + asansor1.getKapasite());
            System.out.println("\t\t\t\tcount_inside : " + asansor1.getKisiler().size());

            System.out.println("\t\t\t\tinside : [("+asansor1.getAsansorBilgileri().get(0).getKat()+","+ asansor1.getAsansorBilgileri().get(0).getKisiSayisi()+")"+"]");

            System.out.println("active : " + asansor2.isCalismaDurumu());
            if (asansor2.isCalismaDurumu() == true) {
                System.out.println("\t\t\t\tmode : working");
            } else {
                System.out.println("\t\t\t\tmode : idle");
            }
            System.out.println("\t\t\t\tfloor : " + asansor2.getOlduguKat());
            System.out.println("\t\t\t\tdestination : " + asansor2.getGidecegiKat());
            if (asansor2.isYon() == true) {
                System.out.println("\t\t\t\tdirection : up");
            } else {
                System.out.println("\t\t\t\tdirection : down");
            }
            System.out.println("\t\t\t\tcapacity : " + asansor2.getKapasite());
            System.out.println("\t\t\t\tcount_inside : " + asansor2.getKisiler().size());

            /*
             *
             *
             * */
            System.out.println("active : " + asansor3.isCalismaDurumu());
            if (asansor3.isCalismaDurumu() == true) {
                System.out.println("\t\t\t\tmode : working");
            } else {
                System.out.println("\t\t\t\tmode : idle");
            }
            System.out.println("\t\t\t\tfloor : " + asansor3.getOlduguKat());
            System.out.println("\t\t\t\tdestination : " + asansor3.getGidecegiKat());
            if (asansor3.isYon() == true) {
                System.out.println("\t\t\t\tdirection : up");
            } else {
                System.out.println("\t\t\t\tdirection : down");
            }
            System.out.println("\t\t\t\tcapacity : " + asansor3.getKapasite());
            System.out.println("\t\t\t\tcount_inside : " + asansor3.getKisiler().size());

            /*
             *
             *
             * */
            System.out.println("active : " + asansor4.isCalismaDurumu());
            if (asansor4.isCalismaDurumu() == true) {
                System.out.println("\t\t\t\tmode : working");
            } else {
                System.out.println("\t\t\t\tmode : idle");
            }
            System.out.println("\t\t\t\tfloor : " + asansor4.getOlduguKat());
            System.out.println("\t\t\t\tdestination : " + asansor4.getGidecegiKat());
            if (asansor4.isYon() == true) {
                System.out.println("\t\t\t\tdirection : up");
            } else {
                System.out.println("\t\t\t\tdirection : down");
            }
            System.out.println("\t\t\t\tcapacity : " + asansor4.getKapasite());
            System.out.println("\t\t\t\tcount_inside : " + asansor4.getKisiler().size());

            /*
             *
             *
             * */
            System.out.println("active : " + asansor5.isCalismaDurumu());
            if (asansor5.isCalismaDurumu() == true) {
                System.out.println("\t\t\t\tmode : working");
            } else {
                System.out.println("\t\t\t\tmode : idle");
            }
            System.out.println("\t\t\t\tfloor : " + asansor5.getOlduguKat());
            System.out.println("\t\t\t\tdestination : " + asansor5.getGidecegiKat());
            if (asansor5.isYon() == true) {
                System.out.println("\t\t\t\tdirection : up");
            } else {
                System.out.println("\t\t\t\tdirection : down");
            }
            System.out.println("\t\t\t\tcapacity : " + asansor5.getKapasite());
            System.out.println("\t\t\t\tcount_inside : " + asansor5.getKisiler().size());

            /*
             *
             *
             * */



            System.out.println(new String(new char[70]).replace("\0", "\r\n"));


        }
    }
}




