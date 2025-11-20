package Condicoes;

public class IfeElse {

    static void main() {

        String nome = "Naruto Uzumaki";
        int idade = 26;
        boolean hokage = false;
        short numeroDeMissoes = 30;
        String rank;

        /*
        Rank: Academy, Genin, Chuunin, Jounin, Hokage
         */


        if (numeroDeMissoes >= 10 && numeroDeMissoes < 15 && idade >= 10) {
            rank = "Genin";
            System.out.println("Naruto está pronto para ser Genin");
            System.out.println("Rank= " + rank);
        } else if (numeroDeMissoes >= 15 && numeroDeMissoes < 20 && idade >=14) {
            rank = "Chuunin";
            System.out.println("Naruto está pronto para ser Chunnin");
            System.out.println("Rank= " + rank);

        } else if (numeroDeMissoes >= 20 && numeroDeMissoes < 25 && idade >= 18) {
            rank = "Jouunin";
            System.out.println("Naruto está pronto para ser Jounin");
            System.out.println("Rank= " + rank);
        } else if (numeroDeMissoes >= 25 && idade >= 21) {
            rank = "Hokage";
            System.out.println("Naruto está pronto para ser Hokage");
            System.out.println("Rank= " + rank);
        }
        else {
            rank = "Academy";
            System.out.println("Naruto ainda está muito novo, vá para escola estudar");
            System.out.println("Rank= " + rank);

        }



    }

}
