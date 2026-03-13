package Desafios.Desafio04;

public class Uchiha extends Ninja{

    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial() {
        System.out.println("O Sharingan foi ativado");
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Sua habilidade especial é: " + habilidadeEspecial);
        mostrarHabilidadeEspecial();
    }
}
