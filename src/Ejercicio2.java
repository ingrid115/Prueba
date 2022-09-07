import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Ingrese el 1er número : ");
        var num1 = scanner.nextInt();

        System.out.print("Ingrese el 1er número : ");
        var num8 = scanner.nextInt();

        System.out.print("Ingrese el 2do número : ");
        var num2 = scanner.nextInt();

        System.out.print("Ingrese el 3er número : ");
        var num3 = scanner.nextInt();

        System.out.print("Ingrese el 4to número : ");
        var num4 = scanner.nextInt();

        System.out.print("Ingrese el 5to número : ");
        var num5 = scanner.nextInt();

        System.out.print("Ingrese el 6to número : ");
        var num6 = scanner.nextInt();
        scanner.close();

        var concatenar = String.valueOf(num1) + String.valueOf(num2) + String.valueOf(num3) + String.valueOf(num4) +
                String.valueOf(num5) + String.valueOf(num6);
        System.out.println("El resultado es " + concatenar);
    }
}