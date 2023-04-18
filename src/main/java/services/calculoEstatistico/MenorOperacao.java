package services.calculoEstatistico;
import java.util.Collections;
import model.IDado;
import model.Resultado;

public class MenorOperacao implements IOperacao{
    
    @Override
    public void calcular(IDado dados) {
        double resultado = Collections.min(dados.getDados());
        //Adiciona um novo Resultado a lista de resultados de dadosPeso
        dados.addResultados(new Resultado("Menor", resultado));
    }
    
}
