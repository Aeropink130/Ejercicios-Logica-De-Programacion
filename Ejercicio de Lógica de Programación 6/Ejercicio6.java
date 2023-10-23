import java.util.Scanner;// Importamos la clase Scanner para poder leer datos por teclado

public class Ejercicio6 { // Clase principal

    // Método estático para poder ser llamado desde el método main
    // Recibe un String (La palabra o frase que queremos invertir) y devuelve un
    // String (el resultado de la frase invertida)
    public static String invertirFrase(String frase) {
        StringBuilder stringBuilder = new StringBuilder(frase);// Creamos un objeto de tipo StringBuilder y le pasamos
                                                               // la frase que queremos invertir
        stringBuilder.reverse();// Invertimos la frase
        return stringBuilder.toString();// Devolvemos la frase invertida en formato String
    }

    public static void main(String args[]) {

        Scanner leer = new Scanner(System.in);// Creamos un objeto de tipo Scanner para poder leer datos dados por el
                                              // usuario
        System.out.println("Escribe la palabra o frase que seseas invertir");
        String frase = leer.nextLine();// Leemos la frase que queremos invertir
        leer.close();// Cerramos el objeto de tipo Scanner
        String fraseInvertida = invertirFrase(frase);// Llamamos al método invertir frase y le pasamos el String que el
                                                     // usuario escribió
        System.out.println(fraseInvertida);// Imprimimos la frase invertida
    }
}