package Desafios.Desafio4;

public class Ninja_Avancado extends Ninja_Basico implements Ninja{

    String especialidade;

    public Ninja_Avancado(String nome, int idade, String habilidade, String especialidade, Tipo_habilidade tipoHabilidade) {
        super(nome, idade, habilidade, tipoHabilidade);
        this.especialidade = especialidade;
    }

    @Override
    public void mostrar_informacoes(){
        System.out.println("===========================" + "\nMeu nome é: " + nome + "\nMinha idade é: " + idade + "\nMinha habilidade é: " + habilidade + "\nMinha especialidade é: " + especialidade + "\n===========================");
    }

    @Override
    public void executar_habilidade(){
        System.out.println(nome + " está usando sua habilidade: " + habilidade );
    }

    public void setEspecialidade(){
        System.out.println("O ninja " + nome + " tem como sua especialidade: " + especialidade + "\n===========================");
    }

}
