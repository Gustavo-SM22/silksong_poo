import lombok.Getter;

@Getter 
public class Heroina {
    private String Nome;
    private int Mascaras = 5;
    private int Seda = 0;

    public Heroina(String Nome) {
        this.Nome = Nome;
        this.Mascaras = 5;
        this.Seda = 0;
    }
    
    public void atacar() {
        System.out.println(Nome + " ataca com a agulha!");
        Seda = Math.min(Seda + 1, 9);
    }

    public void atacar(int vezes) {
        for (int i = 0; i < vezes; i++) {
            atacar();
        }
    }

    public void receberDano(int dano) {
        Mascaras = Math.max(Mascaras - dano, 0);
        System.out.println(Nome + " recebeu " + dano + " de dano.");
    }

    public void curar() {
        if (Seda == 9) {
            Mascaras = Math.min(Mascaras + 3, 5);
            Seda = 0;
            System.out.println(Nome + " se amarrou com seda e recuperou mascaras.");
        } else {
            System.out.println(Nome + " nao tem seda suficiente para se curar.");
        }
    }

    public boolean estaDerrotada() {
        if (Mascaras == 0) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return Nome + " | Mascaras: " + Mascaras + "/5 | Seda: " + Seda + "/9";
    }
}