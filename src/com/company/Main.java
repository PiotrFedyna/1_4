package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        double a, b, w;
        int x;
        System.out.println("Jakie pole chcesz obliczyć ");
        System.out.println("1.Suma dwóch pól kół" + "\n" + "2 Pole prostokąta " + "\n" + "3 Pole trójkąta prostokątnego " + "\n" + "4 Suma dwóch kwadratów");
        x = p.nextInt();
        switch (x) {
            case 1 -> {
                System.out.println("Podaj 1 r");
                a = p.nextDouble();
                System.out.println("Podaj 2 r");
                b = p.nextDouble();
                w = 3.14 * a * a + 3.14 * b * b;
                System.out.println("Wynik to:" + w);

            }
            case 2 -> {
                System.out.println("Podaj 1 bok");
                a = p.nextDouble();
                System.out.println("Podaj 2 bok");
                b = p.nextDouble();
                w = a * b;
                System.out.println("Wynik to:" + w);
            }
            case 3 -> {
                System.out.println("Podaj 1 przyprostokątną");
                a = p.nextDouble();
                System.out.println("Podaj 2 przyprostokątną");
                b = p.nextDouble();
                w = a * b/2;
                System.out.println("Wynik to:" + w);
            }
            case 4 ->{
                System.out.println("Podaj bok 1 kwadratu");
                a = p.nextDouble();
                System.out.println("Podaj bok 2 kwadratu");
                b = p.nextDouble();
                w = a*a+b*b;
                System.out.println("Wynik to:" + w);
            }
        }
    }
}