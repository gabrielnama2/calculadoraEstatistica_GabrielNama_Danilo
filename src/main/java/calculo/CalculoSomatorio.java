package calculo;
import java.util.ArrayList;

public class CalculoSomatorio extends AbstractMetodoCalculo{
    
    public CalculoSomatorio(){
        this.setOpcao(1);
    }
    
    @Override
    public double calcular(ArrayList<Double> numeros) {
        double soma = 0;
        for (int counter = 0; counter < numeros.size(); counter++) {
            soma += numeros.get(counter);
        }
        return soma;
    }
    
}
