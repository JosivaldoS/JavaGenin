package NivelBasico.Condicoes;

public class LacosDeRepeticao {
    static void main(String[] args) {

        /*
         Possuimos duas formas de usar um laço de repetição
         while e for
         */

        // While

        int numeroDeClones = 0;
        int numeroMaxDeClones = 20;

        while (numeroDeClones <= numeroMaxDeClones) {
            System.out.println("Kage Bunshin no Jutsu! Numero de clones: " + numeroDeClones);
            numeroDeClones += 1;
        }

        // For

        for (int i = 0; i <= numeroMaxDeClones; i++) {
            System.out.println("Kage Bunshin do Naruto no Jutsu! Numero de clones: " + i);
        }

    }
}
