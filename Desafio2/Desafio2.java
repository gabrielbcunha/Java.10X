package Desafios.Desafio2;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
    /*
        Permita ao usuário cadastrar o nome de um ninja.
        Exiba a lista de todos os ninjas cadastrados.
        Imprima os dados: Use System.out.println para mostrar as informações.
        O usuário pode encerrar o programa a qualquer momento.
        Utilize: Arrays; Switch Cases; Loops; Condicionais;
        ->Aumentar a dificuldade: faça uma forma de excluir um ninja
        */

        //Scanner para o usuário inserir dados
        Scanner scanner = new Scanner(System.in);

        //Contadores

        int numeroMaximo = 10; //aqui vai conter o número máximo de ninjas
        int escolha = 0; //aqui vai conter as escolhas do menu temos três então (0; 1; 2)
        int ninjasCadastrados = 0;

        //Array para guardar o nome dos ninjas
        String[] ninjas = new String[numeroMaximo];
        //ao invés de colocarmos diretamente o número, colocamos uma variável para poder usar nos casos

        //menu

        while (escolha != 4) { //enquanto a escolha for diferente de 3 vai rodar
            System.out.println("===== Menu de Cadastro =====");
            System.out.println("Escolha uma Função:");
            System.out.println("1- Cadastrar Ninja");
            System.out.println("2- Mostrar Ninjas Cadastrados");
            System.out.println("3- Excluir Ninja Cadastrado");
            System.out.println("4- Encerrar Sessão");
            escolha = scanner.nextInt();
            scanner.nextLine();//corrige o bug de não rodar a opção 1

            switch (escolha){
                case 1:
                    if(ninjasCadastrados < numeroMaximo){
                        System.out.println("Informe o Nome do Ninja a ser Cadastrado:");
                        String nomeDoNinja = scanner.nextLine();
                        ninjas[ninjasCadastrados] = nomeDoNinja;
                        ninjasCadastrados++;
                        System.out.println("Você adicionou o Ninja " + nomeDoNinja + " com sucesso!");
                        System.out.println("Deseja mais alguma coisa?");
                    }else{
                        System.out.println("Numero máximo de Cadastros atingido");
                        System.out.println("Deseja mais alguma coisa?");
                    }
                    break;

                case 2:
                    System.out.println("Lista de Ninjas Cadastrados");
                    for (int i = 0; i < ninjas.length; i++) {
                        System.out.println(ninjas[i]);
                    }
                    System.out.println("Deseja mais alguma coisa?");
                    break;

                case 3:
                    int excluir = 0;
                    System.out.println("===== Ninjas Cadastrados =====");
                    for (int i = 0; i < ninjas.length; i++) {
                        System.out.println(i + " " + ninjas[i]);
                    }
                    System.out.println("Qual Ninja você deseja Excluir?");
                    excluir = scanner.nextInt();
                    if(excluir < 10){
                        ninjas[excluir] = null;
                    }
                    else{
                        System.out.println("Você não inseriu um Ninja Válido");
                    }
                    break;

                case 4:
                    System.out.println("Obrigado por Utilizar nosso Serviço");
                    System.out.println("Encerrando sessão...");
                    break;

                default:
                    System.out.println("Você inseriu uma opção invalida, tente novamente");
                    break;
            }
        }

        scanner.close(); //Fechando o Scanner

    }
}
