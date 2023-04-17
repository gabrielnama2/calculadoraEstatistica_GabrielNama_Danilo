package services.calculoEstatistico;
import model.IDado;
import model.Resultado;

public class MediaOperacao implements IOperacao{
    
    @Override
    public void calcular(IDado dados) {
        double total = 0;
        for (int i = 0; i < dados.getDados().size(); i++) {
            total += dados.getDados().get(i);
        }
        double resultado = total / dados.getDados().size();
        ////Adiciona um novo Resultado a lista de resultados de dadosPeso
        dados.addResultados(new Resultado("Média", resultado));
    }
    
}
