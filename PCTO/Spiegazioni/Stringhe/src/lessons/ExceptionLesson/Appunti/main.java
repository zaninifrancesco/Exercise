/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lessons.ExceptionLesson.Appunti;

import java.util.Scanner;

/**
 *
 * @author francesco
 */
public class main {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int r;
        int n1, n2;

        String n;

        n = "";

        r = scan.nextInt();

        try {
            stampa(r);
        } catch (StringaVuotaException e) {
            e.printStackTrace();
        }

    }

    public static void stampa(int n) throws StringaVuotaException {

        if (n < 10) {
            throw new StringaVuotaException("Lmao è nera");
        }

    }

}
