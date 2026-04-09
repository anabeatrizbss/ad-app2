package app;

import model.Personagem;

public class Main {
    public static void main(String[] args) {
        Personagem p1 = new Personagem("Arthas", "Guerreiro", 1000.00);
        System.out.println(p1);

        p1.curar(500.00);
        System.out.println("Após cura de 500: " + p1.getVida());

        p1.curar(-100.00);

        p1.recDano(200.00);
        System.out.println("Após dano de 200: " + p1.getVida());

        p1.recDano(5000.00);

        Personagem p2 = new Personagem("Zara", "Maga", -500.00);
        System.out.println(p2);
    }
}
