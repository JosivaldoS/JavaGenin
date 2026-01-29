package Condicoes;
import java.util.Scanner;

public class ScannerDoUsuario {
    static void main() {
        /*
        Objetivo: O usuário vai criar um ninja e vamos validar os dados
        */

        Scanner dados = new Scanner(System.in);

        // Recebe o nome do Ninja
        System.out.println("Digite o nome do Ninja: ");
        String nome = dados.nextLine();
        System.out.println("O nome do ninja é: " + nome);

        // Recebe a idade do Ninja
        System.out.println("Digite a idade do Ninja: ");
        int idade = dados.nextInt();
        System.out.println("A idade do ninja é: " + idade);

        if (idade >= 18) {
            System.out.println("O Ninja " + nome + " já é de maior e pode sair em missões fora da vila");
        } else {
            System.out.println("O Ninja " + nome + " ainda é muito novo, ele não pode sair em missões fora da vila");
        }

        dados.close();



    }

}
