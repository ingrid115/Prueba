public class Ejercicio1 {
    public static void main(String[] args) {
        var x = 5;
        boolean y;

        System.out.println("¿El número es par?");

        if(x%2 == 0){
            y = true;
        }else{
            y = false;
        }
        System.out.println("El resultado es "+ y);
    }
}