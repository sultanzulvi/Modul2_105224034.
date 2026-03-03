import java.util.Scanner;

public class HitungGaji {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== SISTEM PAYROLL PERUSAHAAN ===");
        System.out.print("Nama Karyawan : ");
        String nama = input.nextLine();

        System.out.print("Gaji Pokok : ");
        double gajiPokok = input.nextDouble();

        System.out.print("Jumlah Jam Lembur : ");
        int jamLembur = input.nextInt();

        double upahLemburPerJam = gajiPokok / 173;
        double totalLembur = jamLembur * upahLemburPerJam;
        double gajiKotor = gajiPokok + totalLembur;
        double pajak = 0.05 * gajiKotor;
        double bpjs = 0.01 * gajiPokok;
        double gajiBersih = gajiKotor - pajak - bpjs;

        System.out.println("\n=== SLIP GAJI ===");
        System.out.println("Karyawan          : " + nama);
        System.out.println("Upah Lembur/Jam   : Rp " + upahLemburPerJam);
        System.out.println("Total Uang Lembur : Rp " + totalLembur);
        System.out.println("---------------------------------");
        System.out.println("Gaji Bruto        : Rp " + gajiKotor);
        System.out.println("Potongan Pajak    : Rp " + pajak);
        System.out.println("Potongan BPJS     : Rp " + bpjs);
        System.out.println("---------------------------------");
        System.out.println("GAJI BERSIH       : Rp " + gajiBersih);

        input.close();
    }
}