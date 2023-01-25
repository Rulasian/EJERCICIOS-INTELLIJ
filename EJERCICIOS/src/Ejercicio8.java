import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        int num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una nota: ");
        num = sc.nextInt();

        switch (num) {
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7:
                System.out.println("Notable bajo");
                break;
            case 8:
                System.out.println("Notable alto");
                break;
            case 9:
                System.out.println("Sobresaliente");
                break;
            case 10:
                System.out.println("Matricula de honor");
                break;
            default:
                if (num < 5)
                    System.out.println("Suspenso");
                else
                    System.out.println("Notaza");
        }
    }
}

