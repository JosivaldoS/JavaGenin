package TiposPrimitivos;

public class DadosNaoPrimitivos {

    static void main(String[] args) {

        /*
        * Dados não primitivos: String, Array, Class, enum
        * Objetivo: Criar um ninja, e atribuir métodos a ele.
         */

        String nome = "Kakashi Hatake";
        String nomeEmCaixaAlta = nome.toUpperCase(); // Irá transformar tudo em CAPSLOCK
        System.out.println("Nome em maiúscula: " + nomeEmCaixaAlta);
        System.out.println("Nome: " + nome);

        String testeMetodos = nome.intern();

        String aldeia = "Aldeia da folha";
        String aldeiaEmCaixaBaixa= aldeia.toLowerCase();

        System.out.println("Aldeia: " + aldeia);
        System.out.println("Aldeia Em Caixa Baixa: " + aldeiaEmCaixaBaixa);

        System.out.println(testeMetodos);

    }

}
