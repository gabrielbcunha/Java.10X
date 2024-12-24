package Desafios.Desafio3;

public class uchiha extends ninja{

    String habilidade_especial;

    public void mostrar_habilidade(){
        System.out.println("Essa é a habilidade especial do Uchiha: " + habilidade_especial);
    }

    public void mostrar_inf(){
        System.out.println("---------------------");
        System.out.println("O NOME do ninja é: " + nome + "\n A IDADE do ninja é: " + idade + "\n A MISSÃO é: " + missao + "\n O NIVEL da MISSÃO é: " + nivel_missao + "\n O STATUS da MISSÃO : " + status_missao
                + "\n Essa é a habilidade especial do Ninja: " + habilidade_especial);
        System.out.println("---------------------");
    }



}
