import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TotalBuahSisca {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Masukkan jumlah buah mangga yang dibeli: ");
            int manggaBeli = Integer.parseInt(reader.readLine()); 

            System.out.print("Masukkan jumlah tetangga: ");
            int tetangga = Integer.parseInt(reader.readLine()); 

            System.out.print("Masukkan jumlah jambu per tetangga: ");
            int jambuPerTetangga = Integer.parseInt(reader.readLine()); 

            System.out.print("Masukkan jumlah mangga busuk dikembalikan: ");
            int manggaBusuk = Integer.parseInt(reader.readLine()); 

            int totalJambu = tetangga * jambuPerTetangga;
            int manggaBersih = manggaBeli - manggaBusuk;
            int totalBuah = manggaBersih + totalJambu;

            System.out.println("\n--- HASIL PERHITUNGAN BUAH ---");
            System.out.println("Mangga yang bagus : " + manggaBersih + " pcs");
            System.out.println("Total Jambu dibeli : " + totalJambu + " pcs");
            System.out.println("Total Seluruh Buah : " + totalBuah + " pcs");

        } catch (IOException e) {
            System.out.println("Error Input: " + e.getMessage());
        }
    }
}
