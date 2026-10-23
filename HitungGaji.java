
import java.util.Scanner;


public class HitungGaji {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIK/NPM: ");
        String nik = input.nextLine();

        System.out.print("Masukkan Nama Karyawan: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Alamat: ");
        String alamat = input.nextLine();

        System.out.print("Masukkan Jabatan: ");
        String jabatan = input.nextLine();

        double p1 = 2000000; 
        double p2 = 300000;  
        double p3 = 200000;  
        double p4 = 150000;  

        double totalGaji = p1 + p2 + p3 + p4;
        double pajak = 0.10 * totalGaji;
        double gajiBersih = totalGaji - pajak;

        System.out.println("\n--- SLIP GAJI PEGAWAI ---");
        System.out.println("NIK/NPM          : " + nik);
        System.out.println("Nama Karyawan    : " + nama);
        System.out.println("Alamat           : " + alamat);
        System.out.println("Jabatan          : " + jabatan);
        System.out.println("Gaji Pokok (P1)  : Rp " + p1);
        System.out.println("Tunj. Jabatan(P2): Rp " + p2);
        System.out.println("Tunj. Istri (P3) : Rp " + p3);
        System.out.println("Tunj. Anak (P4)  : Rp " + p4);
        System.out.println("Total Gaji       : Rp " + totalGaji);
        System.out.println("Pajak (10%)      : Rp " + pajak);
        System.out.println("Gaji Bersih      : Rp " + gajiBersih);

        input.close();
    }
}

