import java.util.Scanner;
public class Ejercicio3Examen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, apoyo, resto;
        int inverso = 0;

        do {
            System.out.print("Introduzca un número mayor o igual de 10: ");
            n1 = sc.nextInt();
        }while(n1<10);

        apoyo = n1;

        while (apoyo!=0){
            resto = apoyo % 10;
            apoyo = apoyo/10;
            inverso = (inverso * 10) + resto;
        }

            if (inverso == n1){
                System.out.println("El número es capicúa");
            }
            else{
                System.out.println("El número no es capicúa");
            }
    }
}
