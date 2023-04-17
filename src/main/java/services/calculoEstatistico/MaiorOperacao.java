package services.calculoEstatistico;
import java.util.Collections;
import model.DadosPeso;
import model.Resultado;

public class MaiorOperacao implements IOperacao{
    
    @Override
    public void calcular(DadosPeso dadosPeso) {
        double resultado = Collections.max(dadosPeso.getPesos());
        //Adiciona um novo Resultado a lista de resultados de dadosPeso
        dadosPeso.addResultados(new Resultado("Maior Operação", resultado));
    }
    
}
