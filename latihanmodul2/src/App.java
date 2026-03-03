import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Panjang : ");
        double panjang = input.nextDouble();

        System.out.print("Masukan lebar : ");
        double lebar = input.nextDouble();

        System.out.print("Masukan Tinggi : ");
        double tinggi = input.nextDouble();

        double luasPermukaan = 2*tinggi * (panjang + lebar);

        double literCat = luasPermukaan / 10;

        double literFinal = Math.ceil(literCat);

        System.out.println("Luas Permukaan : " + luasPermukaan + " meter persegi");
        System.out.println("Liter cat yang dibutuhkan : " + literFinal);

        input.close();
    }
}