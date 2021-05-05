package com.company;

import java.util.LinkedList;

public class TestVari {

    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>();

        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(9);

        lista.removeLast();

        for (int a:lista) {
            System.out.println(a);
        }



    }




}
