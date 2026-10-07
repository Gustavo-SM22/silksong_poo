import javax.swing.JOptionPane;

public class Jogo {
    
    public static void main(String[] args) {
        System.out.println("===============================");
        System.out.println("    HOLLOW KNIGHT: SILKSONG    ");
        System.out.println("       edicao POO em Java      ");
        System.out.println("===============================");
        
        String nome = JOptionPane.showInputDialog("Digite o nome do jogador:");

        System.out.println("Carregando save de " + nome + "...");
        Heroina heroina = new Heroina("Hornet");
        System.out.println(heroina);
    }

}
