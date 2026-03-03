import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Celcius : ");
        double Celcius = input.nextDouble();

        double fahrenheit = (9.0/5.0 * Celcius) + 32;
        double kelvin = Celcius + 273.15;
        double reamur = 4.0/5.0 * Celcius;

        System.out.println("Fahrenheit : " + fahrenheit);
        System.out.println("Kelvin : " + kelvin);
        System.out.println("Reamur : " + reamur);

        input.close();
    }
}