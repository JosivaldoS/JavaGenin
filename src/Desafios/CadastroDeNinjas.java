package Desafios;

import java.util.Scanner;

public class CadastroDeNinjas {
    static void main(String[] args) {

        /*
        Você foi encarregado pelo Hokage para gerenciar o cadastro de ninjas na Vila da Folha. Sua missão é criar um
        sistema simples em Java para cadastrar novos ninjas e listar todos os ninjas cadastrados

        Topicos a serem utilizados:
        -> NivelBasico.Arrays: Para armazenas os nomes dos ninjas
        -> Switch Cases: Para implementar um menu interativo
        -> Loops: Para navegar pelas opções do menu e iterar sobre os ninjas cadastrados
        -> Condicionais: Para controlar a execução das opções do menu e validar o número de ninjas cadastrados
         */


        int opcao = 0;
        String novoNinja;
        String[] ninjas = new String[0];

        // Inicializando o Scanner para o usuário
        Scanner caixaDeTexto = new Scanner(System.in);

        while (opcao != 1) {
            // Menu
            System.out.println("------------------------------");
            System.out.println("Selecione uma das opções abaixo");
            System.out.println("[1] Parar o programa");
            System.out.println("[2] Cadastrar novos ninjas");
            System.out.println("[3] Listar todos os ninjas");
            System.out.println("Digite uma opção:");

            opcao = caixaDeTexto.nextInt();
            caixaDeTexto.nextLine();
            switch (opcao) {
                case 1:
                    // Fechando o Scanner
                    System.out.println("Finalizando o sistema");
                    System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
                    caixaDeTexto.close();

                    break;
                case 2:
                    // Cadastrar novos ninjas
                    System.out.println("==============================");
                    System.out.println("Cadastrando novos ninjas!");
                    System.out.println("Digite o nome do ninja a ser cadastrado: ");

                    // Entrada de dados
                    novoNinja = caixaDeTexto.nextLine();

                    // Crio um novo array temporário para salvar os ninjas, limpar o array e adicionar novamente com
                    // os ninjas desejados
                    String[] arrayTemporario = new String[ninjas.length];
                    for (int i = 0; i < ninjas.length; i++){
                        arrayTemporario[i] = ninjas[i];
                    }

                    // Limpo a lista e adiciono mais um espaço no array
                    ninjas = new String[ninjas.length + 1];

                    // Adicionando os ninjas antigos
                    for (int i = 0; i < arrayTemporario.length; i++){
                        ninjas[i] = arrayTemporario[i];
                    }
                    // Adicionando o novoNinja
                    ninjas[arrayTemporario.length] = novoNinja;

                    break;
                case 3:

                    // Se não tiver nenhum ninja cadastrado
                    if (ninjas.length == 0){
                        System.out.println("Ainda não foi cadastrado nenhum ninja!");

                    } else {
                        // Listar todos os ninjas
                        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
                        System.out.println("Listando todos os ninjas");
                        for (int i = 0; i < ninjas.length; i++){
                            System.out.println((i+1) + "º Ninja " + ninjas[i]);
                        }
                    }
                    break;
                default:
                    System.out.println("Essa opção não é válida");
                    break;

            }


        }



    }
}
