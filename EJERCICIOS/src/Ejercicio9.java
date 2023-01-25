import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
       int num=0;
    Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la nota: ");
        num = sc.nextInt();

		if(num<5)
            System.out.println("Suspenso");
		else if(num==5)
            System.out.println("Aprobado");
		else if(num==6)
            System.out.println("Bien");
		else if(num==7)
            System.out.println("notable bajo");
		else if(num==8)
            System.out.println("notable alto");
		else if(num==9)
            System.out.println("Sobresaliente");
        else if(num==10)
            System.out.println("Matrícula de honor");
		else System.out.println("Notaza");
    }
}

