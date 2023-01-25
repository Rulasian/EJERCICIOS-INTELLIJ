import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {

        int n1 = 0, n2 = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduce un número: ");
            n1 = sc.nextInt();

            System.out.println("Introduce otro número: ");
            n2 = sc.nextInt();

            if (n1 != n2) {
                System.out.println("Introduzca números iguales");
            }
        }while(n1!=n2);

        System.out.println("Has introducido números iguales");

    }
}
