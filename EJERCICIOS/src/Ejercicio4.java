import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cont=0;
        int total=0;
        int num = 0;
        do {
            System.out.println("Introduce un número: ");
            num = sc.nextInt();
            cont++;
            total=total+num;

        }while(cont<10);
        System.out.println("La suma total es: "+total);

    }
}
