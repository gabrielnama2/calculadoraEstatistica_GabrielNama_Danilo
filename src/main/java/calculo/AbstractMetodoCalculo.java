package calculo;
import java.util.ArrayList;

public abstract class AbstractMetodoCalculo {
    private int opcao;
    
    public AbstractMetodoCalculo(int opcao){
        this.setOpcao(opcao);
    }
    
     public int getOpcao() {
        return opcao;
    }
    
    public void setOpcao(int opcao){
        this.opcao = opcao;
    }
    
    public double calcular(ArrayList<Double> numeros){
        return 0;
    }
}
