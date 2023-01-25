import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {

        int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        n1 = sc.nextInt();

        System.out.println("Introduce otro número: ");
        n2 = sc.nextInt();

        if (n1>n2){
            System.out.println("El número mayor es:  "+n1);
        }
        else{
            System.out.println("El número mayor es: "+n2);
        }

    }
}