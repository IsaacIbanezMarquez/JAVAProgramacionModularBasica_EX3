import java.util.InputMismatchException;
import java.util.Scanner;

public class Simulador_Electoral_Ley_Homdt
{

    public static void main(String[] args)
    {
        menu();

    int[] partidos = recibeDatos();

        System.out.println("RECIBEDATT ");

        for(int i = 0; i < partidos.length;i++)
        {
            System.out.println(partidos[i]);
        }

    }

    public static void menu ()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al Simulador Electoral acorde a la ley de Hondt.");

        System.out.println("------------------------------------------------------------");


        System.out.println("1. Iniciar Simulación.(Parámetros Predefinidos)");

        System.out.println("2. Iniciar Simulación Personalizada. (Parámetros Opcionanles)");

        System.out.println("3. Salir.");

        int option = sc.nextInt();

        try {

            switch (option) {
                case 1:
                System.out.println("Iniciando Simulación Predefinida...");
                System.out.println("------------------------------------------------------------");
                System.out.println("" +
                        "");

                recibeDatos();

                break;


                case 2:
                    System.out.println("Iniciando Simulación Personalizada...");
                    System.out.println("------------------------------------------------------------");
                    System.out.println("" +
                            "");

                    break;
                case 3:
                    break;
                default:
                    System.out.println("Escoja una de las opciones, del 1 al 3");
            }

        } catch (InputMismatchException e) {
            System.out.println("Debes insertar un numero");
            sc.next();
        }


    }

    public  static int[] recibeDatos()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Indique cuantos Escaños va a haber: ");

        int escaños = sc.nextInt();

        System.out.println("Indique cuántos partidos va a haber: ");

        int numeroPartidos = sc.nextInt();

        int [] arrayPartidos = new int[numeroPartidos];

        System.out.println("Indique el numero de votos de cada partido: ");

        for(int i = 0; i < arrayPartidos.length; i++)
        {
            System.out.println("Ingresa el numero de votos del Partido " + (i+1));
            arrayPartidos[i] = sc.nextInt();
        }

        for(int i = 0; i< arrayPartidos.length;i++)
        {
            System.out.println("Partido " + (i+1) + ": " + arrayPartidos[i] + " votos") ;
        }

        return arrayPartidos;

    }




}