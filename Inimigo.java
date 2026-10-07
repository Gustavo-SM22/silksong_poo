import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Inimigo {

    private String nome;
    private int vida;
    private int dano;

    public Inimigo(String nome, int vida, int dano) {
        this.nome = nome;

        if (vida >= 1 && vida <= 20) {
            this.vida = vida;
        } else {
            this.vida = 10;
        }

        if (dano >= 1 && dano <= 2) {
            this.dano = dano;
        } else {
            this.dano = 1;
        }
    }

    public Inimigo(String nome) {
        this(nome, 10, 1);
    }

    public void receberGolpe() {
        if (vida > 0) {
            vida = vida - 1;
        }

        System.out.println(nome + " recebeu 1 de dano.");
    }

    public boolean estaDerrotado() {
        if (vida == 0) {
            return true;
        } else {
            return false;
        }
    }
}