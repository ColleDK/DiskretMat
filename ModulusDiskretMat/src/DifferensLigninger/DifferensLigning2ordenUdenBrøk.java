package DifferensLigninger;

import java.util.Scanner;

public class DifferensLigning2ordenUdenBrøk {
    public static void main(String[] args) {
        int p, q, m1, m2;

        Scanner Keyb = new Scanner(System.in);

        System.out.print("Indtast p: ");
        p = Keyb.nextInt();

        System.out.print("Indtast q: ");
        q = Keyb.nextInt();

        //udregner m1 og m2 som int
        m1 = (int) ((p + Math.sqrt(Math.pow(p, 2) + 4 * q)) / 2);
        System.out.println(m1);
        m2 = (int) ((p - Math.sqrt(Math.pow(p, 2) + 4 * q)) / 2);
        System.out.println(m2);

        System.out.print("Er der en begyndelsesbetingelse? (y/n)");
        String str = Keyb.next();

        //hvis der er en begyndelsesbetingelse
        if (str.equals("y")) {
            System.out.print("Indtast din første grad: ");
            int n = Keyb.nextInt();
            System.out.print("Indtast hvad a" + n + " er lig med:");
            int a0 = Keyb.nextInt();
            System.out.print("Indtast hvad a" + ++n + " er lig med:");
            n--;
            int a1 = Keyb.nextInt();
            //hvis m1 ikke er det samme som m2
            if (m1 != m2) {
                System.out.println(a0 + "=A*" + Math.pow(m1, n) + " B*" + Math.pow(m2, n));
            }

            //hvis m1 er det samme som m2 for a0
            else {
                if ((int) (n * Math.pow(m1, n)) == 0) {
                    System.out.println(a0 + "=A*" + (int) Math.pow(m1, n));
                }
                else if ((int) Math.pow(m1, n) == 0){
                    System.out.println(a0 + "=B*" + (int) (n * Math.pow(m1, n)));
                }
                else{
                    System.out.println(a0 + "=A*" + (int) Math.pow(m1, n) + " + B*" + (int) (n * Math.pow(m1, n)));
                }
            }
        }


        //uden begyndelsesbetingelse
        else {
            if (m1 != m2) {
                System.out.println("Det generelle løsningsforslag er: ");
                System.out.println("Xn = A*" + m1 + "^n + B*" + m2 + "^n");
            } else {
                System.out.println("Det generelle løsningsforslag er: ");
                System.out.println("Xn = A*" + m1 + "^n + B*n*" + m1 + "^n");
            }
        }
    }
}
