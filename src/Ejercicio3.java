public class Ejercicio3 {
    public static void main(String[] args) {
        var a = 12.1;
        var b = 2.4;
        var c = 2.23;
        var x = 1;
        var y = 2;
        var z = 3;

        var concatenar = String.valueOf(a) + String.valueOf(b) + String.valueOf(c);
        var concatenarDI = concatenar + String.valueOf(x) + String.valueOf(y) + String.valueOf(z);

        System.out.println("El resultado es " + concatenarDI);
    }
}