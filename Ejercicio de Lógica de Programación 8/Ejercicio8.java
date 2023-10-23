import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numerosNP[] = new int[10];
        int numerosPrimos[] = new int[10];
        int numeros[] = new int[10];
        int contadorPrimos = 0;
        int contadorNP = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número: ");
            int aux = leer.nextInt();
            if (esPrimo(aux)) {
                numerosPrimos[contadorPrimos] = aux;
                contadorPrimos++;
            } else {
                numerosNP[contadorNP] = aux;
                contadorNP++;
            }
        }

        leer.close();

        for (int i = 0; i < contadorPrimos; i++) {
            numeros[i] = numerosPrimos[i];
        }

        contadorNP = 0;
        for (int i = contadorPrimos; i < 10; i++) {
            numeros[i] = numerosNP[contadorNP];
            contadorNP++;
        }

        System.out.println("Números ingresados: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        if (numero <= 3) {
            return true;
        }
        if (numero % 2 == 0 || numero % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
