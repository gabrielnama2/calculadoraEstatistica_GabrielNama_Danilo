package calculo;
import java.util.ArrayList;

public class CalculadoraService {
    private ArrayList<AbstractMetodoCalculo> todosCalculos;
    
    public CalculadoraService(){
        this.todosCalculos = new ArrayList<>();
        this.todosCalculos.add(new CalculoDesvioPadrao(5));
        this.todosCalculos.add(new CalculoMaior(2));
        this.todosCalculos.add(new CalculoMedia(0));
        this.todosCalculos.add(new CalculoMenor(3));
        this.todosCalculos.add(new CalculoSomatorio(1));
        this.todosCalculos.add(new CalculoVariancia(4));
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
