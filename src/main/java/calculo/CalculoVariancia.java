package calculo;
import java.util.ArrayList;

public class CalculoVariancia extends AbstractMetodoCalculo{

    public CalculoVariancia(){
        this.setOpcao(4);
    }
    
    @Override
    public double calcular(ArrayList<Double> numeros) {
        double p1 = 1 / Double.valueOf(numeros.size() - 1);
        double somaAoQuadrado = 0;
        for (int counter = 0; counter < numeros.size(); counter++) {
            somaAoQuadrado += Math.pow(numeros.get(counter), 2);
        }
        double soma = 0;
        for (int counter = 0; counter < numeros.size(); counter++) {
            soma += numeros.get(counter);
        }
        double p2 = somaAoQuadrado - (Math.pow(soma, 2) / Double.valueOf(numeros.size()));
        return p1 * p2;
    }
    
}
