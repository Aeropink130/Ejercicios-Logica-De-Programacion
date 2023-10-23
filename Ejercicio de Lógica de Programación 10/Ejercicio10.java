
// impotamos las clases necesarias
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        short correctas = 0;// variable para contar las respuestas correctas
        short incorrectas = 0;// variable para contar las respuestas incorrectas
        Scanner leer = new Scanner(System.in);// objeto de tipo tipo Scanner para leer datos por teclado
        Map<String, String> diccionario = new HashMap<String, String>();// objeto de tipo HashMap para almacenar las
                                                                        // palabras en español y su traducción en inglés
        // se agregan las palabras al diccionario en minúsculas
        diccionario.put("hola", "hello");
        diccionario.put("adios", "goodbye");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("casa", "house");
        diccionario.put("rojo", "red");
        diccionario.put("azul", "blue");
        diccionario.put("verde", "green");
        diccionario.put("amarillo", "yellow");
        diccionario.put("blanco", "white");
        diccionario.put("amigo", "friend");
        diccionario.put("comida", "food");
        diccionario.put("agua", "water");
        diccionario.put("libro", "book");
        diccionario.put("trabajo", "work");
        diccionario.put("familia", "family");
        diccionario.put("tiempo", "time");
        diccionario.put("juego", "game");
        diccionario.put("ciudad", "city");
        diccionario.put("feliz", "happy");

        for (Map.Entry<String, String> entry : diccionario.entrySet()) {// ciclo for para recorrer el diccionario, se
                                                                        // usa un objeto de tipo Entry para obtener la
                                                                        // clave y el valor de cada elemento
            System.out.println("Traduce la siguiente palabra: " + entry.getKey());// se imprime la palabra en español
            String respuesta = leer.nextLine().toLowerCase();// se lee la respuesta del usuario y se convierte a
                                                             // minúsculas para evitar errores
            if (respuesta.equals(entry.getValue())) {
                System.out.println("Correcto");
                correctas++;// se incrementa el contador de respuestas correctas
            } else {
                System.out.println("Incorrecto");
                incorrectas++;// se incrementa el contador de respuestas incorrectas
            }
        }

        leer.close();// se cierra el objeto de tipo Scanner

        // se imprimen las respuestas correctas e incorrectas
        System.out.println("Respuestas correctas: " + correctas);
        System.out.println("Respuestas incorrectas: " + incorrectas);
    }
}
