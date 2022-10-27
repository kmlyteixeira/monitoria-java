import java.util.ArrayList;
import java.util.List;

public class ComparacaoArrays {
    public static void main(String[] args) {
        int[] listaUm = new int[] { 1, 2, 3, 4, 5 };
        int[] listaDois = new int[] { 5, 6, 7, 8, 8 };

        ComparaArrays(listaUm, listaDois);
    }

    public static void ComparaArrays(int[] arrayUm, int[] arrayDois) {

        List<Integer> numerosRepetidos = new ArrayList<Integer>();
        for (int i = 0; i < arrayDois.length; i++) {

            for (int j = 0; j < arrayUm.length; j++) {
                if (arrayDois[i] == arrayUm[j]) {
                    numerosRepetidos.add(arrayDois[i]);
                }
            }
        }

        for (int i = 0; i < arrayUm.length; i++) {
            int contadorUm = 0;

            for (int j = 0; j < arrayUm.length; j++) {
                if (arrayUm[i] == arrayUm[j]) {
                    contadorUm++;
                }
            }

            if (contadorUm > 1) {
                System.out.println("O valor " + arrayDois[i] + " repetiu " + contadorUm + " vezes no Primeiro Array!");
            }
        }

        for (int i = 0; i < arrayDois.length; i++) {
            int contadorDois = 0;

            for (int j = 0; j < arrayDois.length; j++) {
                if (arrayDois[i] == arrayDois[j]) {
                    contadorDois++;
                }
            }
            if (contadorDois > 1) {
                System.out.println("O valor " + arrayDois[i] + " repetiu " + contadorDois + " vezes no Segundo Array!");
            }
        }

        System.out.println("Numeros que se repetem entre os Arrays: " + numerosRepetidos);
    }
}