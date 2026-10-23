import java.time.LocalTime;
import java.time.Duration;
import java.util.Scanner;

public class SelisihWaktu {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan Waktu Pertama (jam:menit:detik): ");
            String waktu1Str = input.nextLine();
            
            System.out.print("Masukkan Waktu Kedua (jam:menit:detik): ");
            String waktu2Str = input.nextLine();
            
            LocalTime waktu1 = LocalTime.parse(waktu1Str);
            LocalTime waktu2 = LocalTime.parse(waktu2Str);
            
            Duration selisih = Duration.between(waktu1, waktu2).abs();
            
            long jam = selisih.toHours();
            long menit = selisih.toMinutesPart();
            long detik = selisih.toSecondsPart();
            
            System.out.println("Selisih Waktu: " + jam + " Jam, " + menit + " Menit, " + detik + " Detik.");
        }
    }
}