import java.util.Scanner;
public class Ejercicio10 {

        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            String respuesta = "tema";
            System.out.println("¿Sabes del tema? Responde con si o no");
            respuesta = sc.nextLine();

            if (respuesta.equals("si")) {
                System.out.println("Estas informado, habla.");
            } else if (respuesta.equals("no")){
                do {
                    System.out.println("No sabes un carajo, infórmate");
                    System.out.println("...................");
                    System.out.println("¿Te has informado? Responde con si o no");
                    respuesta = sc.nextLine();
                    respuesta = respuesta.toLowerCase();

                } while (respuesta.equals("no"));

                System.out.println("Lo has entendido, habla.");
            }
        }
    }
