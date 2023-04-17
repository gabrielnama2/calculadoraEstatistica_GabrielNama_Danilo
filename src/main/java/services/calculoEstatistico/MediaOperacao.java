package services.calculoEstatistico;
import model.DadosPeso;
import model.Resultado;

public class MediaOperacao implements IOperacao{
    
    @Override
    public void calcular(DadosPeso dadosPeso) {
        double total = 0;
        for (int i = 0; i < dadosPeso.getPesos().size(); i++) {
            total += dadosPeso.getPesos().get(i);
        }
        double resultado = total / dadosPeso.getPesos().size();
        ////Adiciona um novo Resultado a lista de resultados de dadosPeso
        dadosPeso.addResultados(new Resultado("Média", resultado));
    }
    
}
