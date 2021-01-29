package com.company;

public class Main {

    public static void main(String[] args) {
        Social insta = new Instagram(5, 0, 0, 0);

        insta.aggiungiFollower();


        Social tiktok = new Tiktok(10, 30);

        tiktok.seguiQualcuno();
        tiktok.aggiungiFollower();
        System.out.println(tiktok.getnFollower());
        System.out.println(insta.getnFollower());

        System.out.println();


    }
}
