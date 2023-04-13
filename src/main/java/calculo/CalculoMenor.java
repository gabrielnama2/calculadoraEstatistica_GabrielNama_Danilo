package calculo;
import java.util.ArrayList;
import java.util.Collections;

public class CalculoMenor extends AbstractMetodoCalculo{

    public CalculoMenor(int opcao){
        //Construtor da classe pai
        super(opcao);
    }
    
    @Override
    public double calcular(ArrayList<Double> numeros) {
        return Collections.min(numeros);
    }
    
}
