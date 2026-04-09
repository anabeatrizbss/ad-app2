// Aluno(os): Nome Sobrenome e Nome Sobrenome

package model;

public class Personagem {

    private String nome;
    private String classe;
    private double vida;

    public Personagem(String nome, String classe, double vida) {
        this.nome = nome;
        this.classe = classe;
        if (vida < 0) {
            this.vida = 0.00;
        } else {
            this.vida = vida;
        }
    }

    public void curar(double valor) {
        if (valor > 0) {
            this.vida += valor;
        } else {
            System.out.println("Valor de cura inválido.");
        }
    }

    public void recDano(double valor) {
        if (valor > 0 && this.vida >= valor) {
            this.vida -= valor;
        } else {
            System.out.println("Vida insuficiente para receber o dano.");
        }
    }

    public double getVida() {
        return this.vida;
    }

    @Override
    public String toString() {
        return "Personagem: " + nome + " | Classe: " + classe + " | Vida: " + String.format("%.2f", vida);
    }
}
