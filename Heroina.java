public class Heroina {
    private String Nome;
    private int Mascaras = 5;   
    private int Seda = 0;

    public Heroina(String Nome) {
        this.Nome = Nome;
        this.Mascaras = 5;
        this.Seda = 0;
    }
    public String GetNome() {
        return Nome;
    }
    public int GetMascaras() {
        return Mascaras;
    }
    public int GetSeda() {
        return Seda;
    }
    public String toString() {
        return Nome + " | Mascaras: " + Mascaras + "/5 | Seda: " + Seda + "/9";
    }
}