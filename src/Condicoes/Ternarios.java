package Condicoes;

public class Ternarios {
    static void main() {
        /*
        Ternários: são utilizados para simplificar o código
        variavel = (condicao) ? valorSeVerdadeiro : valorSeFalso;

         */



        short numeroDeMissoes = 16;
        String nivelDoNinja = (numeroDeMissoes >= 16) ? "Esse ninja já pode ser Hokage" : "Esse ninja não pode ser Hokage";
        System.out.println(nivelDoNinja);
    }
}
