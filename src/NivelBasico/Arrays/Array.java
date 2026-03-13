package NivelBasico.Arrays;

import java.util.Arrays;

public class Array {

    static void main() {
        /* Como conseguimos utilizar um sout de um array
        / para imprimirmos todo o array
        e pq aparece aquele erro ao utilizarmos um sout em um array
        [Ljava.lang.String;@54bedef2
        [Ljava.lang.String;@54bedef2
        */

        String[] ninjas = new String[4];
        ninjas[0] = "Kakashi Hatake";
        ninjas[1] = "Obito Uchiha";
        ninjas[2] = "Rin Nohara";
        ninjas[3] = "Minato Uzumaki";

        System.out.println(Arrays.toString(ninjas));

    }

}
