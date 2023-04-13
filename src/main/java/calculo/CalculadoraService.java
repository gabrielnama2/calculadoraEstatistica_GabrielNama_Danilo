package calculo;
import java.util.ArrayList;

public class CalculadoraService {
    private ArrayList<AbstractMetodoCalculo> todosCalculos;
    
    public CalculadoraService(){
        this.todosCalculos = new ArrayList<>();
        this.todosCalculos.add(new CalculoDesvioPadrao());
        this.todosCalculos.add(new CalculoMaior());
        this.todosCalculos.add(new CalculoMedia());
        this.todosCalculos.add(new CalculoMenor());
        this.todosCalculos.add(new CalculoSomatorio());
        this.todosCalculos.add(new CalculoVariancia());
    }
    
    public double calcular(int opcao, ArrayList<Double> numeros) {
        double resultado = 0;
        
        for(int i=0; i<this.todosCalculos.size(); i++){
            if(opcao == this.todosCalculos.get(i).getOpcao()){
                resultado += this.todosCalculos.get(i).calcular(numeros);
            }
        }
        return resultado;
    }
}
