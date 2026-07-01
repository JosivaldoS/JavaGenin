package NivelIntermediario.Construtores;

public class Main {

    static void main() {

        Hokage Tobirama = new Hokage();
        Tobirama.idade = 45;
        System.out.println(Tobirama.idade);

        Hokage Naruto = new Hokage("Naruto Uzumaki", 22, true);
        System.out.println(Naruto.nome);

    }


}
