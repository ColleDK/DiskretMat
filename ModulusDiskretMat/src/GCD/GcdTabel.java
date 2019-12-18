package GCD;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GcdTabel {
    public static void main(String[] args) {
        int modulus, stoerst, stoerst2, mindst, mindst2, gcd;
        int sk2 = 1, sk1 = 0, tk2 = 0, tk1 = 1, qk, sk3, tk3;
        int k = 1;
        boolean faerdig = true, faerdig2 = true;

        Scanner Keyb = new Scanner(System.in);
        while (faerdig2) {
            try {
                System.out.print("Indtast det første tal: ");
                stoerst = Keyb.nextInt();
                System.out.print("Indtast det andet tal: ");
                mindst = Keyb.nextInt();
                System.out.println();

                if (stoerst < mindst) {
                    int a = mindst;
                    mindst = stoerst;
                    stoerst = a;
                }

                qk = stoerst / mindst;
                modulus = stoerst - qk * mindst;
                stoerst2 = stoerst;
                mindst2 = mindst;

                System.out.println("\t k er: " + k++ + "\tQk er: " + qk + "\t Rk er: " + modulus + "\t Sk er: "
                        + (sk2 - qk * sk1) + "\t Tk er: " + (tk2 - qk * tk1));
                tk3 = tk1;
                tk1 = (tk2 - qk * tk1);
                tk2 = tk3;
                sk3 = sk1;
                sk1 = (sk2 - qk * sk1);
                sk2 = sk3;

                while (faerdig) {
                    if (modulus > 0) {
                        if (modulus < mindst) {
                            stoerst = mindst;
                            mindst = modulus;
                        } else {
                            stoerst = modulus;
                        }

                        qk = stoerst / mindst;
                        modulus = stoerst - qk * mindst;

                        System.out.println("\t k er: " + k++ + "\tQk er: " + qk + "\t Rk er: " + modulus + "\t Sk er: "
                                + (sk2 - qk * sk1) + "\t Tk er: " + (tk2 - qk * tk1));
                        tk3 = tk1;
                        tk1 = (tk2 - qk * tk1);
                        tk2 = tk3;
                        sk3 = sk1;
                        sk1 = (sk2 - qk * sk1);
                        sk2 = sk3;

                    } else {
                        System.out.println();
                        gcd = mindst;
                        System.out.println("GCD(" + stoerst2 + "," + mindst2 + ") = " + gcd);
                        faerdig = false;
                    }
                }

            } catch (InputMismatchException e) {
                System.out.println("Du indtastede ikke en integer");
                System.out.println();
                Keyb.next();
            }


            if (!faerdig) {
                System.out.print("Vil du finde flere GCD'er? (y/n) ");
                String str = Keyb.next();
                if (str.equals("n")) {
                    System.out.println("Programmet stopper nu");
                    faerdig2 = false;
                } else {
                    sk2 = 1;
                    sk1 = 0;
                    tk2 = 0;
                    tk1 = 1;
                    k = 1;
                    faerdig = true;
                    System.out.println();
                }
            }
        }
    }
}
