package services.calculoEstatistico;
import java.util.ArrayList;
import model.IDado;

public class CalculadoraEstatisticaService implements ICalculadora{
    private ArrayList<IOperacao> todosCalculos;
    
    public CalculadoraEstatisticaService(){
        this.todosCalculos = new ArrayList();
        this.todosCalculos.add(new DesvioPadraoOperacao());
        this.todosCalculos.add(new MaiorOperacao());
        this.todosCalculos.add(new MediaOperacao());
        this.todosCalculos.add(new MenorOperacao());
        this.todosCalculos.add(new QuantidadeElementos());
        this.todosCalculos.add(new SomatorioOperacao());
        this.todosCalculos.add(new VarianciaOperacao());
    }
    
    @Override
    public void calcular(IDado dados) {
        for(int i=0; i<this.todosCalculos.size(); i++){
            this.todosCalculos.get(i).calcular(dados);
        }  
    }
}
