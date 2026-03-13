package Desafios.Desafio04;

public class main {

    static void main(String[] args) {

        /*
            Crie um programa em Java para gerenciar informações de ninjas
            utilizando herança. Desenvolva uma classe base chama Ninja e uma
            Subclasse chamada Uchiha

            1. Na classe Ninja, defina os atributos nome(String), idade(int),
            missão(String), nivelDificuldade(String) e statusMissao(String).
            Adicione um metodo chamado mostrarInformacoes() que exibe todos
            esses atributos

            2. Crie uma subclasse chamada Uchiha que herda de Ninja. Adicione
            um atributo adicional habilidadeEspecial(String) e um metodo
            chamado mostrarHabilidadeEspecial() para exibir a abilidade especial
            do ninja.

            3. Sobrescreva o metodo mostrarInformacoes() na classe Uchiha para
            incluir tambem a habilidade especial
         */

        Ninja Naruto = new Ninja();

        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 18;
        Naruto.missao = "Defender Konoha do Pain";
        Naruto. nivelDificuldade = "S+";
        Naruto.statusMissao = "Em andamento";

        Naruto.mostrarInformacoes();

        Uchiha Sasuke = new Uchiha();

        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 19;
        Sasuke.missao = "Vingar o clã Uchiha";
        Sasuke.nivelDificuldade = "S+";
        Sasuke.statusMissao = "Em andamento";
        Sasuke.habilidadeEspecial = "Sharingan";

        Sasuke.mostrarInformacoes();

    }

}
