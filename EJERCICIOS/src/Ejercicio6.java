import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = 0;

        System.out.println("Introduce un Número: ");
        num = sc.nextInt();

        if (num == 1)
            System.out.println("Lunes");
        else if (num == 2)
            System.out.println("Martes");
        else if (num == 3)
            System.out.println("Miércoles");
        else if (num == 4)
            System.out.println("Jueves");
        else if (num == 5)
            System.out.println("Viernes");
        else if (num == 6)
            System.out.println("Sábado");
        else if (num == 7)
            System.out.println("Domingo");
        else
            System.out.println("Número no valido");

    }
}
