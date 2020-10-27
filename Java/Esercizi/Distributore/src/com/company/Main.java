package com.company;

public class Main {

    public static void main(String[] args) {

        Distributore distributore1 = new Distributore(10,"distributore2");
        Distributore distributore2 = new Distributore(60,"distributore3");
        Distributore distributore3 = new Distributore(2,"distributore4");
        Distributore distributore4 = new Distributore(90,"distributore5");
        Distributore distributore5 = new Distributore(110,"distributore6");

        int[] x = new int[5];
        x[0] = distributore1.getPrezzo();
        x[1] = distributore2.getPrezzo();
        x[2] = distributore3.getPrezzo();
        x[3] = distributore4.getPrezzo();
        x[4] = distributore5.getPrezzo();

        min_max(x);
    }

    static public void min_max(int[] x){
        int min = x[0];
        int max = x[0];

        for(int i = 1;i < x.length;i++){
            if(x[i] < min){
                min = x[i];
            }
        }

        for(int i = 1;i < x.length;i++){
            if(x[i] > max){
                max = x[i];
            }
        }

        System.out.println("Max:" + max + "\nMin:" + min);

    }
}
