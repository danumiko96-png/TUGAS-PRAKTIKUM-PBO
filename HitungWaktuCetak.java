import java.util.Scanner;

public class HitungWaktuCetak {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan jumlah novel yang akan dicetak: ");
            int jumlahNovel = input.nextInt();
            
            System.out.print("Masukkan tebal lembar per novel: ");
            int tebalPerNovel = input.nextInt();
            
            long totalLembar = (long) jumlahNovel * tebalPerNovel;
            
            long totalDetik = totalLembar;
            
            long hari = totalDetik / 86400;      
            long sisaDetik = totalDetik % 86400;
            
            long jam = sisaDetik / 3600;         
            sisaDetik %= 3600;
            
            long menit = sisaDetik / 60;         
            long detik = sisaDetik % 60;
            
            System.out.println("\n--- HASIL PERHITUNGAN WAKTU CETAK ---");
            System.out.println("Total Lembar Dicetak : " + totalLembar + " lembar");
            System.out.println("Waktu yang diperlukan: " + hari + " hari, " + jam + " jam, " + menit + " menit, " + detik + " detik.");
        }
    }
}
