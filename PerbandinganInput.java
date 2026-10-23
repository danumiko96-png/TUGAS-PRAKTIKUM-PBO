import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class PerbandinganInput {
    public static void main(String[] args) throws IOException {
       
        Scanner sc = new Scanner(System.in);
        System.out.print("[Scanner] Masukkan Angka: ");
        int angkaScanner = sc.nextInt();
        System.out.println("Hasil Scanner: " + angkaScanner);

      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("[BufferedReader] Masukkan Angka: ");
        int angkaBR = Integer.parseInt(br.readLine());
        System.out.println("Hasil BufferedReader: " + angkaBR);
    }
}

