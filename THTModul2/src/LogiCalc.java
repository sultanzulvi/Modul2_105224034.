import java.util.Scanner;

public class LogiCalc {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double tarifJarak = 15000;
        double tarifBerat = 5500;

        System.out.println("=== SISTEM LOGICALC FASTSEND ===");

        System.out.print("Masukkan Nama Klien    : ");
        String nama = input.nextLine();

        System.out.print("Masukkan Berat (Kg)    : ");
        double berat = input.nextDouble();

        System.out.print("Masukkan Jarak (Km)    : ");
        int jarak = input.nextInt();

        System.out.print("Masukkan Jumlah Box    : ");
        int box = input.nextInt();

        int trukPenuh = box / 150;
        int sisaBox = box % 150;

        double dasarBiaya = (tarifJarak * jarak) + (tarifBerat * berat);
        double asuransi = dasarBiaya * 0.035;
        double totalBayar = dasarBiaya + asuransi;

        int jam = jarak / 60;
        int menit = jarak % 60;

        System.out.println();
        System.out.println("=== RESI PENGIRIMAN ===");
        System.out.println("Klien           : " + nama);
        System.out.println("Total Box       : " + box + " box");
        System.out.println("Kebutuhan Armada: " + trukPenuh + " Truk Penuh dan sisa " + sisaBox + " box via Pikap.");

        System.out.println();
        System.out.println("Estimasi Waktu  : " + jam + " Jam " + menit + " Menit (Asumsi 60km/jam)");

        System.out.println();
        System.out.println("=== RINCIAN BIAYA ===");
        System.out.println("Dasar Biaya     : Rp " + dasarBiaya);
        System.out.println("Asuransi (3.5%) : Rp " + asuransi);
        System.out.println("-----------------------------------");
        System.out.println("TOTAL BAYAR     : Rp " + totalBayar);
        System.out.println("===================================");

        input.close();
    }
}