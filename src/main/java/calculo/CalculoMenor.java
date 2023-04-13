package calculo;
import java.util.ArrayList;
import java.util.Collections;

public class CalculoMenor extends AbstractMetodoCalculo{

    public CalculoMenor(){
        this.setOpcao(3);
    }
    
    @Override
    public double calcular(ArrayList<Double> numeros) {
        return Collections.min(numeros);
    }
    
}
