import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner celcius = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en Grados Celcius");
        double temperaturaGradosCelcius = celcius.nextDouble();
        double tenperaturaEnGradosFarenheit = (temperaturaGradosCelcius * 1.8) + 32;
        System.out.println(" La temperatura en Grados Farenheit es : " + (Math.round(tenperaturaEnGradosFarenheit * 100.0) / 100.0) + "°F");
        int  temperaturaFinalGradosFarenheit = (int) tenperaturaEnGradosFarenheit;
        System.out.println(" La temperatura en Grados Farenheit es : " + temperaturaFinalGradosFarenheit + "°F");
    }
}