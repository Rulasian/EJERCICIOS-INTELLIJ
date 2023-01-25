import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {

        int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        n1 = sc.nextInt();

        System.out.println("Introduce otro número: ");
        n2 = sc.nextInt();

        int n3 = n1 + n2;

        System.out.println("La suma de los números es: "+n3);

    }
}