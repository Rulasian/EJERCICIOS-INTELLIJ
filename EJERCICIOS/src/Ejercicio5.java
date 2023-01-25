import java.util.Scanner;
public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int total = 0;
        int num = 0;

        for (int a=0; a<10; a++) {
            System.out.println("Introduce un Número:");
            num = sc.nextInt();
            total = total + num;
        }

        System.out.println("La suma es: " + total);
    }
}
