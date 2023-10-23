/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv22task2zaharsimanski;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class SPTV22Task2ZaharSimanski {

public static void main(String[] args) {
        System.out.println("Пожалуйста введите трёхзначное число: ");
        int trexznach = new Scanner(System.in).nextInt();
        int summa = 0;
        while (trexznach > 0) {
            summa += trexznach % 10;
            trexznach /= 10;
        }
        System.out.println("Сумма цифр: " + summa);
    }
}