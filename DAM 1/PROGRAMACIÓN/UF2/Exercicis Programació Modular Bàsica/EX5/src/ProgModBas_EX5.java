import java.util.Arrays;
import java.util.Scanner;

public class ProgModBas_EX5
{
    // 5. (ordena) Fer una funció que donats tres nombres ens els ordeni de manera creixent.

    public static void main (String[] args)
    {

    imprimeResultado(ordenaDatos(ingresoDatos()));
    }

    public static int[] ingresoDatos ()
    {
        Scanner sc = new Scanner(System.in);

        int [] userNums = new int[3];

        System.out.println("Por favor ingrese tres numeros: ");

        for(int i = 0; i < userNums.length; i++)
        {
            userNums[i] = sc.nextInt();
        }

        return userNums;


    }

    public static int[] ordenaDatos(int[]userNums) {
        int menor;

        Arrays.sort(userNums);

        return userNums;

    }

    public static void imprimeResultado(int[]userNums)
    {
        System.out.println("" +
                "");
        System.out.println("------------------");
        System.out.println("Array ordenada de Menor a Mayor: ");
        System.out.println("------------------");

        for(int i = 0; i < userNums.length; i++)
        {
            System.out.println(userNums[i]);
        }
    }

}
