import java.util.Scanner;

public class GayaSentripetal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Massa (m) dalam kg: ");
        double m = input.nextDouble();

        System.out.print("Masukkan Kecepatan (v) dalam m/s: ");
        double v = input.nextDouble();

        System.out.print("Masukkan Jari-jari (r) dalam meter: ");
        double r = input.nextDouble();

        double fc = (m * Math.pow(v, 2)) / r;

        System.out.println("Gaya Sentripetal (Fc) = " + fc + " N");

        input.close();
    }
}

