package services.calculoEstatistico;
import model.IDado;
import model.Resultado;

public class SomatorioOperacao implements IOperacao{
    
    @Override
    public void calcular(IDado dados) {
        double soma = 0;
        for (int counter = 0; counter < dados.getDados().size(); counter++) {
            soma += dados.getDados().get(counter);
        }
        //Adiciona um novo Resultado a lista de resultados de dadosPeso
        dados.addResultados(new Resultado("Somatório", soma));
    }
    
}
