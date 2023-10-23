import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int minutosTotales = 0;
        final int finDeSemana = 6660;
        int minutosRestantes = 0;

        // Pido el dia de la semana al usuario
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe el dia de la semana");
        String dia = leer.nextLine().toLowerCase();
        // Pido la hora al usuario
        System.out.println("Escribe la hora");
        int hora = leer.nextInt();
        // Pido los minutos al usuario
        System.out.println("Escribe los minutos");
        int minutos = leer.nextInt();
        leer.close();

        // Creo un switch para convertir dias de la semana en minutos
        switch (dia) {
            case "lunes":
                minutosTotales = 0;
                break;
            case "martes":
                minutosTotales = 1440;
                break;
            case "miercoles":
                minutosTotales = 2880;
                break;
            case "jueves":
                minutosTotales = 4320;
                break;
            case "viernes":
                minutosTotales = 5760;
                break;
        }

        minutosTotales = minutosTotales + (hora * 60) + minutos;
        minutosRestantes = finDeSemana - minutosTotales;

        System.out.println("Quedan " + minutosRestantes + " minutos para el fin de semana");

    }
}