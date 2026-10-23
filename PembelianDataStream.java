
import java.io.DataInputStream;
import java.io.IOException;

public class PembelianDataStream {
  
    public static void main(String[] args) {
        try {
            DataInputStream input = new DataInputStream(System.in);

            System.out.print("Masukkan Nama Barang/Pelanggan: ");
            String nama = input.readLine();

            System.out.print("Masukkan Total Belanja: ");
            double totalBelanja = Double.parseDouble(input.readLine());

            System.out.print("Masukkan Diskon (%): ");
            double diskonPersen = Double.parseDouble(input.readLine());

            double hitungDiskon = totalBelanja * (diskonPersen / 100);
            double totalAkhir = totalBelanja - hitungDiskon;

            System.out.print("Masukkan Jumlah Bayar: ");
            double bayar = Double.parseDouble(input.readLine());

            double kembalian = bayar - totalAkhir;

            System.out.println("\n--- RINCIAN PEMBELANJAAN ---");
            System.out.println("Nama         : " + nama);
            System.out.println("Total Belanja: Rp " + totalBelanja);
            System.out.println("Diskon (%)   : " + diskonPersen + "%");
            System.out.println("Total        : Rp " + totalAkhir);
            System.out.println("Bayar        : Rp " + bayar);
            System.out.println("Kembalian    : Rp " + kembalian);

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan input: " + e.getMessage());
        }
    }
}

