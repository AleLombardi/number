/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.esempio;

import java.util.Scanner;

/**
 *
 * @author posta
 */
public class startApp {

    public static void main(String[] args) {
        //questo è un commento
        int[] valori = {5, 5, 5, 5, 5, 5, 6, 5, 5, 5};

        boolean ok = true;
        for (int x : valori) {
            if (x != valori[0]) {
                ok = false;
            }
        }

        if (ok) {
            System.out.println("tutti uguali");
        } else {
            System.out.println("non tutti uguali");
        }

    }

}
