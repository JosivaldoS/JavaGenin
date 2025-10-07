package Desafios;

public class Ninjas {

    static void main(String[] args) {

        // Ranks da missão por ordem: S, A, B, C e D.


        // Ninja 1
        String nomeNinja1 = "Kakashi";
        int idadeNinja1 = 14;
        String missao1 = "Se tornar genin";
        char dificuldadeMissao1 = 'A';
        boolean statusConclusao1 = false;

        // Verificar nivel da missao e idade do ninja

        if (idadeNinja1 < 15) {
            if (dificuldadeMissao1 == 'C' || dificuldadeMissao1 == 'D'){
                statusConclusao1 = true;
            } else {
                statusConclusao1 = false;
            }

        } else {
            statusConclusao1 = true;
        }

        // Ninja 2
        String nomeNinja2 = "Obito";
        int idadeNinja2 = 13;
        String missao2 = "Ajudar a senhora com as sacolas";
        char dificuldadeMissao2 = 'S';
        boolean statusConclusao2 = false;

        if (idadeNinja2 < 15) {
            if (dificuldadeMissao2 == 'C' || dificuldadeMissao2 == 'D'){
                statusConclusao2 = true;
            } else {
                statusConclusao2 = false;
            }
        } else {
            statusConclusao2 = true;
        }

        // Ninja 3
        String nomeNinja3 = "Rin";
        int idadeNinja3 = 12;
        String missao3 = "Escoltar um aldeão";
        char dificuldadeMissao3 = 'C';
        boolean statusConclusao3 = false;

        if (idadeNinja3 < 15) {
            if (dificuldadeMissao3 == 'C' || dificuldadeMissao3 == 'D'){
                statusConclusao3 = true;
            } else {
                statusConclusao3 = false;
            }
        } else {
            statusConclusao3 = true;
        }

        System.out.println("---------------------------------------");

        System.out.println("Nome do Primeiro Ninja: " + nomeNinja1);
        System.out.println("Idade do Primeiro Ninja: " + idadeNinja1);
        System.out.println("Missão do Primeiro Ninja: " + missao1);
        System.out.println("Dificuldade da missão: " + dificuldadeMissao1);
        System.out.println("Missão concluida? " + statusConclusao1);

        System.out.println("---------------------------------------");

        System.out.println("Nome do Segundo Ninja: " + nomeNinja2);
        System.out.println("Idade do Segundo Ninja: " + idadeNinja2);
        System.out.println("Missão do Segundo Ninja: " + missao2);
        System.out.println("Dificuldade da missão: " + dificuldadeMissao2);
        System.out.println("Missão concluída? " + statusConclusao2);

        System.out.println("---------------------------------------");

        System.out.println("Nome do Terceiro Ninja: " + nomeNinja3);
        System.out.println("Idade do Terceiro Ninja: " + idadeNinja3);
        System.out.println("Missao do Terceiro Ninja: " + missao3);
        System.out.println("Dificuldade da missão: " + dificuldadeMissao3);
        System.out.println("Missão concluída? " + statusConclusao3);

        System.out.println("---------------------------------------");


    }
}
