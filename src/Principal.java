import java.net.URI;
import java.net.URISyntaxException;

public class Principal {
    public static void main(String[] args) {
        ProcessarBoletos processarBoletos = new ProcessarBoletos(new LeituraRetornoBancoBrasil());

        try {
            System.out.println("------------------ BANCO DO BRASIL --------------------------");
            processarBoletos.processar(new URI("file:/C:/Users/lucas/IdeaProjects/design-patter-strategy-atividade/src/banco-brasil-1.csv"));
            processarBoletos = new ProcessarBoletos(new LeituraRetornoBradesco());
            System.out.println("------------------ BRADESCO --------------------------");
            processarBoletos.processar(new URI("file:/C:/Users/lucas/IdeaProjects/design-patter-strategy-atividade/src/bradesco-1.csv"));
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}
