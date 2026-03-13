package NivelBasico.Arrays;

public class Array2D {

    static void main(String[] args) {

        String[][] ninjasEAldeias = new String[3][3];

        ninjasEAldeias[0][0] = "Vila da folha";
        ninjasEAldeias[0][1] = "Naruto Uzumaki";
        ninjasEAldeias[0][2] = "Sasuke Uchiha";

        ninjasEAldeias[1][0] = "Vila da névoa";
        ninjasEAldeias[1][1] = "Zabuza Momochi";
        ninjasEAldeias[1][2] = "Haku";

        ninjasEAldeias[2][0] = "Vila da nuvem";
        ninjasEAldeias[2][1] = "Killer Bee";
        ninjasEAldeias[2][2] = "Raikage";

        for (int i = 0; i < ninjasEAldeias.length; i++) {

            System.out.println("Aldeia: " + ninjasEAldeias[i][0] + " - 1º Ninja: " + ninjasEAldeias[i][1] + " - 2º Ninja: " + ninjasEAldeias[i][2]);

        }

    }

}
