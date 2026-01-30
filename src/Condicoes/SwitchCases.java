package Condicoes;

import java.util.Scanner;

public class SwitchCases {
    static void main() {

        /*
        Switch cases que servem para gerar
        casos especificos
        Objetivo: Pedir para o usuário escolher
        entre os ninjas
        */

        // Abrindo a caixa
        Scanner caixaDeTexto = new Scanner(System.in);

        System.out.println("Escolha um personagem");
        System.out.println("1 - Kakashi Hatake");
        System.out.println("2 - Obito Uchiha");
        System.out.println("3 - Rin Nohara");

        // Pedir para o usuário escolher uma das opções

        int escolha = caixaDeTexto.nextInt();

        System.out.println("Você digitou o número: " + escolha);

        // Reação ao escolher um personagem
        switch (escolha) {
            // Defino o primeiro caso, caso seja o número 1
            case 1:
                System.out.println("Você escolheu Kakashi Hatake, O ninja copiador");
                break;
            case 2:
                System.out.println("Você escolheu Obito Uchiha, O tobi mascarado");
                break;
            case 3:
                System.out.println("Você escolheu Rin Nohara, A ninja médica");
                break;
            default:
                System.out.println("Você digitou uma opção inválida, tente novamente.");
        }




        // Fechando a caixa
        caixaDeTexto.close();

    }

}
