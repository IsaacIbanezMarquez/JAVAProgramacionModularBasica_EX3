import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Contabilidad_Empresa
{
    // 3) Fes el disseny modular i la seva posterior implementació en Java d'un programa que porti la
    // comptabilitat d'una empresa. L'objectiu és controlar els ingressos i les despeses que hi ha hagut durant
    // un període de temps. El programa té un menú amb les següents opcions:
    //
    //1. Alta d'ingrés
    //
    //2. Alta de despesa
    //
    //3. Mostra resum
    //
    //4. Històric ingressos
    //
    //5. Històric despeses
    //
    //6. Fi
    //
    //L'opció 'Alta d'ingrés': l'usuari introdueixi una nova partida per a l'ingrés.
    //
    //L'opció 'Alta de despesa': l'usuari introdueixi una nova partida per a la despesa.
    //
    //L'opció 'Mostra resum': ens mostra un informe on apareix el total d'ingressos i el total de despeses.
    // A més, en cas que hi hagi més ingressos que despeses ens mostrarà també la següent frase:«L'empresa
    // ha tingut uns beneficis de X euros», on X és la diferència entre ingressos i despeses. En cas que les despeses
    // siguin més grans que els ingressos la frase a mostrar és: «L'empresa ha tingut un dèficit de X euros», on X és
    // la diferència entre les despeses i els ingressos.
    //
    //Les opcions històric ingressos i despeses mostraran un llistat dels ingressos i despeses realitzats
    // respectivament, així com la data exacte de la seva realització.
    //
    //L'opció 'fi' fa que acabi el programa.
    //
    //Usar arrays per a emmagatzemar els ingressos i despeses, així com les dates. Usar la classe LocalDateTime per a representar les dates.



    public static void main(String[] args)
    {
        ArrayList<int[]> ingressos = new ArrayList<int[]>();

        ArrayList<int[]> Despesses = new ArrayList<int[]>();


        menu();

    }


    public static void menu ()
    {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {

            System.out.println("1. Alta d'Ingrés");
            System.out.println("2. Alta de Despesa");
            System.out.println("3. Mostra Resum");
            System.out.println("4. Històric ingressos");
            System.out.println("5. Històric despeses");
            System.out.println("6. Fi");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionat l' opció Alta d'Ingrés");
                        altaIngres()
                        break;
                    case 2:
                        System.out.println("Has seleccionat l' opció Alta de Despesa");
                        break;
                    case 3:
                        System.out.println("Has seleccionat l' opció Mostra Resum");
                        break;
                    case 4:
                        System.out.println("Has seleccionat l' opció Històric ingressos");
                        break;
                    case 5:
                        System.out.println("Has seleccionat l' opció Històric despeses");
                        break;
                    case 6:
                        salir = true;
                        break;
                    default:
                        System.out.println("Només números entre 1 y 6");
                }
            } catch (InputMismatchException e) {
                System.out.println("Has d'insertar un numero");
                sn.next();
            }
        }

    }

    public static void MostraResum()
    {




    }

    public static ArrayList altaIngres(ArrayList ingressos)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueixi l'import de l'ingrés: ");

        int ingres = sc.nextInt();
        ingressos.add(ingres);

        return ingressos;

    }

    public static ArrayList altaDespesa(ArrayList Despesses)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueixi l'import de l'ingrés: ");

        int despesa = sc.nextInt();
        Despesses.add(despesa);

        return Despesses;

    }

    public static void historicIngressos(ArrayList Ingressos)
    {
        for(int i = 0; i < Ingressos.size(); i++)
        {
            System.out.println(Ingressos.get(i));
        }

    }

    public static void historicDespesses(ArrayList Despesses)
    {
        for(int i = 0; i < Despesses.size(); i++)
        {
            System.out.println(Despesses.get(i));
        }
    }
}

























