package Desafios.Desafio1;

public class Desafio1 {
    public static void main(String[] args) {


        //Ninja 1
        String Ninja1 = "Naruto";
        int idadeninja1 = 24;
        String nomemissaoninja1 = "Destruir a Akatsuki";
        char missaoninja1 = 'S' ;
        String statusDamissao1 = "Em andamento";

        //condicional de status de missão
        if(idadeninja1 < 15) {
            if (missaoninja1 == 'C' || missaoninja1 == 'D'){
                statusDamissao1 = "Missão Concluida";
            } else{
                statusDamissao1 = "Missão não Concluida idade insuficiente";
            }
        } else {
            statusDamissao1 = "Missão Concluida";
        }

        System.out.println("Seu nome é: " + Ninja1);
        System.out.println("Sua idade é: " + idadeninja1);
        System.out.println("O nome de sua missão é: " + nomemissaoninja1);
        System.out.println("O Rank de sua missão é: " + missaoninja1);
        System.out.println("O Status da missão é: " + statusDamissao1);

        System.out.println("-------------------------------------------");


        // Ninja 2
        String Ninja2 = "Sasuke";
        int idadeninja2 = 12;
        String nomemissaoninja2 = "Lutar contra bandidos";
        char missaoninja2 = 'A' ;
        String statusDamissao2 = "Em andamento";

        //condicional de status de missão
        if(idadeninja2 < 15) {
            if (missaoninja2 == 'C' || missaoninja2 == 'D'){
                statusDamissao2 = "Missão Concluida";
            } else{
                statusDamissao2 = "Missão não Concluida idade insuficiente";
            }
        } else {
            statusDamissao2 = "Missão Concluida";
        }
            System.out.println("Seu nome é: " + Ninja2);
            System.out.println("Sua idade é: " + idadeninja2);
            System.out.println("O nome de sua missão é: " + nomemissaoninja2);
            System.out.println("O Rank de sua missão é: " + missaoninja2);
            System.out.println("O Status da missão é: " + statusDamissao2);

            System.out.println("-------------------------------------------");


            //Ninja3
            String Ninja3 = "Sakura";
            int idadeninja3 = 14;
            String nomemissaoninja3 = "Encontrar gato desaparecido";
            char missaoninja3 = 'D';
            String statusDamissao3 = "Em andamento";

        //condicional de status de missão
        if (idadeninja3 < 15) {
                if (missaoninja3 == 'C' || missaoninja3 == 'D') {
                    statusDamissao3 = "Missão Concluida";
                } else {
                    statusDamissao3 = "Missão não Concluida idade insuficiente";
                }
            } else {
                statusDamissao3 = "Missão Concluida";
            }
                System.out.println("Seu nome é: " + Ninja3);
                System.out.println("Sua idade é: " + idadeninja3);
                System.out.println("O nome de sua missão é: " + nomemissaoninja3);
                System.out.println("O Rank de sua missão é: " + missaoninja3);
                System.out.println("O Status da missão é: " + statusDamissao3);
            }

        }