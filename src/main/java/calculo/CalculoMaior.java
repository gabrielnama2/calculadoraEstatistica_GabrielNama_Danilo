package calculo;
import java.util.ArrayList;
import java.util.Collections;

public class CalculoMaior extends AbstractMetodoCalculo{

    public CalculoMaior(int opcao){
        //Construtor da classe pai
        super(opcao);
    }
    
    @Override
    public double calcular(ArrayList<Double> numeros) {
        return Collections.max(numeros);
    }
    
}
