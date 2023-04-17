package services.calculoEstatistico;
import model.IDado;
import model.Resultado;

public class QuantidadeElementos implements IOperacao{

    @Override
    public void calcular(IDado dados) {
        dados.addResultados(new Resultado("Quantidade de elementos", dados.getDados().size())); 
    } 
}
