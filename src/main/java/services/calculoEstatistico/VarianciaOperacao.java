package services.calculoEstatistico;
import model.IDado;
import model.Resultado;

public class VarianciaOperacao implements IOperacao{
    
    @Override
    public void calcular(IDado dados) {
        double p1 = 1 / Double.valueOf(dados.getDados().size() - 1);
        double somaAoQuadrado = 0;
        for (int counter = 0; counter < dados.getDados().size(); counter++) {
            somaAoQuadrado += Math.pow(dados.getDados().get(counter), 2);
        }
        double soma = 0;
        for (int counter = 0; counter < dados.getDados().size(); counter++) {
            soma += dados.getDados().get(counter);
        }
        double p2 = somaAoQuadrado - (Math.pow(soma, 2) / Double.valueOf(dados.getDados().size()));
        double resultado = p1 * p2;
        //Adiciona um novo Resultado a lista de resultados de dadosPeso
        dados.addResultados(new Resultado("Variância", resultado));
    }
    
}
