package Desafios.Desafio4;

public class main {
    public static void main(String[] args) {

Ninja_Basico Minato = new Ninja_Basico("Minato Namikaze",35,"Teleporte", Tipo_habilidade.NINJUTSU);
        Minato.mostrar_informacoes();
        Minato.executar_habilidade();
        System.out.println(" ");

Ninja_Avancado Lee = new Ninja_Avancado("Rock Lee", 17, "Furacão da Folha", "Taijutsu", Tipo_habilidade.TAIJUTSU);
        Lee.mostrar_informacoes();
        Lee.executar_habilidade();
        Lee.setEspecialidade();
        System.out.println(" ");

Ninja_Avancado Naruto = new Ninja_Avancado("Naruto Uzumaki", 18, "Rasengan", "Ninjutsu", Tipo_habilidade.NINJUTSU);
        Naruto.mostrar_informacoes();
        Naruto.executar_habilidade();
        Naruto.setEspecialidade();
        System.out.println(" ");

Ninja_Avancado Sasuke = new Ninja_Avancado("Sasuke Uchiha", 17, "Bola de Fogo", "Katon", Tipo_habilidade.KATON);
        Sasuke.mostrar_informacoes();
        Sasuke.executar_habilidade();
        Sasuke.setEspecialidade();
        System.out.println(" ");

Ninja_Avancado Itachi = new Ninja_Avancado("Itachi Uchiha", 25, "Tsukuyumi", "Genjutsu", Tipo_habilidade.GENJUTSU);
        Itachi.mostrar_informacoes();
        Itachi.executar_habilidade();
        Itachi.setEspecialidade();
        System.out.println(" ");

Ninja_Avancado Nagato = new Ninja_Avancado("Nagato Uzumaki", 36, "Chibaku tensei", "Rinnegan", Tipo_habilidade.RINNEGAN);
        Nagato.mostrar_informacoes();
        Nagato.executar_habilidade();
        Nagato.setEspecialidade();
        System.out.println(" ");

    }
}
