package Desafios.Desafio4;

public class Ninja_Basico implements Ninja{

    String nome;
    int idade;
    String habilidade;
    Tipo_habilidade tipo_habilidade;


    public Ninja_Basico (String nome, int idade, String habilidade, Tipo_habilidade tipo_habilidade){
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.tipo_habilidade = tipo_habilidade;
    }


    @Override
    public void mostrar_informacoes(){
        System.out.println("===========================" + "\nMeu nome é: " + nome + "\nMinha idade é: " + idade + "\nMinha habilidade é: " + habilidade);
    }

    @Override
    public void executar_habilidade(){
        System.out.println(nome + " está usando sua habilidade: " + habilidade + "\n===========================");
    }



}
