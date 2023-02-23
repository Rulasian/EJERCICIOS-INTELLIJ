import java.util.Scanner;

public class Ejercicio1Examen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;

        System.out.print("Introduzca un número: ");
        n1 = sc.nextInt();
        System.out.print("Introduzca otro número: ");
        n2 = sc.nextInt();

        if (n1 % 10 == n2 % 10) {
            System.out.println("Los dos números acaban igual");
        } else {
            System.out.println("Los dos números acaban de forma distinta");
        }
    }
}