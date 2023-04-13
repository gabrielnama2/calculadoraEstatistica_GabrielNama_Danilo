package calculo;
import java.util.ArrayList;

public class CalculoMedia extends AbstractMetodoCalculo{

    public CalculoMedia(){
        this.setOpcao(0);
    }
    @Override
    public double calcular(ArrayList<Double> numeros) {
        double total = 0;
        for (int i = 0; i < numeros.size(); i++) {
            total += numeros.get(i);
        }
        return total / numeros.size();
    }
    
}
