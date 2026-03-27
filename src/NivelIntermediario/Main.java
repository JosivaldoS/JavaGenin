package NivelIntermediario;

public class Main {

    static void main(String[] args) {

        // Criar ninja Naruto
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 18;
        Naruto.aldeia = "Aldeia da folha";
        Naruto.ativarModoSabio();


        // Criar ninja Sasuke
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 19;
        Sasuke.aldeia = "Aldeia da folha";
        Sasuke.ativarSharingan();

        /*
        Sasuke.ninjaUchiha = true;
        Sasuke.ativarSharingan();
        String resultado = Sasuke.EuSouUmNinja();
        System.out.println(resultado);

        int quantoTempoFalta = Sasuke.anosParaSerHokage(30);
        System.out.println("Você tem " + Sasuke.idade + " anos. Falta " + quantoTempoFalta + " anos para você poder ser um Hokage");
         */

        // Criar ninja Sakura
        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.idade = 20;
        Sakura.aldeia = "Aldeia da folha";
        Sakura.ativarCura();

        // Criar ninja Hinata
        Hyuuga Hinata = new Hyuuga();
        Hinata.nome = "Hinata Hyuuga";
        Hinata.idade = 18;
        Hinata.aldeia = "Aldeia da folha";
        Hinata.ativarByakugan();

        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto Hyuga Uzumaki";
        Boruto.idade = 9;
        Boruto.aldeia = "Aldeia da folha";

        Boruto.ativarModoSabio();
        Boruto.AtivarKarma();
        Boruto.AtivarJougan();

    }

}
