package Desafios.Desafio04;

public class Ninja {

    String nome;
    int idade;
    String missao;
    String nivelDificuldade;
    String statusMissao;

    public void mostrarInformacoes() {
        System.out.println("x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-");
        System.out.println("O nome do ninja é: " + nome);
        System.out.println("A idade é: " + idade);
        System.out.println("Sua missão é: " + missao);
        System.out.println("A dificuldade dessa missão é: " + nivelDificuldade);
        System.out.println("Status da missão: " + statusMissao);
    }

}
