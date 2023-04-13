package calculo;
import java.util.ArrayList;
import java.util.Collections;

public class CalculoMaior extends AbstractMetodoCalculo{

    public CalculoMaior(){
        this.setOpcao(2);
    }
    @Override
    public double calcular(ArrayList<Double> numeros) {
        return Collections.max(numeros);
    }
    
}
