package Desafios.Desafio3;

public class ninja {

    String nome;
    int idade;
    String missao;
    String nivel_missao;
    String status_missao;

    public void mostrar_inf(){
        System.out.println("\nO NOME do ninja é: " + nome + "\n A IDADE do ninja é: " + idade + "\n, a MISSÃO é: " + missao + "\n, o NIVEL da MISSÃO é: " + nivel_missao + "\n, o STATUS da MISSÃO : " + status_missao);
    }

    public void mostrar_nom(){
        System.out.println("Ninja: " + nome);
    }
}
