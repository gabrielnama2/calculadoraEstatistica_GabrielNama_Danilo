package services.calculoEstatistico;
import model.DadosPeso;
import model.Resultado;

public class VarianciaOperacao implements IOperacao{
    
    @Override
    public void calcular(DadosPeso dadosPeso) {
        double p1 = 1 / Double.valueOf(dadosPeso.getPesos().size() - 1);
        double somaAoQuadrado = 0;
        for (int counter = 0; counter < dadosPeso.getPesos().size(); counter++) {
            somaAoQuadrado += Math.pow(dadosPeso.getPesos().get(counter), 2);
        }
        double soma = 0;
        for (int counter = 0; counter < dadosPeso.getPesos().size(); counter++) {
            soma += dadosPeso.getPesos().get(counter);
        }
        double p2 = somaAoQuadrado - (Math.pow(soma, 2) / Double.valueOf(dadosPeso.getPesos().size()));
        double resultado = p1 * p2;
        //Adiciona um novo Resultado a lista de resultados de dadosPeso
        dadosPeso.addResultados(new Resultado("Variância", resultado));
    }
    
}
