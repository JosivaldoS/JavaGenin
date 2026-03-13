package NivelIntermediario;

public class Main {

    static void main(String[] args) {

        // Criar ninja Naruto
        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 18;
        Naruto.aldeia = "Aldeia da folha";

        System.out.println(Naruto.nome + Naruto.idade + Naruto.aldeia);

        // Criar ninja Sasuke
        Ninja Sasuke = new Ninja();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 19;
        Sasuke.aldeia = "Aldeia da folha";

        System.out.println(Sasuke.nome + Sasuke.idade + Sasuke.aldeia);

        // Criar ninja Sakura
        Ninja Sakura = new Ninja();
        Sakura.nome = "Sakura Haruno";
        Sakura.idade = 20;
        Sakura.aldeia = "Aldeia da folha";

        System.out.println(Sakura.nome + Sakura.idade + Sakura.aldeia);



    }

}
