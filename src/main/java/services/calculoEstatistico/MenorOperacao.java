package services.calculoEstatistico;
import java.util.Collections;
import model.DadosPeso;
import model.Resultado;

public class MenorOperacao implements IOperacao{
    
    @Override
    public void calcular(DadosPeso dadosPeso) {
        double resultado = Collections.min(dadosPeso.getPesos());
        //Adiciona um novo Resultado a lista de resultados de dadosPeso
        dadosPeso.addResultados(new Resultado("Menor", resultado));
    }
    
}
