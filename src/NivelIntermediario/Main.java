package NivelIntermediario;

public class Main {

    static void main(String[] args) {

        // Criar ninja Naruto
        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 18;
        Naruto.aldeia = "Aldeia da folha";

        Naruto.ativarSharingan();

        // Criar ninja Sasuke
        Ninja Sasuke = new Ninja();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 19;
        Sasuke.aldeia = "Aldeia da folha";
        Sasuke.ninjaUchiha = true;

        Sasuke.ativarSharingan();
        String resultado = Sasuke.EuSouUmNinja();
        System.out.println(resultado);

        int quantoTempoFalta = Sasuke.anosParaSerHokage(30);
        System.out.println("Você tem " + Sasuke.idade + " anos. Falta " + quantoTempoFalta + " anos para você poder ser um Hokage");


        // Criar ninja Sakura
        Ninja Sakura = new Ninja();
        Sakura.nome = "Sakura Haruno";
        Sakura.idade = 20;
        Sakura.aldeia = "Aldeia da folha";



    }

}
