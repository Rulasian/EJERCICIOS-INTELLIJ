import java.util.Scanner;

public class Ejercicio4Examen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;

        do {
            System.out.println("Introduzca un número entre 1 y 3999: ");
            n1 = sc.nextInt();
        } while (n1 > 3999 || n1 < 0);

        System.out.println(n1+" En romano es: "+convertirANumerosRomanos(n1));
    }

    public static String convertirANumerosRomanos(int n1) {

        String resultado = "";
        int miles, cientos, decenas, unidades;
        int apoyo, a;

        apoyo = n1;
        miles = apoyo / 1000;
        apoyo = apoyo % 1000;

        cientos = apoyo / 100;
        apoyo = apoyo % 100;

        decenas = apoyo / 10;
        apoyo = apoyo % 10;

        unidades = apoyo;

        //MILLARES//
        for (a = 1; a <= miles; a++) {
            resultado = resultado + "M";
        }

        //CENTENAS//
        if (cientos == 9) {
            resultado = resultado + "CM";
        } else if (cientos >= 5) {
            resultado = resultado + "D";
            for (a = 6; a <= cientos; a++) {
                resultado = resultado + "C";
            }
        } else if (cientos == 4) {
            resultado = resultado + "CD";
        } else {
            for (a = 1; a <= cientos; a++) {
                resultado = resultado + "C";
            }
        }

        //DECENAS//
        if (decenas == 9) {
            resultado = resultado + "XC";
        } else if (decenas >= 5) {
            resultado = resultado + "L";
            for (a = 6; a <= decenas; a++) {
                resultado = resultado + "X";
            }
        } else if (decenas == 4) {
            resultado = resultado + "XL";
        } else {
            for (a = 1; a <= decenas; a++) {
                resultado = resultado + "X";
            }
        }

        //UNIDADES//
        if (unidades == 9) {
            resultado = resultado + "IX";
        } else if (unidades >= 5) {
            resultado = resultado + "V";
            for (a = 6; a <= unidades; a++) {
                resultado = resultado + "I";
            }
        } else if (decenas == 4) {
            resultado = resultado + "IV";
        } else {
            for (a = 1; a <= unidades; a++) {
                resultado = resultado + "I";
            }
        }

        return resultado;
    }
}
