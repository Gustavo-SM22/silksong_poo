public class TesteInimigo {
    public static void main(String[] args) {
        Inimigo mossMother = new Inimigo("Moss Mother", 12, 1);
        Inimigo besouroPeregrino = new Inimigo("Besouro Peregrino");
        Inimigo inimigoBugado = new Inimigo("Inimigo Bugado", 50, 7);
        System.out.println(mossMother);
        System.out.println(besouroPeregrino);
        System.out.println(inimigoBugado);

        while (!besouroPeregrino.estaDerrotado()) {
            besouroPeregrino.receberGolpe();
        }
        
        System.out.println(besouroPeregrino);
        System.out.println("Derrotado? " + besouroPeregrino.estaDerrotado());
    }
}