import java.util.Scanner;

public class DikUcgen {
    public static void main(String[] args) {
        int kenar1,kenar2,kenar3;
        int cevre;
        double alan;
        Scanner inp = new Scanner(System.in);

        System.out.println("Kenar 1 : ");
        kenar1 = inp.nextInt();
        System.out.println("Kenar 2 : ");
        kenar2 = inp.nextInt();
        System.out.println("Kenar3 : ");
        kenar3 = inp.nextInt();

        cevre = kenar1 + kenar2 + kenar3;
        double u = cevre / 2;
        double alanKare = u * (u - kenar1) * (u - kenar2) * (u - kenar3);
        alan = Math.sqrt(alanKare);

        System.out.println("alan" + alan);
    }
}
