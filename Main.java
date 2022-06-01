package com.company;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность массива(не менее 3)");
        int n = in.nextInt();
        int[] chchch = new int[n];
        System.out.println("Введите числа массива");
        for (int i = 0; i < chchch.length; i++) {
            chchch[i] = in.nextInt();
        }
        int[] chchchSort = new int[n/2];
        for (int i = 0; i < chchch.length; i+=2) {
            for (int d = 0; d < chchchSort.length; d++)
            chchch[i] = in.nextInt();
        }
    }
}