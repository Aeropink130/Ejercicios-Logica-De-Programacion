import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Map<String, String> diccionario = new HashMap<String, String>();
        diccionario.put("hola", "Hello");
        diccionario.put("adios", "Goodbye");
        diccionario.put("perro", "Dog");
        diccionario.put("gato", "Cat");
        diccionario.put("casa", "House");
        diccionario.put("rojo", "Red");
        diccionario.put("azul", "Blue");
        diccionario.put("verde", "Green");
        diccionario.put("amarillo", "Yellow");
        diccionario.put("blanco", "White");
        diccionario.put("amigo", "Friend");
        diccionario.put("comida", "Food");
        diccionario.put("agua", "Water");
        diccionario.put("libro", "Book");
        diccionario.put("trabajo", "Work");
        diccionario.put("familia", "Family");
        diccionario.put("tiempo", "Time");
        diccionario.put("juego", "Game");
        diccionario.put("ciudad", "City");
        diccionario.put("feliz", "Happy");

        System.out.println("Ingresa una palabra en español para buscarla en el diccionario");
        try {
            String palabra = leer.nextLine().toLowerCase();
            if (diccionario.containsKey(palabra)) {
                System.out.println(diccionario.get(palabra));
            } else {
                System.out.println("La palabra no se encuentra en el diccionario");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            leer.close();
        }
    }
}
