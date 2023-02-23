import java.util.Scanner;

public class Ejercicio2Examen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;

        do {
            System.out.println("Introduzca un número entre 1 y 3999: ");
            n1 = sc.nextInt();
        } while (n1 > 3999 || n1 < 0);

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

        //CIENTOS//
        switch (cientos) {
            case 1:
                resultado = resultado + "C";
                break;
            case 2:
                resultado = resultado + "CC";
                break;
            case 3:
                resultado = resultado + "CCC";
                break;
            case 4:
                resultado = resultado + "CD";
                break;
            case 5:
                resultado = resultado + "D";
                break;
            case 6:
                resultado = resultado + "DC";
                break;
            case 7:
                resultado = resultado + "DCC";
                break;
            case 8:
                resultado = resultado + "DCCC";
                break;
            case 9:
                resultado = resultado + "CM";
                break;
        }

        //DECENAS//
        switch (decenas) {
            case 1:
                resultado = resultado + "X";
                break;
            case 2:
                resultado = resultado + "XX";
                break;
            case 3:
                resultado = resultado + "XXX";
                break;
            case 4:
                resultado = resultado + "XL";
                break;
            case 5:
                resultado = resultado + "L";
                break;
            case 6:
                resultado = resultado + "LX";
                break;
            case 7:
                resultado = resultado + "LXX";
                break;
            case 8:
                resultado = resultado + "LXXX";
                break;
            case 9:
                resultado = resultado + "XC";
                break;
        }

        //UNIDADES//
        switch (unidades) {
            case 1:
                resultado = resultado + "I";
                break;
            case 2:
                resultado = resultado + "II";
                break;
            case 3:
                resultado = resultado + "III";
                break;
            case 4:
                resultado = resultado + "IV";
                break;
            case 5:
                resultado = resultado + "V";
                break;
            case 6:
                resultado = resultado + "VI";
                break;
            case 7:
                resultado = resultado + "VII";
                break;
            case 8:
                resultado = resultado + "VIII";
                break;
            case 9:
                resultado = resultado + "IX";
                break;
        }

        System.out.println(n1+" En romano es: "+resultado);
        return resultado;
    }

}