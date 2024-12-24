package Desafios.Desafio3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero_max_ninjas = 4;
        int numero_cad_ninjas = 0;
        int esc = 0;
        int casos;

        String nova_habilidade0;
        String nova_habilidade1;
        String nova_habilidade2;
        String nova_habilidade3;

        uchiha[] uchihas = new uchiha[numero_max_ninjas];

        while (esc != 4){

            System.out.println("|--------Cadastro de Ninjas--------|");
            System.out.println("1 - Cadastrar Ninja");
            System.out.println("2 - Modificar Habilidade especial");
            System.out.println("3 - Mostrar Ninjas Cadastrados");
            System.out.println("4 - Encerrar programa");
            esc = scanner.nextInt();

            switch (esc){
                case 1: //cadastrar ninja
                    if(numero_cad_ninjas < numero_max_ninjas){
                        uchiha novo_ninja = new uchiha();
                        uchihas[numero_cad_ninjas] = novo_ninja;
                        numero_cad_ninjas++;

                        System.out.println("Insira o NOME do Ninja:");
                        scanner.nextLine();
                        novo_ninja.nome = scanner.nextLine();

                        System.out.println("Insira a IDADE do Ninja:");
                        novo_ninja.idade = scanner.nextInt();

                        System.out.println("Insira a MISSÃO do Ninja:");
                        scanner.nextLine();
                        novo_ninja.missao = scanner.nextLine();

                        System.out.println("Insira o NIVEL DA MISSÃO do Ninja:");
                        novo_ninja.nivel_missao = scanner.nextLine();

                        System.out.println("Insira o STATUS DA MISSÃO do Ninja:");
                        novo_ninja.status_missao = scanner.nextLine();

                        System.out.println("Insira a HABILIDADE do Ninja:");
                        novo_ninja.habilidade_especial = scanner.nextLine();
                    }
                    break;

                case 2: //modificar habilidade
                    System.out.println("Qual Ninja deseja modificar?");
                    for (int i = 0; i < uchihas.length; i++) {
                        if (uchihas[i] != null) {
                            System.out.print(i + " - ");  uchihas[i].mostrar_nom();
                        }else {
                            System.out.println("Nenhum ninja Cadastrado");
                        }
                    }
                    casos = scanner.nextInt();
                    if (casos >= 0 && casos < numero_max_ninjas && uchihas[casos] != null) {
                        System.out.println("Qual a nova habilidade do Ninja?");
                        scanner.nextLine();
                        uchihas[casos].habilidade_especial = scanner.nextLine();
                        System.out.println("Habilidade modificada com sucesso");
                        }
                    else {
                        System.out.println("Insira um Ninja valido");
                    }
                    break;

                case 3: //mostrar ninja
                    System.out.println("Esse são os Ninjas Cadastrados");
                    for (int i = 0; i < uchihas.length; i++) {
                        if (uchihas[i] != null){
                            uchihas[i].mostrar_inf();
                        }
                    }
                    break;

                case 4: //encerrar
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Insira uma opção Valida!");
                    break;

            }












        }







//        uchiha Sasuke = new uchiha();
//        Sasuke.nome = "Sasuke Uchiha";
//        Sasuke.idade = 18;
//        Sasuke.missao = "Quebrar arvore";
//        Sasuke.nivel_missao = "SS";
//        Sasuke.status_missao = "Em andamento";
//        Sasuke.mostrar_inf();
















        scanner.close();
    }
}
