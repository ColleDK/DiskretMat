package DifferensLigninger;

import java.util.Scanner;

public class DifferensLigning1orden {
    public static void main(String[] args) {
        int taeller, naevner;
        int koefficient, b;

        Scanner Keyb = new Scanner(System.in);
        System.out.print("Er din koefficient a en brøk? (y/n)");
        String str = Keyb.next();

        //a er brøk
        if (str.equals("y")) {
            System.out.print("Skriv tæller (øverste tal): ");
            taeller = Keyb.nextInt();
            System.out.print("Skriv nævner (nederste tal): ");
            naevner = Keyb.nextInt();

            System.out.print("Indtast b (hvis ingen skriv 0): ");
            b = Keyb.nextInt();


             if (taeller / naevner != 1 && b != 0) {
                if (b < 0) {
                    System.out.println("Xn = (" + taeller + "/" + naevner + ")^n * X0 - " + Math.abs(b)
                            + "*((1-(" + taeller + "/" + naevner + ")^n)/(1-" + taeller + "/" + naevner + "))");
                }
                else {
                    System.out.println("Xn = (" + taeller + "/" + naevner + ")^n * X0 + " + b
                            + "*((1-(" + taeller + "/" + naevner + ")^n)/(1-" + taeller + "/" + naevner + "))");
                }
            } else {
                System.out.println("Xn = (" + taeller + "/" + naevner + ")^n * X0");
            }
        }

        //a er ikke brøk
        else {
            System.out.print("Indtast koefficienten a (hvis ingen skriv 1): ");
            koefficient = Keyb.nextInt();
            System.out.print("Indtast b (hvis ingen skriv 0): ");
            b = Keyb.nextInt();
            if (koefficient == 1) {
                System.out.println("Xn = X0 + " + b + "n");
            } else if (koefficient != 1 && b != 0) {
                if (b < 0) {
                    System.out.println("Xn = " + koefficient + "^n * X0 - " + Math.abs(b)
                            + "*((1-" + koefficient + "^n)/(1-" + koefficient + "))");
                }
                else {
                    System.out.println("Xn = " + koefficient + "^n * X0 + " + b
                            + "*((1-" +koefficient + "^n)/(1-" + koefficient + "))");
                }
            } else {
                System.out.println("Xn = " + koefficient + "^n * X0");
            }
        }
    }
}
