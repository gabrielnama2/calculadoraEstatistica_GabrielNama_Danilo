package services.calculoEstatistico;
import model.DadosPeso;
import model.Resultado;

public class SomatorioOperacao implements IOperacao{
    
    @Override
    public void calcular(DadosPeso dadosPeso) {
        double soma = 0;
        for (int counter = 0; counter < dadosPeso.getPesos().size(); counter++) {
            soma += dadosPeso.getPesos().get(counter);
        }
        //Adiciona um novo Resultado a lista de resultados de dadosPeso
        dadosPeso.addResultados(new Resultado("Somatório", soma));
    }
    
}
